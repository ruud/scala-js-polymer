package example

import example.polymer.Attribute

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

@JSExport
@ScalaJSDefined
class MyExample extends js.Object {

  val is: String = "scala-js-polymer-app"

  def properties = js.Dynamic.literal(
    "prop1" -> Attribute("String", "Ruud I am")
  )

  def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }

}
