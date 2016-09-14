package example

import example.polymer.{Polymer, PolymerComponent}

import scala.scalajs.js

object MyExampleComponent extends PolymerComponent {

  override def bootstrap(): Unit = {
    println("Polymer component build")
    // bootstrap Polymer with 'ScalaJsPolymerApp' element
    Polymer(js.constructorOf[ScalaJsPolymerApp])
  }

}
