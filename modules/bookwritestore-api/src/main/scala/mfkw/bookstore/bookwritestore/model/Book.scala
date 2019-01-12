package mfkw.bookstore.bookwritestore.model

import mfkw.bookstore.utils.Formattable

case class Book(isbn: String, title: String, author: String, description: String)
object Book extends Formattable[Book]

case class BookInstance(id: Long, isbn: String, isPresent: Boolean)
object BookInstance extends Formattable[BookInstance]
