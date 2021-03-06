package example

import eu.unicredit.ToDo
import example.polymer.{PolymerElement, Property}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class ScalaJsPolymerApp extends PolymerElement {

  var prop1: String = "initial"

  override def is: String = "scala-js-polymer-app"

  override def beforeRegister(): Unit = {
    println("beforeRegister executed for ScalaJsPolymerApp")
  }

  override def properties = js.Dynamic.literal(
    "prop1" -> Property("String", "Green eggs and ham, Sam I am")
  )

  override def created(): Unit = {
    println("lifecycle - created")
  }

  override def ready(): Unit = {
    println("lifecycle - ready")
    ToDo.start
  }

  override def attached(): Unit = {
    println("Lifecycle - attached")
  }

  override def detached(): Unit = {
    println("Lifecycle - detached")
  }

  override def attributeChanged(aName: String, aType: String): Unit = {
    println(s"Lifecycle - attributeChanged : $aName , $aType")
  }

}
