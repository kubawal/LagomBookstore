package mfkw.bookstore.bookwritestore.topic

import mfkw.bookstore.bookwritestore.model.{Book, BookInstance}
import mfkw.bookstore.utils.{Formattable, FormattableBase}

sealed trait BookStoreEvent {
    case class BookCreated(book: Book) extends BookStoreEvent
    case class BookUpdated(book: Book) extends BookStoreEvent
    case class BookDeleted(book: Book) extends BookStoreEvent

    case class BookInstanceAdded(book: Book, instance: BookInstance) extends BookStoreEvent
    case class BookInstanceUpdated(book: Book, instance: BookInstance) extends BookStoreEvent
    case class BookInstanceDeleted(book: Book, instance: BookInstance) extends BookStoreEvent

    object BookCreated extends Formattable[BookCreated]
    object BookUpdated extends Formattable[BookUpdated]
    object BookDeleted extends Formattable[BookDeleted]
    object BookInstanceAdded extends Formattable[BookInstanceAdded]
    object BookInstanceUpdated extends Formattable[BookInstanceUpdated]
    object BookInstanceDeleted extends Formattable[BookInstanceDeleted]
}

object BookStoreEvent extends FormattableBase[BookStoreEvent]
