
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object signUp_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class signUp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[forms.SignUpForm.Data], RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (signUpForm: Form[forms.SignUpForm.Data])(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.inline.fieldConstructor

          Seq[Any](format.raw /*1.124*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ main(Messages("sign.up.title")) /*5.33*/ {
            _display_(Seq[Any](format.raw /*5.35*/ ("""
    """), format.raw /*6.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*7.18*/ Messages("sign.up.account")), format.raw /*7.45*/ ("""</legend>
        """), _display_( /*8.10*/ helper /*8.16*/ .form(action = routes.SignUpController.submit()) /*8.64*/ {
              _display_(Seq[Any](format.raw /*8.66*/ ("""
            """), _display_( /*9.14*/ helper /*9.20*/ .CSRF.formField), format.raw /*9.35*/ ("""
            """), _display_( /*10.14*/ b3 /*10.16*/ .text(signUpForm("firstName"), '_hiddenLabel -> Messages("first.name"), 'placeholder -> Messages("first.name"), 'class -> "form-control input-lg")), format.raw /*10.162*/ ("""
            """), _display_( /*11.14*/ b3 /*11.16*/ .text(signUpForm("lastName"), '_hiddenLabel -> Messages("last.name"), 'placeholder -> Messages("last.name"), 'class -> "form-control input-lg")), format.raw /*11.159*/ ("""
            """), _display_( /*12.14*/ b3 /*12.16*/ .text(signUpForm("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg")), format.raw /*12.148*/ ("""
            """), _display_( /*13.14*/ passwordStrength(signUpForm("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg")), format.raw /*13.166*/ ("""
            """), format.raw /*14.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*16.112*/ Messages("sign.up")), format.raw /*16.131*/ ("""</button>
                </div>
            </div>
            <div class="sign-in-now">
                <p>"""), _display_( /*20.21*/ Messages("already.a.member")), format.raw /*20.49*/ (""" """), format.raw /*20.50*/ ("""<a href=""""), _display_( /*20.60*/ routes /*20.66*/ .SignInController.view), format.raw /*20.88*/ ("""">"""), _display_( /*20.91*/ Messages("sign.in.now")), format.raw /*20.114*/ ("""</a></p>
            </div>
        """)))
            }), format.raw /*22.10*/ ("""
    """), format.raw /*23.5*/ ("""</fieldset>
""")))
          }), format.raw /*24.2*/ ("""
"""))
        }
      }
    }

    def render(signUpForm: Form[forms.SignUpForm.Data], request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(signUpForm)(request, messages, webJarAssets)

    def f: ((Form[forms.SignUpForm.Data]) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (signUpForm) => (request, messages, webJarAssets) => apply(signUpForm)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object signUp extends signUp_Scope0.signUp
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/signUp.scala.html
                  HASH: 42b21b09df60db80988ccd0d84bab77c12b87127
                  MATRIX: 586->1|837->123|865->160|892->162|931->193|970->195|1001->200|1088->261|1135->288|1180->307|1194->313|1250->361|1289->363|1329->377|1343->383|1378->398|1419->412|1430->414|1598->560|1639->574|1650->576|1815->719|1856->733|1867->735|2021->867|2062->881|2236->1033|2277->1046|2463->1204|2504->1223|2641->1333|2690->1361|2719->1362|2756->1372|2771->1378|2814->1400|2844->1403|2889->1426|2957->1463|2989->1468|3032->1481
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|30->7|30->7|31->8|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|37->14|39->16|39->16|43->20|43->20|43->20|43->20|43->20|43->20|43->20|43->20|45->22|46->23|47->24
                  -- GENERATED --
              */
