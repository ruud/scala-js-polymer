package example

import example.polymer.PolymerElement

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

@ScalaJSDefined
class TodoInput extends PolymerElement {

  override def is: String = "todo-input"

  var todoInputValue: String = "initial"

  override def beforeRegister(): Unit = {
    println("beforeRegister executed for TodoInput")
  }

  override def properties = js.Dynamic.literal()

  override def created(): Unit = {
    println("Lifecycle - created")
  }

  override def ready(): Unit = {
    println("lifecycle - ready")
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
