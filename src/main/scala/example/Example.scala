package example

import example.polymer.{Component, Property}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

@JSExport
@ScalaJSDefined
class MyExample extends Component {

  override val is: String = "scala-js-polymer-app"

  override def properties = js.Dynamic.literal(
    "prop1" -> Property("String", "Ruud I am")
  )

  override def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }

}
