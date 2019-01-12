package mfkw.bookstore.bookwritestore.command

import mfkw.bookstore.utils.Formattable

case class BookData(title: Option[String] = None, author: Option[String] = None, description: Option[String] = None)
object BookData extends Formattable[BookData]