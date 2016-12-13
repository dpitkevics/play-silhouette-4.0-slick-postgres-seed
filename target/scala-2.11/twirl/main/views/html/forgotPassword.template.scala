
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object forgotPassword_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class forgotPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[String], RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (forgotPasswordForm: Form[String])(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.inline.fieldConstructor

          Seq[Any](format.raw /*1.117*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ main(Messages("forgot.password.title")) /*5.41*/ {
            _display_(Seq[Any](format.raw /*5.43*/ ("""
    """), format.raw /*6.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*7.18*/ Messages("forgot.password")), format.raw /*7.45*/ ("""</legend>
        """), _display_( /*8.10*/ helper /*8.16*/ .form(action = routes.ForgotPasswordController.submit(), 'autocomplete -> "off") /*8.96*/ {
              _display_(Seq[Any](format.raw /*8.98*/ ("""
            """), format.raw /*9.13*/ ("""<p class="info">"""), _display_( /*9.30*/ Messages("forgot.password.info")), format.raw /*9.62*/ ("""</p>
            """), _display_( /*10.14*/ helper /*10.20*/ .CSRF.formField), format.raw /*10.35*/ ("""
            """), _display_( /*11.14*/ b3 /*11.16*/ .text(forgotPasswordForm("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg")), format.raw /*11.156*/ ("""
            """), format.raw /*12.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*14.112*/ Messages("send")), format.raw /*14.128*/ ("""</button>
                </div>
            </div>
        """)))
            }), format.raw /*17.10*/ ("""
    """), format.raw /*18.5*/ ("""</fieldset>
""")))
          }), format.raw /*19.2*/ ("""
"""))
        }
      }
    }

    def render(forgotPasswordForm: Form[String], request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(forgotPasswordForm)(request, messages, webJarAssets)

    def f: ((Form[String]) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (forgotPasswordForm) => (request, messages, webJarAssets) => apply(forgotPasswordForm)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object forgotPassword extends forgotPassword_Scope0.forgotPassword
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/forgotPassword.scala.html
                  HASH: 823d25d095713711b65006ab9e41c131282cf1c8
                  MATRIX: 587->1|831->116|859->153|886->155|933->194|972->196|1003->201|1090->262|1137->289|1182->308|1196->314|1284->394|1323->396|1363->409|1406->426|1458->458|1503->476|1518->482|1554->497|1595->511|1606->513|1768->653|1809->666|1995->824|2033->840|2125->901|2157->906|2200->919
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|30->7|30->7|31->8|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|37->14|37->14|40->17|41->18|42->19
                  -- GENERATED --
              */
