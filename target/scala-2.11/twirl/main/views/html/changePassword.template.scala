
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object changePassword_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class changePassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[scala.Tuple2[String, String]], models.User, RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (changePasswordForm: Form[(String, String)], user: models.User)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import b3.inline.fieldConstructor

          Seq[Any](format.raw /*1.146*/ ("""

"""), format.raw /*4.1*/ ("""
"""), _display_( /*5.2*/ main(Messages("change.password.title"), Some(user)) /*5.53*/ {
            _display_(Seq[Any](format.raw /*5.55*/ ("""
    """), format.raw /*6.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*7.18*/ Messages("change.password")), format.raw /*7.45*/ ("""</legend>
        """), _display_( /*8.10*/ helper /*8.16*/ .form(action = routes.ChangePasswordController.submit, 'autocomplete -> "off") /*8.94*/ {
              _display_(Seq[Any](format.raw /*8.96*/ ("""
            """), format.raw /*9.13*/ ("""<p class="info">"""), _display_( /*9.30*/ Messages("strong.password.info")), format.raw /*9.62*/ ("""</p>
            """), _display_( /*10.14*/ helper /*10.20*/ .CSRF.formField), format.raw /*10.35*/ ("""
            """), _display_( /*11.14*/ b3 /*11.16*/ .password(changePasswordForm("current-password"), '_hiddenLabel -> Messages("current.password"), 'placeholder -> Messages("current.password"), 'class -> "form-control input-lg")), format.raw /*11.193*/ ("""
            """), _display_( /*12.14*/ passwordStrength(changePasswordForm("new-password"), '_hiddenLabel -> Messages("new.password"), 'placeholder -> Messages("new.password"), 'class -> "form-control input-lg")), format.raw /*12.186*/ ("""
            """), format.raw /*13.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*15.112*/ Messages("change")), format.raw /*15.130*/ ("""</button>
                </div>
            </div>
        """)))
            }), format.raw /*18.10*/ ("""
    """), format.raw /*19.5*/ ("""</fieldset>
""")))
          }), format.raw /*20.2*/ ("""
"""))
        }
      }
    }

    def render(changePasswordForm: Form[scala.Tuple2[String, String]], user: models.User, request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(changePasswordForm, user)(request, messages, webJarAssets)

    def f: ((Form[scala.Tuple2[String, String]], models.User) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (changePasswordForm, user) => (request, messages, webJarAssets) => apply(changePasswordForm, user)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object changePassword extends changePassword_Scope0.changePassword
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/changePassword.scala.html
                  HASH: 60dbeab8d48899eec0f127cb4f12ef84ee06f9ac
                  MATRIX: 621->1|894->145|922->182|949->184|1008->235|1047->237|1078->242|1165->303|1212->330|1257->349|1271->355|1357->433|1396->435|1436->448|1479->465|1531->497|1576->515|1591->521|1627->536|1668->550|1679->552|1878->729|1919->743|2113->915|2154->928|2340->1086|2380->1104|2472->1165|2504->1170|2547->1183
                  LINES: 20->1|25->1|27->4|28->5|28->5|28->5|29->6|30->7|30->7|31->8|31->8|31->8|31->8|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|36->13|38->15|38->15|41->18|42->19|43->20
                  -- GENERATED --
              */
