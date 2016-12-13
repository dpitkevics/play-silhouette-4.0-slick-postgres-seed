package models.daos

import javax.inject.Inject

import com.mohiva.play.silhouette.api.LoginInfo
import com.mohiva.play.silhouette.api.util.PasswordInfo
import com.mohiva.play.silhouette.persistence.daos.DelegableAuthInfoDAO
import models.daos.PasswordInfoDAO._
import models.tables.{ DbPasswordInfo, PasswordInfoTable }
import play.api.db.slick.DatabaseConfigProvider
import slick.backend.DatabaseConfig
import slick.driver.JdbcProfile
import slick.jdbc.JdbcBackend
import slick.lifted.TableQuery

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class PasswordInfoDAO @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  userDAO: UserDAO) extends DelegableAuthInfoDAO[PasswordInfo] {

  val dbConfig: DatabaseConfig[JdbcProfile] = dbConfigProvider.get[JdbcProfile]
  val db: JdbcBackend#DatabaseDef = dbConfig.db

  import dbConfig.driver.api._

  def passwordInfoQuery(loginInfo: LoginInfo): Query[PasswordInfoTable, DbPasswordInfo, Seq] = {
    for {
      dbLoginInfo <- userDAO.loginInfoQuery(loginInfo)
      dbPasswordInfo <- passwordInfos.filter(_.loginInfoId === dbLoginInfo.id)
    } yield dbPasswordInfo
  }

  def find(loginInfo: LoginInfo): Future[Option[PasswordInfo]] = {
    db.run(passwordInfoQuery(loginInfo).result.headOption).map { dbPasswordInfoOption =>
      dbPasswordInfoOption.map {
        dbPasswordInfo => PasswordInfo(dbPasswordInfo.hasher, dbPasswordInfo.password, dbPasswordInfo.salt)
      }
    }
  }

  def add(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = {
    db.run(userDAO.loginInfoQuery(loginInfo).result.headOption.map { dbLoginInfoOption =>
      dbLoginInfoOption.map {
        dbLoginInfo =>
          {
            val dbPasswordInfo = DbPasswordInfo(authInfo.hasher, authInfo.password, authInfo.salt, dbLoginInfo.id.get)
            db.run(passwordInfos += dbPasswordInfo)
          }
      }
    }).map { _ =>
      authInfo
    }
  }

  def update(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = {
    db.run(userDAO.loginInfoQuery(loginInfo).result.headOption.map { dbLoginInfoOption =>
      dbLoginInfoOption.map {
        dbLoginInfo =>
          {
            val dbPasswordInfo = DbPasswordInfo(authInfo.hasher, authInfo.password, authInfo.salt, dbLoginInfo.id.get)
            db.run(passwordInfoQuery(loginInfo).update(dbPasswordInfo).transactionally)
          }
      }
    }).map { _ =>
      authInfo
    }
  }

  def save(loginInfo: LoginInfo, authInfo: PasswordInfo): Future[PasswordInfo] = {
    db.run(userDAO.loginInfoQuery(loginInfo).result.headOption.map { dbLoginInfoOption =>
      dbLoginInfoOption.map {
        dbLoginInfo =>
          {
            val dbPasswordInfo = DbPasswordInfo(authInfo.hasher, authInfo.password, authInfo.salt, dbLoginInfo.id.get)
            db.run(passwordInfoQuery(loginInfo).insertOrUpdate(dbPasswordInfo).transactionally)
          }
      }
    }).map { _ =>
      authInfo
    }
  }

  def remove(loginInfo: LoginInfo): Future[Unit] = {
    db.run(passwordInfoQuery(loginInfo).delete).map(_ => Unit)
  }
}

object PasswordInfoDAO {

  private val passwordInfos = TableQuery[PasswordInfoTable]

}

