package mfkw.bookstore.bookwritestore.persistence

import julienrf.json.derived
import mfkw.bookstore.bookwritestore.model.Book
import play.api.libs.json.{__, Format, Json}

sealed trait BookCommand

object BookCommand {
    implicit val format: Format[BookCommand] = derived.flat.oformat((__ \ "type").format[String])

    case class Update(newBook: Book) extends BookCommand
    case class AddInstance(instanceId: Long) extends BookCommand
    case class RemoveInstance(instanceId: Long) extends BookCommand
    case class BorrowInstance(instanceId: Long) extends BookCommand
    case class ReturnInstance(instanceId: Long) extends BookCommand
}
