
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/danie/IdeaProjects/DevNet/conf/routes
// @DATE:Tue Dec 13 19:57:22 EET 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
