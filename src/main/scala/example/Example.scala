package example

import example.polymer.{Polymer, PolymerApplication}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

object MyExampleApplication extends PolymerApplication {

  override def bootstrap(): Unit = {
    println("Polymer component build")
    // bootstrap Polymer with 'ScalaJsPolymerApp' element
    Polymer(js.constructorOf[ScalaJsPolymerApp])
  }

  @JSExport
  def todoInputElement(): Unit = {
    println("Polymer component todo-input")
    // bootstrap Polymer with 'ScalaJsPolymerApp' element
    Polymer(js.constructorOf[TodoInput])
  }

}
