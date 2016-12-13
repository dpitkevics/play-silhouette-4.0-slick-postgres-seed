
package views.html

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

  class resetPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[String], java.util.UUID, RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (form: Form[String], token: java.util.UUID)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.inline.fieldConstructor

          Seq[Any](format.raw /*1.126*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ main(Messages("reset.password.title")) /*5.40*/ {
            _display_(Seq[Any](format.raw /*5.42*/ ("""
    """), format.raw /*6.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*7.18*/ Messages("reset.password")), format.raw /*7.44*/ ("""</legend>
        """), _display_( /*8.10*/ helper /*8.16*/ .form(action = routes.ResetPasswordController.submit(token), 'autocomplete -> "off") /*8.100*/ {
              _display_(Seq[Any](format.raw /*8.102*/ ("""
            """), format.raw /*9.13*/ ("""<p class="info">"""), _display_( /*9.30*/ Messages("strong.password.info")), format.raw /*9.62*/ ("""</p>
            """), _display_( /*10.14*/ helper /*10.20*/ .CSRF.formField), format.raw /*10.35*/ ("""
            """), _display_( /*11.14*/ passwordStrength(form("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg")), format.raw /*11.160*/ ("""
            """), format.raw /*12.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*14.112*/ Messages("reset")), format.raw /*14.129*/ ("""</button>
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

    def render(form: Form[String], token: java.util.UUID, request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(form, token)(request, messages, webJarAssets)

    def f: ((Form[String], java.util.UUID) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (form, token) => (request, messages, webJarAssets) => apply(form, token)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object resetPassword extends resetPassword_Scope0.resetPassword
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/resetPassword.scala.html
                  HASH: e1b0810093c41f8a5eb16ce50c0618aa3c18c828
                  MATRIX: 600->1|853->125|881->162|908->164|954->202|993->204|1024->209|1111->270|1157->296|1202->315|1216->321|1309->405|1349->407|1389->420|1432->437|1484->469|1529->487|1544->493|1580->508|1621->522|1789->668|1830->681|2016->839|2055->856|2147->917|2179->922|2222->935
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|30->7|30->7|31->8|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|35->12|37->14|37->14|40->17|41->18|42->19
                  -- GENERATED --
              */
