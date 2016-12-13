
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object signIn_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class signIn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Form[forms.SignInForm.Data], com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry, RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (signInForm: Form[forms.SignInForm.Data], socialProviders: com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {
          import com.mohiva.play.silhouette.impl.providers.oauth2.ClefProvider
          import b3.inline.fieldConstructor

          Seq[Any](format.raw /*1.207*/ ("""

"""), format.raw /*5.1*/ ("""
"""), _display_( /*6.2*/ main(Messages("sign.in.title")) /*6.33*/ {
            _display_(Seq[Any](format.raw /*6.35*/ ("""
    """), format.raw /*7.5*/ ("""<fieldset class="col-md-6 col-md-offset-3">
        <legend>"""), _display_( /*8.18*/ Messages("sign.in.credentials")), format.raw /*8.49*/ ("""</legend>
        """), _display_( /*9.10*/ helper /*9.16*/ .form(action = routes.SignInController.submit()) /*9.64*/ {
              _display_(Seq[Any](format.raw /*9.66*/ ("""
            """), _display_( /*10.14*/ helper /*10.20*/ .CSRF.formField), format.raw /*10.35*/ ("""
            """), _display_( /*11.14*/ b3 /*11.16*/ .email(signInForm("email"), '_hiddenLabel -> Messages("email"), 'placeholder -> Messages("email"), 'class -> "form-control input-lg")), format.raw /*11.149*/ ("""
            """), _display_( /*12.14*/ b3 /*12.16*/ .password(signInForm("password"), '_hiddenLabel -> Messages("password"), 'placeholder -> Messages("password"), 'class -> "form-control input-lg")), format.raw /*12.161*/ ("""
            """), _display_( /*13.14*/ b3 /*13.16*/ .checkbox(signInForm("rememberMe"), '_text -> Messages("remember.me"), 'checked -> true)), format.raw /*13.104*/ ("""
            """), format.raw /*14.13*/ ("""<div class="form-group">
                <div>
                    <button id="submit" type="submit" value="submit" class="btn btn-lg btn-primary btn-block">"""), _display_( /*16.112*/ Messages("sign.in")), format.raw /*16.131*/ ("""</button>
                </div>
            </div>
        """)))
            }), format.raw /*19.10*/ ("""

        """), format.raw /*21.9*/ ("""<div>
            <p class="not-a-member">"""), _display_( /*22.38*/ Messages("not.a.member")), format.raw /*22.62*/ (""" """), format.raw /*22.63*/ ("""<a href=""""), _display_( /*22.73*/ routes /*22.79*/ .SignUpController.view), format.raw /*22.101*/ ("""">"""), _display_( /*22.104*/ Messages("sign.up.now")), format.raw /*22.127*/ ("""</a> | <a href=""""), _display_( /*22.144*/ routes /*22.150*/ .ForgotPasswordController.view()), format.raw /*22.182*/ ("""" title=""""), _display_( /*22.192*/ Messages("forgot.your.password")), format.raw /*22.224*/ ("""">"""), _display_( /*22.227*/ Messages("forgot.your.password")), format.raw /*22.259*/ ("""</a></p>
        </div>

        """), _display_( /*25.10*/ if (socialProviders.providers.nonEmpty) /*25.48*/ {
              _display_(Seq[Any](format.raw /*25.50*/ ("""
            """), format.raw /*26.13*/ ("""<div class="social-providers">
                <p>"""), _display_( /*27.21*/ Messages("or.use.social")), format.raw /*27.46*/ ("""</p>
                <div>
                """), _display_( /*29.18*/ for (p <- socialProviders.providers if p.id != "clef") yield /*29.71*/ {
                _display_(Seq[Any](format.raw /*29.73*/ ("""
                    """), format.raw /*30.21*/ ("""<a href=""""), _display_( /*30.31*/ routes /*30.37*/ .SocialAuthController.authenticate(p.id)), format.raw /*30.77*/ ("""" class="provider """), _display_( /*30.96*/ p /*30.97*/ .id), format.raw /*30.100*/ ("""" title=""""), _display_( /*30.110*/ Messages(p.id)), format.raw /*30.124*/ (""""><img src=""""), _display_( /*30.137*/ routes /*30.143*/ .Assets.at(s"images/providers/${p.id}.png")), format.raw /*30.186*/ ("""" width="64px" height="64px" alt=""""), _display_( /*30.221*/ Messages(p.id)), format.raw /*30.235*/ (""""></a>
                """)))
              }), format.raw /*31.18*/ ("""
                """), format.raw /*32.17*/ ("""</div>
                """), _display_( /*33.18*/ defining(socialProviders.get[ClefProvider]) /*33.61*/ { clef =>
                _display_(Seq[Any](format.raw /*33.71*/ ("""
                    """), _display_( /*34.22*/ if (clef.isDefined) /*34.40*/ {
                  _display_(Seq[Any](format.raw /*34.42*/ ("""
                        """), format.raw /*35.25*/ ("""<script type="text/javascript" src="https://clef.io/v3/clef.js" class="clef-button" data-app-id=""""), _display_( /*35.123*/ clef /*35.127*/ .get.settings.clientID), format.raw /*35.149*/ ("""" data-color="blue" data-style="flat" data-redirect-url=""""), _display_( /*35.207*/ clef /*35.211*/ .get.settings.redirectURL), format.raw /*35.236*/ ("""" data-type="login"></script>
                    """)))
                }), format.raw /*36.22*/ ("""
                """)))
              }), format.raw /*37.18*/ ("""
            """), format.raw /*38.13*/ ("""</div>
        """)))
            }), format.raw /*39.10*/ ("""

    """), format.raw /*41.5*/ ("""</fieldset>
""")))
          }), format.raw /*42.2*/ ("""
"""))
        }
      }
    }

    def render(signInForm: Form[forms.SignInForm.Data], socialProviders: com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry, request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(signInForm, socialProviders)(request, messages, webJarAssets)

    def f: ((Form[forms.SignInForm.Data], com.mohiva.play.silhouette.impl.providers.SocialProviderRegistry) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (signInForm, socialProviders) => (request, messages, webJarAssets) => apply(signInForm, socialProviders)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object signIn extends signIn_Scope0.signIn
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/signIn.scala.html
                  HASH: 9baa4614ca6942bab7d74726e361ba71255f84cd
                  MATRIX: 651->1|1054->206|1082->313|1109->315|1148->346|1187->348|1218->353|1305->414|1356->445|1401->464|1415->470|1471->518|1510->520|1551->534|1566->540|1602->555|1643->569|1654->571|1809->704|1850->718|1861->720|2028->865|2069->879|2080->881|2190->969|2231->982|2417->1140|2458->1159|2550->1220|2587->1230|2657->1273|2702->1297|2731->1298|2768->1308|2783->1314|2827->1336|2858->1339|2903->1362|2948->1379|2964->1385|3018->1417|3056->1427|3110->1459|3141->1462|3195->1494|3256->1528|3303->1566|3343->1568|3384->1581|3462->1632|3508->1657|3579->1701|3648->1754|3688->1756|3737->1777|3774->1787|3789->1793|3850->1833|3896->1852|3906->1853|3931->1856|3969->1866|4005->1880|4046->1893|4062->1899|4127->1942|4190->1977|4226->1991|4281->2015|4326->2032|4377->2056|4429->2099|4477->2109|4526->2131|4553->2149|4593->2151|4646->2176|4772->2274|4786->2278|4830->2300|4916->2358|4930->2362|4977->2387|5059->2438|5108->2456|5149->2469|5196->2485|5229->2491|5272->2504
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|30->7|31->8|31->8|32->9|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|37->14|39->16|39->16|42->19|44->21|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|45->22|48->25|48->25|48->25|49->26|50->27|50->27|52->29|52->29|52->29|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|53->30|54->31|55->32|56->33|56->33|56->33|57->34|57->34|57->34|58->35|58->35|58->35|58->35|58->35|58->35|58->35|59->36|60->37|61->38|62->39|64->41|65->42
                  -- GENERATED --
              */
