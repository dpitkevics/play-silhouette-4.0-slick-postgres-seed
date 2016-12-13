
package views.html.emails

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object alreadySignedUp_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class alreadySignedUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[User, String, Messages, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: User, url: String)(implicit messages: Messages): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.56*/ ("""

"""), format.raw /*3.1*/ ("""<html>
    <body>
        <p>"""), _display_( /*5.13*/ messages("email.already.signed.up.hello", user.name.getOrElse("user"))), format.raw /*5.83*/ ("""</p>
        <p>"""), _display_( /*6.13*/ Html(messages("email.already.signed.up.html.text", url))), format.raw /*6.69*/ ("""</p>
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
object alreadySignedUp extends alreadySignedUp_Scope0.alreadySignedUp
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/emails/alreadySignedUp.scala.html
                  HASH: 7ca500dc31de6fe231ce75a5e14da69b9a33d97d
                  MATRIX: 568->1|717->55|745->57|801->87|891->157|934->174|1010->230
                  LINES: 20->1|25->1|27->3|29->5|29->5|30->6|30->6
                  -- GENERATED --
              */
