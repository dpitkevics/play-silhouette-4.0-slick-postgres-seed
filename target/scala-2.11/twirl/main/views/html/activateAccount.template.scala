
package views.html

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

  class activateAccount extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String, RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (email: String)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.98*/ ("""

"""), _display_( /*3.2*/ main(Messages("activate.account.title")) /*3.42*/ {
            _display_(Seq[Any](format.raw /*3.44*/ ("""
    """), format.raw /*4.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*5.18*/ Messages("activate.account")), format.raw /*5.46*/ ("""</legend>
        <div class="info">
            <p>"""), _display_( /*7.17*/ Messages("activate.account.text1")), format.raw /*7.51*/ ("""</p>
            <p><b>"""), _display_( /*8.20*/ email), format.raw /*8.25*/ ("""</b></p>
            <p>"""), _display_( /*9.17*/ Messages("activate.account.text2")), format.raw /*9.51*/ ("""</p>
            <p>"""), _display_( /*10.17*/ Html(Messages("activate.account.text3", routes.ActivateAccountController.send(helper.urlEncode(email))))), format.raw /*10.121*/ ("""</p>
        </div>
    </fieldset>
""")))
          }), format.raw /*13.2*/ ("""
"""))
        }
      }
    }

    def render(email: String, request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(email)(request, messages, webJarAssets)

    def f: ((String) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (email) => (request, messages, webJarAssets) => apply(email)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object activateAccount extends activateAccount_Scope0.activateAccount
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/activateAccount.scala.html
                  HASH: 2e93743bbf4c36d281e93e242a2e313aec52c90f
                  MATRIX: 583->1|774->97|802->100|850->140|889->142|920->147|1007->208|1055->236|1134->289|1188->323|1238->347|1263->352|1314->377|1368->411|1416->432|1542->536|1609->573
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|29->5|29->5|31->7|31->7|32->8|32->8|33->9|33->9|34->10|34->10|37->13
                  -- GENERATED --
              */
