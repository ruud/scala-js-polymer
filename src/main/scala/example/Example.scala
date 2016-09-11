package example

import example.polymer.{Polymer, PolymerComponent}
import example.wire.MainModule

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@JSExport
object MyExampleComponent extends PolymerComponent with MainModule {

  override def build(): Unit = {
    println("Polymer component build")
    Polymer(js.constructorOf[ScalaJsPolymerApp])
  }

  @JSExport
  def buttonClicked(): Unit = {
    println(earnLotsOfMoney.doIt())
  }
}
