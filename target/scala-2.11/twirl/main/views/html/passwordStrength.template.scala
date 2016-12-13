
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

object passwordStrength_Scope0 {
  import models._
  import controllers._
  import play.api.i18n._
  import views.html._
  import play.api.templates.PlayMagic._
  import play.api.mvc._
  import play.api.data._

  object passwordStrength_Scope1 {
    import b3.inline.fieldConstructor

    class passwordStrength extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable, Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Field, Array[scala.Tuple2[Symbol, Any]], RequestHeader, Messages, WebJarAssets, play.twirl.api.HtmlFormat.Appendable] {

      /**/
      def apply /*2.2*/ (field: Field, options: (Symbol, Any)*)(implicit request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = {
        _display_ {
          {

            Seq[Any](format.raw /*2.122*/ ("""
"""), format.raw /*3.1*/ ("""<section>
  """), _display_( /*4.4*/ b3 /*4.6*/ .password(field, (Symbol("data-pwd"), "true") +: options: _*)), format.raw /*4.66*/ ("""

  """), format.raw /*6.3*/ ("""<meter max="4" id="password-strength-meter"></meter>
  <p id="password-strength-text"></p>
</section>
"""))
          }
        }
      }

      def render(field: Field, options: Array[scala.Tuple2[Symbol, Any]], request: RequestHeader, messages: Messages, webJarAssets: WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(field, options: _*)(request, messages, webJarAssets)

      def f: ((Field, Array[scala.Tuple2[Symbol, Any]]) => (RequestHeader, Messages, WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (field, options) => (request, messages, webJarAssets) => apply(field, options: _*)(request, messages, webJarAssets)

      def ref: this.type = this

    }

  }
}

/**/
object passwordStrength extends passwordStrength_Scope0.passwordStrength_Scope1.passwordStrength
/*
                  -- GENERATED --
                  DATE: Tue Dec 06 22:51:34 EET 2016
                  SOURCE: C:/Users/danie/IdeaProjects/DevNet/app/views/passwordStrength.scala.html
                  HASH: 0cb952197ce36cc838440cc720058c7d9e3c5912
                  MATRIX: 690->36|906->156|933->157|971->170|980->172|1060->232|1090->236
                  LINES: 23->2|28->2|29->3|30->4|30->4|30->4|32->6
                  -- GENERATED --
              */
