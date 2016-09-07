package example.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
trait Component extends js.Object {
  val is: String

  def properties: js.Dynamic

  def beforeRegister(): Unit
}
