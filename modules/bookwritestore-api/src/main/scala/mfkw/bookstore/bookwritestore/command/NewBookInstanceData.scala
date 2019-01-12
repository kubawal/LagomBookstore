package mfkw.bookstore.bookwritestore.command

import mfkw.bookstore.utils.Formattable

case class NewBookInstanceData(isPresent: Boolean)
object NewBookInstanceData extends Formattable[NewBookInstanceData]
