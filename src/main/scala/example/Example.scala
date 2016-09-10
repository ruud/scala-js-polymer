package example

import example.polymer.{Polymer, PolymerComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

@JSExport
class MyExampleComponent extends PolymerComponent {

  override def build(): Unit = {
    Polymer(js.constructorOf[ScalaJsPolymerApp])
  }

}
