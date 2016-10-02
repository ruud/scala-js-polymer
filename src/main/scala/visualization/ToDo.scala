package eu.unicredit

import akka.actor._
import example.TodoInput
import org.scalajs.dom.document.{getElementById => getElem}

import scalatags.JsDom.all._

object ToDo {

  lazy val todoInput = typedTag[TodoInput]("todo-input", void = true)

  implicit lazy val system = ActorSystem("todo", AkkaConfig.config)

  def start = system.actorOf(Props(ToDoList()), "page")

  case class ToDoList() extends DomActor {

    override val domElement = Some(getElem("root"))

    val inputBox = todoInput().render

    def template() = div(cls := "input-wrapper")(
          inputBox,
          tag("paper-button")(
            attr("onclick") := {
              () => context.actorOf(Props(ToDoElem(inputBox.todoInputValue)))
            }
          )("Add")
      )
  }

  case class ToDoElem(value: String) extends DomActor {
    def template() = tag("paper-material")(style := "margin: 8px;")(
      tag("paper-icon-button")(
        attr("icon") := "todo-icons:delete",
        style := "margin-left: 16px",
        attr("aria-label") := "Delete Todo",
        onclick := {
          () => self ! PoisonPill
        }
      ),
      span(value)(
        style := "font-family: 'Roboto Slab', 'Roboto', 'Helvetica', 'Arial', sans-serif; font-size: 20px;"
      )
    )

  }

}
