package example

import com.softwaremill.macwire._
import example.polymer.{Component, Property}
import example.wire.{EarnLotsOfMoney, MoneyEarningBusinessLogic}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

@JSExport
@ScalaJSDefined
class MyExample extends Component {

  println("ctor - constructed")

  override val is: String = "scala-js-polymer-app"

  override def properties = js.Dynamic.literal(
    "prop1" -> Property("String", "Green eggs and ham, Sam I am")
  )

  override def beforeRegister(): Unit = {
    println("beforeRegister executed in ScalaJS")
  }

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
