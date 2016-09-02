package example

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

@JSExport
@ScalaJSDefined
class MyExample extends js.Object {
  val is: String = "scala-js-polymer-app"

  def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }
}
