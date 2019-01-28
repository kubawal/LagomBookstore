package mfkw.bookstore.bookwritestore.persistence

import mfkw.bookstore.bookwritestore.model.{Book, BookInstance}
import play.api.libs.json.{Format, Json}

case class BookState(book: Book, instances: Seq[BookInstance])

object BookState {
    implicit val format: Format[BookState] = Json.format

    val notInitialized = BookState(Book("", "", "", ""), Seq.empty)
}