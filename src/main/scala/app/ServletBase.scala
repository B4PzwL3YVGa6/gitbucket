package app

import org.scalatra._
import org.scalatra.json._
import org.json4s._
import org.json4s.jackson._
import jp.sf.amateras.scalatra.forms._

/**
 * Provides generic features for ScalatraServlet implementations.
 */
abstract class ServletBase extends ScalatraServlet with ClientSideValidationFormSupport with JacksonJsonSupport {
  
  implicit val jsonFormats = DefaultFormats
  
  implicit def context: Context = Context(servletContext.getContextPath)
  
  // TODO get from session
  val LoginUser = System.getProperty("user.name")
  
}

case class Context(path: String)