package example.polymer

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportDescendentObjects, ScalaJSDefined}

@js.native
object Polymer extends PolymerBase {
  def apply(prototype: js.Any): PolymerBase = js.native
}

@ScalaJSDefined
trait PolymerElement extends js.Object {
  val is: String
  def beforeRegister(): Unit
}

@js.native
trait PolymerBase extends js.Object {
  val properties: js.Dynamic = js.native
}

@JSExportDescendentObjects
trait PolymerComponent {
  @JSExport
  def build(): Unit
}
