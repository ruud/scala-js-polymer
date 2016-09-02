package example

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

@JSExport
@ScalaJSDefined
class MyExample extends js.Object {

  val is: String = "scala-js-polymer-app"

  def properties = js.Dynamic.literal(
    "prop1" -> js.Dynamic.literal(
      "type" -> "String",
      "value" -> "Ruud I am"
    )
  )

  def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }

}
