
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object home_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[models.User, RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (user: models.User)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.102*/ ("""

"""), _display_( /*3.2*/ main(Messages("home.title"), Some(user)) /*3.42*/ {
            _display_(Seq[Any](format.raw /*3.44*/ ("""
    """), format.raw /*4.5*/ ("""<div class="user col-md-6 col-md-offset-3">
        <div class="row">
            <hr class="col-md-12" />
            <h4 class="col-md-8">"""), _display_( /*7.35*/ Messages("welcome.signed.in")), format.raw /*7.64*/ ("""</h4>
            <div class="col-md-4 text-right">
                <img src=""""), _display_( /*9.28*/ user /*9.32*/ .avatarURL.getOrElse(routes.Assets.at("images/silhouette.png"))), format.raw /*9.95*/ ("""" height="40px" />
            </div>
            <hr class="col-md-12" />
        </div>
        <div class="row data">
            <div class="col-md-12">
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*16.50*/ Messages("first.name")), format.raw /*16.72*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*16.107*/ user /*16.111*/ .firstName.getOrElse("None")), format.raw /*16.139*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*19.50*/ Messages("last.name")), format.raw /*19.71*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*19.106*/ user /*19.110*/ .lastName.getOrElse("None")), format.raw /*19.137*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*22.50*/ Messages("full.name")), format.raw /*22.71*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*22.106*/ user /*22.110*/ .fullName.getOrElse("None")), format.raw /*22.137*/ ("""</p>
                </div>
                <div class="row">
                    <p class="col-md-6"><strong>"""), _display_( /*25.50*/ Messages("email")), format.raw /*25.67*/ (""":</strong></p><p class="col-md-6">"""), _display_( /*25.102*/ user /*25.106*/ .email.getOrElse("None")), format.raw /*25.130*/ ("""</p>
                </div>
            </div>
        </div>
    </div>
""")))
          }), format.raw /*30.2*/ ("""
"""))
        }
      }
    }

    def render(user: models.User, request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(user)(request, messages, webJarAssets)

    def f: ((models.User) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (user) => (request, messages, webJarAssets) => apply(user)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object home extends home_Scope0.home
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/home.scala.html
                  HASH: adbed6a2bac9699850daffe19fadf1a7691d655a
                  MATRIX: 566->1|762->101|790->104|838->144|877->146|908->151|1075->292|1124->321|1229->400|1241->404|1324->467|1591->707|1634->729|1697->764|1711->768|1761->796|1899->907|1941->928|2004->963|2018->967|2067->994|2205->1105|2247->1126|2310->1161|2324->1165|2373->1192|2511->1303|2549->1320|2612->1355|2626->1359|2672->1383|2776->1457
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|33->9|33->9|33->9|40->16|40->16|40->16|40->16|40->16|43->19|43->19|43->19|43->19|43->19|46->22|46->22|46->22|46->22|46->22|49->25|49->25|49->25|49->25|49->25|54->30
                  -- GENERATED --
              */
