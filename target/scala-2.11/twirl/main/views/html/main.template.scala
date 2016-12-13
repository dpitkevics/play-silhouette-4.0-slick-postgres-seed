
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object main_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String, Option[models.User], Html, RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

    /**/
    def apply /*1.2*/ (title: String, user: Option[models.User] = None)(content: Html)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
        {

          Seq[Any](format.raw /*1.147*/ ("""

"""), format.raw /*3.1*/ ("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""), _display_( /*9.59*/ routes /*9.65*/ .Assets.at("images/favicon.png")), format.raw /*9.97*/ ("""">
        <title>"""), _display_( /*10.17*/ title), format.raw /*10.22*/ ("""</title>
        <link href="//fonts.googleapis.com/css?family=Roboto|Montserrat:400,700|Open+Sans:400,300,600" rel="stylesheet">
        <link href="//cdnjs.cloudflare.com/ajax/libs/ionicons/1.5.2/css/ionicons.min.css" rel="stylesheet">
        <link rel="stylesheet" href=""""), _display_( /*13.39*/ routes /*13.45*/ .WebJarAssets.at(webJarAssets.locate("bootstrap.min.css"))), format.raw /*13.103*/ ("""">
        <link rel="stylesheet" href=""""), _display_( /*14.39*/ routes /*14.45*/ .WebJarAssets.at(webJarAssets.locate("bootstrap-theme.min.css"))), format.raw /*14.109*/ ("""">
        <link rel="stylesheet" href=""""), _display_( /*15.39*/ routes /*15.45*/ .Assets.at("styles/main.css")), format.raw /*15.74*/ ("""">
            <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
            <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
            <![endif]-->
    </head>
    <body>
        <header class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">"""), _display_( /*27.48*/ Messages("toggle.navigation")), format.raw /*27.77*/ ("""</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""), _display_( /*32.52*/ routes /*32.58*/ .ApplicationController.index), format.raw /*32.86*/ ("""">Silhouette Seed Template</a>
                </div>
                <nav class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href=""""), _display_( /*36.39*/ routes /*36.45*/ .ApplicationController.index), format.raw /*36.73*/ ("""">"""), _display_( /*36.76*/ Messages("home")), format.raw /*36.92*/ ("""</a></li>
                        <li><a href="https://github.com/mohiva/play-silhouette-seed">GitHub</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        """), _display_( /*40.26*/ user /*40.30*/ .map /*40.34*/ { u =>
            _display_(Seq[Any](format.raw /*40.41*/ ("""
                            """), format.raw /*41.29*/ ("""<li><a href=""""), _display_( /*41.43*/ routes /*41.49*/ .ApplicationController.index), format.raw /*41.77*/ ("""">"""), _display_( /*41.80*/ u /*41.81*/ .name), format.raw /*41.86*/ ("""</a></li>
                            """), _display_( /*42.30*/ if (u.loginInfo.providerID == com.mohiva.play.silhouette.impl.providers.CredentialsProvider.ID) /*42.124*/ {
              _display_(Seq[Any](format.raw /*42.126*/ ("""
                                """), format.raw /*43.33*/ ("""<li><a href=""""), _display_( /*43.47*/ routes /*43.53*/ .ChangePasswordController.view), format.raw /*43.83*/ ("""">"""), _display_( /*43.86*/ Messages("change.password")), format.raw /*43.113*/ ("""</a></li>
                            """)))
            }), format.raw /*44.30*/ ("""
                            """), format.raw /*45.29*/ ("""<li><a href=""""), _display_( /*45.43*/ routes /*45.49*/ .ApplicationController.signOut), format.raw /*45.79*/ ("""">"""), _display_( /*45.82*/ Messages("sign.out")), format.raw /*45.102*/ ("""</a></li>
                        """)))
          } /*46.26*/ .getOrElse /*46.36*/ {
            _display_(Seq[Any](format.raw /*46.38*/ ("""
                            """), format.raw /*47.29*/ ("""<li><a href=""""), _display_( /*47.43*/ routes /*47.49*/ .SignInController.view), format.raw /*47.71*/ ("""">"""), _display_( /*47.74*/ Messages("sign.in")), format.raw /*47.93*/ ("""</a></li>
                            <li><a href=""""), _display_( /*48.43*/ routes /*48.49*/ .SignUpController.view), format.raw /*48.71*/ ("""">"""), _display_( /*48.74*/ Messages("sign.up")), format.raw /*48.93*/ ("""</a></li>
                        """)))
          }), format.raw /*49.26*/ ("""
                    """), format.raw /*50.21*/ ("""</ul>
                </nav>
            </div>
        </header>
        <main class="container">
            <div class="starter-template row">
                """), _display_( /*56.18*/ request /*56.25*/ .flash.get("error").map /*56.48*/ { msg =>
            _display_(Seq[Any](format.raw /*56.57*/ ("""
                    """), format.raw /*57.21*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-danger">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""), _display_( /*59.34*/ Messages("error")), format.raw /*59.51*/ ("""</strong> """), _display_( /*59.62*/ msg), format.raw /*59.65*/ ("""
                    """), format.raw /*60.21*/ ("""</div>
                """)))
          }), format.raw /*61.18*/ ("""
                """), _display_( /*62.18*/ request /*62.25*/ .flash.get("info").map /*62.47*/ { msg =>
            _display_(Seq[Any](format.raw /*62.56*/ ("""
                    """), format.raw /*63.21*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-info">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""), _display_( /*65.34*/ Messages("info")), format.raw /*65.50*/ ("""</strong> """), _display_( /*65.61*/ msg), format.raw /*65.64*/ ("""
                    """), format.raw /*66.21*/ ("""</div>
                """)))
          }), format.raw /*67.18*/ ("""
                """), _display_( /*68.18*/ request /*68.25*/ .flash.get("success").map /*68.50*/ { msg =>
            _display_(Seq[Any](format.raw /*68.59*/ ("""
                    """), format.raw /*69.21*/ ("""<div class="col-md-6 col-md-offset-3 alert alert-success">
                        <a href="#" class="close" data-dismiss="alert">&times;</a>
                        <strong>"""), _display_( /*71.34*/ Messages("success")), format.raw /*71.53*/ ("""</strong> """), _display_( /*71.64*/ msg), format.raw /*71.67*/ ("""
                    """), format.raw /*72.21*/ ("""</div>
                """)))
          }), format.raw /*73.18*/ ("""
                """), _display_( /*74.18*/ content), format.raw /*74.25*/ ("""
            """), format.raw /*75.13*/ ("""</div>
        </main>
        <script type="text/javascript" src=""""), _display_( /*77.46*/ routes /*77.52*/ .WebJarAssets.at(webJarAssets.locate("jquery.min.js"))), format.raw /*77.106*/ (""""></script>
        <script type="text/javascript" src=""""), _display_( /*78.46*/ routes /*78.52*/ .WebJarAssets.at(webJarAssets.locate("bootstrap.min.js"))), format.raw /*78.109*/ (""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/zxcvbn/4.2.0/zxcvbn.js"></script>
        <script src=""""), _display_( /*80.23*/ routes /*80.29*/ .Assets.at("javascripts/zxcvbnShim.js")), format.raw /*80.68*/ (""""></script>
    </body>
</html>
"""))
        }
      }
    }

    def render(title: String, user: Option[models.User], content: Html, request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(title, user)(content)(request, messages, webJarAssets)

    def f: ((String, Option[models.User]) => (Html) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (title, user) => (content) => (request, messages, webJarAssets) => apply(title, user)(content)(request, messages, webJarAssets)

    def ref: this.type = this

  }

}

/**/
object main extends main_Scope0.main
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/main.scala.html
                  HASH: 2311aad1cf8b24a5bd598e6b37ae2f8d2a72131a
                  MATRIX: 586->1|827->146|855->148|1153->420|1167->426|1219->458|1265->477|1291->482|1594->758|1609->764|1689->822|1757->863|1772->869|1858->933|1926->974|1941->980|1991->1009|2711->1702|2761->1731|3042->1985|3057->1991|3106->2019|3328->2214|3343->2220|3392->2248|3422->2251|3459->2267|3709->2490|3722->2494|3735->2498|3780->2505|3837->2534|3878->2548|3893->2554|3942->2582|3972->2585|3982->2586|4008->2591|4074->2630|4178->2724|4219->2726|4280->2759|4321->2773|4336->2779|4387->2809|4417->2812|4466->2839|4536->2878|4593->2907|4634->2921|4649->2927|4700->2957|4730->2960|4772->2980|4826->3015|4845->3025|4885->3027|4942->3056|4983->3070|4998->3076|5041->3098|5071->3101|5111->3120|5190->3172|5205->3178|5248->3200|5278->3203|5318->3222|5384->3257|5433->3278|5623->3441|5639->3448|5671->3471|5718->3480|5767->3501|5968->3675|6006->3692|6044->3703|6068->3706|6117->3727|6172->3751|6217->3769|6233->3776|6264->3798|6311->3807|6360->3828|6559->4000|6596->4016|6634->4027|6658->4030|6707->4051|6762->4075|6807->4093|6823->4100|6857->4125|6904->4134|6953->4155|7155->4330|7195->4349|7233->4360|7257->4363|7306->4384|7361->4408|7406->4426|7434->4433|7475->4446|7570->4514|7585->4520|7661->4574|7745->4631|7760->4637|7839->4694|7994->4822|8009->4828|8069->4867
                  LINES: 20->1|25->1|27->3|33->9|33->9|33->9|34->10|34->10|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|51->27|51->27|56->32|56->32|56->32|60->36|60->36|60->36|60->36|60->36|64->40|64->40|64->40|64->40|65->41|65->41|65->41|65->41|65->41|65->41|65->41|66->42|66->42|66->42|67->43|67->43|67->43|67->43|67->43|67->43|68->44|69->45|69->45|69->45|69->45|69->45|69->45|70->46|70->46|70->46|71->47|71->47|71->47|71->47|71->47|71->47|72->48|72->48|72->48|72->48|72->48|73->49|74->50|80->56|80->56|80->56|80->56|81->57|83->59|83->59|83->59|83->59|84->60|85->61|86->62|86->62|86->62|86->62|87->63|89->65|89->65|89->65|89->65|90->66|91->67|92->68|92->68|92->68|92->68|93->69|95->71|95->71|95->71|95->71|96->72|97->73|98->74|98->74|99->75|101->77|101->77|101->77|102->78|102->78|102->78|104->80|104->80|104->80
                  -- GENERATED --
              */
