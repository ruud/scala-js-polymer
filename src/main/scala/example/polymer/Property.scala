package example.polymer

import scala.scalajs.js

@js.native
trait Property extends js.Object {
  val aType: String = js.native
  val aValue: String = js.native
}

object Property {
  def apply(aType: String, aValue: String): Property =
    js.Dynamic.literal("type" -> aType, "value" -> aValue).asInstanceOf[Property]
}