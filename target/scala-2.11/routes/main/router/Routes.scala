
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/danie/IdeaProjects/DevNet/conf/routes
// @DATE:Tue Dec 13 19:57:22 EET 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  ApplicationController_8: controllers.ApplicationController,
  // @LINE:8
  SocialAuthController_6: controllers.SocialAuthController,
  // @LINE:10
  SignUpController_1: controllers.SignUpController,
  // @LINE:13
  SignInController_2: controllers.SignInController,
  // @LINE:16
  ForgotPasswordController_3: controllers.ForgotPasswordController,
  // @LINE:18
  ResetPasswordController_9: controllers.ResetPasswordController,
  // @LINE:20
  ChangePasswordController_4: controllers.ChangePasswordController,
  // @LINE:23
  ActivateAccountController_0: controllers.ActivateAccountController,
  // @LINE:27
  Assets_5: controllers.Assets,
  // @LINE:28
  WebJarAssets_7: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    ApplicationController_8: controllers.ApplicationController,
    // @LINE:8
    SocialAuthController_6: controllers.SocialAuthController,
    // @LINE:10
    SignUpController_1: controllers.SignUpController,
    // @LINE:13
    SignInController_2: controllers.SignInController,
    // @LINE:16
    ForgotPasswordController_3: controllers.ForgotPasswordController,
    // @LINE:18
    ResetPasswordController_9: controllers.ResetPasswordController,
    // @LINE:20
    ChangePasswordController_4: controllers.ChangePasswordController,
    // @LINE:23
    ActivateAccountController_0: controllers.ActivateAccountController,
    // @LINE:27
    Assets_5: controllers.Assets,
    // @LINE:28
    WebJarAssets_7: controllers.WebJarAssets
  ) = this(errorHandler, ApplicationController_8, SocialAuthController_6, SignUpController_1, SignInController_2, ForgotPasswordController_3, ResetPasswordController_9, ChangePasswordController_4, ActivateAccountController_0, Assets_5, WebJarAssets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ApplicationController_8, SocialAuthController_6, SignUpController_1, SignInController_2, ForgotPasswordController_3, ResetPasswordController_9, ChangePasswordController_4, ActivateAccountController_0, Assets_5, WebJarAssets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ApplicationController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signOut""", """controllers.ApplicationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """authenticate/""" + "$" + """provider<[^/]+>""", """controllers.SocialAuthController.authenticate(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signUp""", """controllers.SignUpController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signIn""", """controllers.SignInController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/forgot""", """controllers.ForgotPasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.view(token:java.util.UUID)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/reset/""" + "$" + """token<[^/]+>""", """controllers.ResetPasswordController.submit(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.view"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """password/change""", """controllers.ChangePasswordController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/email/""" + "$" + """email<[^/]+>""", """controllers.ActivateAccountController.send(email:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """account/activate/""" + "$" + """token<[^/]+>""", """controllers.ActivateAccountController.activate(token:java.util.UUID)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_ApplicationController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ApplicationController_index0_invoker = createInvoker(
    ApplicationController_8.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_ApplicationController_signOut1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signOut")))
  )
  private[this] lazy val controllers_ApplicationController_signOut1_invoker = createInvoker(
    ApplicationController_8.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApplicationController",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signOut"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SocialAuthController_authenticate2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("authenticate/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SocialAuthController_authenticate2_invoker = createInvoker(
    SocialAuthController_6.authenticate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SocialAuthController",
      "authenticate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """authenticate/""" + "$" + """provider<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_SignUpController_view3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_view3_invoker = createInvoker(
    SignUpController_1.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_SignUpController_submit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signUp")))
  )
  private[this] lazy val controllers_SignUpController_submit4_invoker = createInvoker(
    SignUpController_1.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignUpController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """signUp"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_SignInController_view5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_view5_invoker = createInvoker(
    SignInController_2.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """signIn"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_SignInController_submit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signIn")))
  )
  private[this] lazy val controllers_SignInController_submit6_invoker = createInvoker(
    SignInController_2.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignInController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """signIn"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ForgotPasswordController_view7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_view7_invoker = createInvoker(
    ForgotPasswordController_3.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """password/forgot"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ForgotPasswordController_submit8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/forgot")))
  )
  private[this] lazy val controllers_ForgotPasswordController_submit8_invoker = createInvoker(
    ForgotPasswordController_3.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ForgotPasswordController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """password/forgot"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ResetPasswordController_view9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_view9_invoker = createInvoker(
    ResetPasswordController_9.view(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "view",
      Seq(classOf[java.util.UUID]),
      "GET",
      """""",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ResetPasswordController_submit10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ResetPasswordController_submit10_invoker = createInvoker(
    ResetPasswordController_9.submit(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ResetPasswordController",
      "submit",
      Seq(classOf[java.util.UUID]),
      "POST",
      """""",
      this.prefix + """password/reset/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ChangePasswordController_view11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_view11_invoker = createInvoker(
    ChangePasswordController_4.view,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "view",
      Nil,
      "GET",
      """""",
      this.prefix + """password/change"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ChangePasswordController_submit12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("password/change")))
  )
  private[this] lazy val controllers_ChangePasswordController_submit12_invoker = createInvoker(
    ChangePasswordController_4.submit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChangePasswordController",
      "submit",
      Nil,
      "POST",
      """""",
      this.prefix + """password/change"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ActivateAccountController_send13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/email/"), DynamicPart("email", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_send13_invoker = createInvoker(
    ActivateAccountController_0.send(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "send",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """account/email/""" + "$" + """email<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ActivateAccountController_activate14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("account/activate/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ActivateAccountController_activate14_invoker = createInvoker(
    ActivateAccountController_0.activate(fakeValue[java.util.UUID]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ActivateAccountController",
      "activate",
      Seq(classOf[java.util.UUID]),
      "GET",
      """""",
      this.prefix + """account/activate/""" + "$" + """token<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_at15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at15_invoker = createInvoker(
    Assets_5.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_WebJarAssets_at16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at16_invoker = createInvoker(
    WebJarAssets_7.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_ApplicationController_index0_route(params) =>
      call { 
        controllers_ApplicationController_index0_invoker.call(ApplicationController_8.index)
      }
  
    // @LINE:7
    case controllers_ApplicationController_signOut1_route(params) =>
      call { 
        controllers_ApplicationController_signOut1_invoker.call(ApplicationController_8.signOut)
      }
  
    // @LINE:8
    case controllers_SocialAuthController_authenticate2_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_SocialAuthController_authenticate2_invoker.call(SocialAuthController_6.authenticate(provider))
      }
  
    // @LINE:10
    case controllers_SignUpController_view3_route(params) =>
      call { 
        controllers_SignUpController_view3_invoker.call(SignUpController_1.view)
      }
  
    // @LINE:11
    case controllers_SignUpController_submit4_route(params) =>
      call { 
        controllers_SignUpController_submit4_invoker.call(SignUpController_1.submit)
      }
  
    // @LINE:13
    case controllers_SignInController_view5_route(params) =>
      call { 
        controllers_SignInController_view5_invoker.call(SignInController_2.view)
      }
  
    // @LINE:14
    case controllers_SignInController_submit6_route(params) =>
      call { 
        controllers_SignInController_submit6_invoker.call(SignInController_2.submit)
      }
  
    // @LINE:16
    case controllers_ForgotPasswordController_view7_route(params) =>
      call { 
        controllers_ForgotPasswordController_view7_invoker.call(ForgotPasswordController_3.view)
      }
  
    // @LINE:17
    case controllers_ForgotPasswordController_submit8_route(params) =>
      call { 
        controllers_ForgotPasswordController_submit8_invoker.call(ForgotPasswordController_3.submit)
      }
  
    // @LINE:18
    case controllers_ResetPasswordController_view9_route(params) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_view9_invoker.call(ResetPasswordController_9.view(token))
      }
  
    // @LINE:19
    case controllers_ResetPasswordController_submit10_route(params) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ResetPasswordController_submit10_invoker.call(ResetPasswordController_9.submit(token))
      }
  
    // @LINE:20
    case controllers_ChangePasswordController_view11_route(params) =>
      call { 
        controllers_ChangePasswordController_view11_invoker.call(ChangePasswordController_4.view)
      }
  
    // @LINE:21
    case controllers_ChangePasswordController_submit12_route(params) =>
      call { 
        controllers_ChangePasswordController_submit12_invoker.call(ChangePasswordController_4.submit)
      }
  
    // @LINE:23
    case controllers_ActivateAccountController_send13_route(params) =>
      call(params.fromPath[String]("email", None)) { (email) =>
        controllers_ActivateAccountController_send13_invoker.call(ActivateAccountController_0.send(email))
      }
  
    // @LINE:24
    case controllers_ActivateAccountController_activate14_route(params) =>
      call(params.fromPath[java.util.UUID]("token", None)) { (token) =>
        controllers_ActivateAccountController_activate14_invoker.call(ActivateAccountController_0.activate(token))
      }
  
    // @LINE:27
    case controllers_Assets_at15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at15_invoker.call(Assets_5.at(path, file))
      }
  
    // @LINE:28
    case controllers_WebJarAssets_at16_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at16_invoker.call(WebJarAssets_7.at(file))
      }
  }
}
