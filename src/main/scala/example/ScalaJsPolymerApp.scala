package example

import example.polymer.{PolymerElement, Property}
import example.wire.WiredModules

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class ScalaJsPolymerApp extends PolymerElement {

  var prop1: String = "initial"

  override val is: String = "scala-js-polymer-app"

  override def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }

  override def properties = js.Dynamic.literal(
    "prop1" -> Property("String", "Green eggs and ham, Sam I am")
  )

  override def created(): Unit = {
    println(WiredModules.earnLotsOfMoney.doIt())
    println("lifecycle - created")
  }

  override def ready(): Unit = {
    println(WiredModules.earnLotsOfMoney.doIt())
    println("lifecycle - ready")
  }

  override def attached(): Unit = {
    println(WiredModules.earnLotsOfMoney.doIt())
    println("Lifecycle - attached")
  }

  override def detached(): Unit = {
    println("Lifecycle - detached")
  }

  override def attributeChanged(aName: String, aType: String): Unit = {
    println(s"Lifecycle - attributeChanged : $aName , $aType")
  }

  def setTextShare(): Unit = {
    this.prop1 = "Share!!"
  }

  def setTextExplore(): Unit = {
    this.prop1 = "Explore!!"
  }

}
