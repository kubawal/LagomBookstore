package mfkw.bookstore.bookwritestore.command

import mfkw.bookstore.utils.Formattable

case class BookInstanceData(isPresent: Option[Boolean] = None)
object BookInstanceData extends Formattable[BookInstanceData]
