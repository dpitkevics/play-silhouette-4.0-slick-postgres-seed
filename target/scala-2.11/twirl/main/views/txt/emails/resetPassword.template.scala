
package views.txt.emails

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object resetPassword_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.txt._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class resetPassword extends BaseScalaTemplate[play.twirl.api.TxtFormat.Appendable, Format[play.twirl.api.TxtFormat.Appendable]](play.twirl.api.TxtFormat) with play.twirl.api.Template3[User, String, Messages, play.twirl.api.TxtFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: User, url: String)(implicit messages: Messages): play.twirl.api.TxtFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.56*/ ("""
"""), _display_( /*2.2*/ messages("email.reset.password.hello", user.name.getOrElse("user"))), format.raw /*2.69*/ ("""

"""), _display_( /*4.2*/ messages("email.reset.password.txt.text", url)), format.raw /*4.48*/ ("""
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
object resetPassword extends resetPassword_Scope0.resetPassword
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/emails/resetPassword.scala.txt
                  HASH: d9bc66c195221612561b32ad7d67800971d4d2e3
                  MATRIX: 558->1|706->55|733->57|820->124|848->127|914->173
                  LINES: 20->1|25->1|26->2|26->2|28->4|28->4
                  -- GENERATED --
              */
