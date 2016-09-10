package example

import example.polymer.{PolymerElement, Property}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class ScalaJsPolymerApp extends PolymerElement {

  override val is: String = "scala-js-polymer-app"

  override def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }

  def properties = js.Dynamic.literal(
    "prop1" -> Property("String", "Green eggs and ham, Sam I am")
  )

  def created(): Unit = {
    println("lifecycle - created")
  }

  def ready(): Unit = {
    println("lifecycle - ready")
  }

  def attached(): Unit = {
    println("Lifecycle - attached")
  }

  def detached(): Unit = {
    println("Lifecycle - detached")
  }

  def attributeChanged(aName: String, aType: String): Unit = {
    println(s"Lifecycle - attributeChanged : $aName , $aType")
  }
}
