package models.daos

import java.util.UUID
import javax.inject.Inject

import com.mohiva.play.silhouette.api.LoginInfo
import models.User
import models.daos.UserDAOImpl._
import models.tables._
import play.api.db.slick.DatabaseConfigProvider
import slick.backend.DatabaseConfig
import slick.driver.JdbcProfile
import slick.jdbc.JdbcBackend
import slick.lifted.TableQuery

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * Give access to the user object.
 */
class UserDAOImpl @Inject() (protected val dbConfigProvider: DatabaseConfigProvider) extends UserDAO {

  val dbConfig: DatabaseConfig[JdbcProfile] = dbConfigProvider.get[JdbcProfile]
  val db: JdbcBackend#DatabaseDef = dbConfig.db

  import dbConfig.driver.api._

  def loginInfoQuery(loginInfo: LoginInfo): Query[LoginInfoTable, DbLoginInfo, Seq] = {
    loginInfos.filter(dbLoginInfo => dbLoginInfo.providerId === loginInfo.providerID && dbLoginInfo.providerKey === loginInfo.providerKey)
  }

  /**
   * Finds a user by its login info.
   *
   * @param loginInfo The login info of the user to find.
   * @return The found user or None if no user for the given login info could be found.
   */
  def find(loginInfo: LoginInfo): Future[Option[User]] = {
    val userQuery = for {
      dbLoginInfo <- loginInfoQuery(loginInfo)
      dbUserLoginInfo <- userLoginInfos.filter(_.loginInfoId === dbLoginInfo.id)
      dbUser <- users.filter(_.userID === dbUserLoginInfo.userId)
    } yield dbUser

    db.run(userQuery.result.headOption).map { dbUserOption =>
      dbUserOption.map {
        user => User(UUID.fromString(user.userID), loginInfo, user.firstName, user.lastName, user.fullName, user.email, user.avatarUrl, user.activated)
      }
    }
  }

  /**
   * Finds a user by its user ID.
   *
   * @param userID The ID of the user to find.
   * @return The found user or None if no user for the given ID could be found.
   */
  def find(userID: UUID): Future[Option[User]] = {
    {
      val userQuery = for {
        dbUser <- users.filter(_.userID === userID.toString)
        dbUserLoginInfo <- userLoginInfos.filter(_.userId === dbUser.userID)
        dbLoginInfo <- loginInfos.filter(_.id === dbUserLoginInfo.loginInfoId)
      } yield (dbUser, dbLoginInfo)

      db.run(userQuery.result.headOption).map { resultOption =>
        resultOption.map {
          case (user, loginInfo) => User(
            UUID.fromString(user.userID),
            LoginInfo(loginInfo.providerId, loginInfo.providerKey),
            user.firstName,
            user.lastName,
            user.fullName,
            user.email,
            user.avatarUrl,
            user.activated
          )
        }
      }
    }
  }

  /**
   * Saves a user.
   *
   * @param user The user to save.
   * @return The saved user.
   */
  def save(user: User): Future[User] = {
    val dbUser = DbUser(user.userID.toString, user.firstName, user.lastName, user.fullName, user.email, user.avatarURL, user.activated)
    val dbLoginInfo = DbLoginInfo(None, user.loginInfo.providerID, user.loginInfo.providerKey)

    val loginInfoAction = {
      val retrieveLoginInfo = loginInfos.filter(
        info => info.providerId === user.loginInfo.providerID &&
          info.providerKey === user.loginInfo.providerKey
      ).result.headOption

      val insertLoginInfo = loginInfos.returning(loginInfos.map(_.id)).
        into((info, id) => info.copy(id)) += dbLoginInfo

      for {
        loginInfoOption <- retrieveLoginInfo
        loginInfo <- loginInfoOption.map(DBIO.successful).getOrElse(insertLoginInfo)
      } yield loginInfo
    }

    val actions = (for {
      _ <- users.insertOrUpdate(dbUser)
      loginInfo <- loginInfoAction
      _ <- userLoginInfos += DbUserLoginInfo(dbUser.userID, loginInfo.id.get)
    } yield ()).transactionally

    db.run(actions).map(_ => user)
  }
}

/**
 * The companion object.
 */
object UserDAOImpl {

  private val loginInfos = TableQuery[LoginInfoTable]
  private val users = TableQuery[UserTable]
  private var userLoginInfos = TableQuery[UserLoginInfoTable]

}
