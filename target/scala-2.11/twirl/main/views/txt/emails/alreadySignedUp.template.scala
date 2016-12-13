
package views.txt.emails

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object alreadySignedUp_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.txt._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class alreadySignedUp extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable, Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template3[User, String, Messages, play.twirl.api.TxtFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: User, url: String)(implicit messages: Messages): play.twirl.api.TxtFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.56*/ ("""
"""), _display_( /*2.2*/ messages("email.already.signed.up.hello", user.name.getOrElse("user"))), format.raw /*2.72*/ ("""

"""), _display_( /*4.2*/ messages("email.already.signed.up.txt.text", url)), format.raw /*4.51*/ ("""
"""))
        }
      }
    }

    def render(user: User, url: String, messages: Messages): play.twirl.api.TxtFormat.Appendable = apply(user, url)(messages)

    def f: ((User, String) => (Messages) => play.twirl.api.TxtFormat.Appendable) = (user, url) => (messages) => apply(user, url)(messages)

    def ref: this.type = this

  }

}

/**/
object alreadySignedUp extends alreadySignedUp_Scope0.alreadySignedUp
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/emails/alreadySignedUp.scala.txt
                  HASH: b05e35a775de5b3f390f7ce5ad57d0a4270143d5
                  MATRIX: 562->1|710->55|737->57|827->127|855->130|924->179
                  LINES: 20->1|25->1|26->2|26->2|28->4|28->4
                  -- GENERATED --
              */
