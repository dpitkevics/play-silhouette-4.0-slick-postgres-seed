
package views.html.emails

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object activateAccount_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class activateAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User, String, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: User, url: String)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.56*/ ("""

"""), format.raw /*3.1*/ ("""<html>
    <body>
        <p>"""), _display_( /*5.13*/ messages("email.activate.account.hello", user.name.getOrElse("user"))), format.raw /*5.82*/ ("""</p>
        <p>"""), _display_( /*6.13*/ Html(messages("email.activate.account.html.text", url))), format.raw /*6.68*/ ("""</p>
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
object activateAccount extends activateAccount_Scope0.activateAccount
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/emails/activateAccount.scala.html
                  HASH: eb1b6bda28a50722fa4c65d85cd1b5b93dce5606
                  MATRIX: 568->1|717->55|745->57|801->87|890->156|933->173|1008->228
                  LINES: 20->1|25->1|27->3|29->5|29->5|30->6|30->6
                  -- GENERATED --
              */
