package example.polymer

import example.wire.WiredModules
import org.scalajs.dom.raw.HTMLElement

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportDescendentObjects, JSName, ScalaJSDefined}

@js.native
object Polymer extends js.Object {
  def apply(prototype: Dynamic): js.Dynamic = js.native
}

@ScalaJSDefined
abstract class PolymerElement extends PolymerBase {
  val is: String
  def beforeRegister(): Unit
  def properties: js.Dynamic
  def created(): Unit
  def ready(): Unit
  def attached(): Unit
  def detached(): Unit
  def attributeChanged(aName: String, aType: String): Unit
}

@js.native
@JSName("Polymer.Base")
abstract class PolymerBase extends HTMLElement

@JSExportDescendentObjects
trait PolymerComponent {
  @JSExport
  def bootstrap(): Unit
}
