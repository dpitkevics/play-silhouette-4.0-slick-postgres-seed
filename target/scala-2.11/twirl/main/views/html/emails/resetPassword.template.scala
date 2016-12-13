
package views.html.emails

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object resetPassword_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class resetPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User, String, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: User, url: String)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.56*/ ("""

"""), format.raw /*3.1*/ ("""<html>
    <body>
        <p>"""), _display_( /*5.13*/ messages("email.reset.password.hello", user.name.getOrElse("user"))), format.raw /*5.80*/ ("""</p>
        <p>"""), _display_( /*6.13*/ Html(messages("email.reset.password.html.text", url))), format.raw /*6.66*/ ("""</p>
    </body>
</html>
"""))
        }
      }
    }

    def render(user: User, url: String, messages: Messages): play.twirl.api.HtmlFormat.Appendable = apply(user, url)(messages)

    def f: ((User, String) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (user, url) => (messages) => apply(user, url)(messages)

    def ref: this.type = this

  }

}

/**/
object resetPassword extends resetPassword_Scope0.resetPassword
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/emails/resetPassword.scala.html
                  HASH: e823eb826573ad0d5ddb3819f89e422dd69bf39a
                  MATRIX: 564->1|713->55|741->57|797->87|884->154|927->171|1000->224
                  LINES: 20->1|25->1|27->3|29->5|29->5|30->6|30->6
                  -- GENERATED --
              */
