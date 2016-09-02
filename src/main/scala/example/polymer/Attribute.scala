package example.polymer

import scala.scalajs.js

@js.native
trait Attribute extends js.Object {
  val aType: String = js.native
  val aValue: String = js.native
}

object Attribute {
  def apply(aType: String, aValue: String): Attribute =
    js.Dynamic.literal("type" -> aType, "value" -> aValue).asInstanceOf[Attribute]
}