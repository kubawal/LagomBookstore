package mfkw.bookstore.bookwritestore.command

import mfkw.bookstore.utils.Formattable
import play.api.libs.json.{Format, Json}

case class NewBookData(title: String, author: String, description: String)
object NewBookData extends Formattable[NewBookData]