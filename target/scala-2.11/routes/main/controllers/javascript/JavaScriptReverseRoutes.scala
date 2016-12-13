
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/danie/IdeaProjects/DevNet/conf/routes
// @DATE:Tue Dec 13 19:57:22 EET 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.utils.route.Binders._

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseSignInController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
    // @LINE:14
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignInController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signIn"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseSocialAuthController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SocialAuthController.authenticate",
      """
        function(provider0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider0))})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseResetPasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ResetPasswordController.submit",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password/reset/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("token", token0)})
        }
      """
    )
  
    // @LINE:18
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ResetPasswordController.view",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password/reset/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("token", token0)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signOut"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApplicationController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseActivateAccountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def activate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivateAccountController.activate",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/activate/" + (""" + implicitly[PathBindable[java.util.UUID]].javascriptUnbind + """)("token", token0)})
        }
      """
    )
  
    // @LINE:23
    def send: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ActivateAccountController.send",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "account/email/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email0))})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseForgotPasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ForgotPasswordController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password/forgot"})
        }
      """
    )
  
    // @LINE:17
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ForgotPasswordController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password/forgot"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseChangePasswordController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChangePasswordController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "password/change"})
        }
      """
    )
  
    // @LINE:21
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChangePasswordController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "password/change"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseSignUpController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def view: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.view",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
    // @LINE:11
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignUpController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signUp"})
        }
      """
    )
  
  }


}
