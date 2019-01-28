package mfkw.bookstore.bookwritestore.model

import play.api.libs.json.{Format, Json}

case class Book(isbn: String, title: String, author: String, description: String)

object Book {
    implicit val format: Format[Book] = Json.format
}

case class BookInstance(id: Long, isbn: String, isPresent: Boolean)

object BookInstance {
    implicit val format: Format[BookInstance] = Json.format
}
