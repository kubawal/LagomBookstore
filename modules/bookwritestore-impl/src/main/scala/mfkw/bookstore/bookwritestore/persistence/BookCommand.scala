package mfkw.bookstore.bookwritestore.persistence

import mfkw.bookstore.bookreadstore.model.Book
import play.api.libs.json.{Format, Json}

sealed trait BookCommand {
    case class Update(newBook: Book) extends BookCommand
    case class AddInstance(instanceId: Long) extends BookCommand
    case class RemoveInstance(instanceId: Long) extends BookCommand
    case class BorrowInstance(instanceId: Long) extends BookCommand
    case class ReturnInstance(instanceId: Long) extends BookCommand
}

object BookCommand {
    implicit val format: Format[BookCommand] = Json.format
}
