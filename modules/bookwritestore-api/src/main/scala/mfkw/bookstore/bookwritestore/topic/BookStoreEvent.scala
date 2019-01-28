package mfkw.bookstore.bookwritestore.topic

import julienrf.json.derived
import mfkw.bookstore.bookwritestore.model.{Book, BookInstance}
import play.api.libs.json.{__, Format, Json}

sealed trait BookStoreEvent

object BookStoreEvent {
    case class BookCreated(book: Book) extends BookStoreEvent
    case class BookUpdated(book: Book) extends BookStoreEvent
    case class BookDeleted(book: Book) extends BookStoreEvent

    case class BookInstanceAdded(book: Book, instance: BookInstance) extends BookStoreEvent
    case class BookInstanceUpdated(book: Book, instance: BookInstance) extends BookStoreEvent
    case class BookInstanceDeleted(book: Book, instance: BookInstance) extends BookStoreEvent

    implicit val format: Format[BookStoreEvent] = derived.flat.oformat((__ \ "type").format[String])
    object BookCreated {
        implicit val format: Format[BookCreated] = Json.format
    }
    object BookUpdated {
        implicit val format: Format[BookUpdated] = Json.format
    }
    object BookDeleted {
        implicit val format: Format[BookDeleted] = Json.format
    }
    object BookInstanceAdded {
        implicit val format: Format[BookInstanceAdded] = Json.format
    }
    object BookInstanceUpdated {
        implicit val format: Format[BookInstanceUpdated] = Json.format
    }
    object BookInstanceDeleted {
        implicit val format: Format[BookInstanceDeleted] = Json.format
    }
}