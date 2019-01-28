package mfkw.bookstore.bookwritestore.command

import play.api.libs.json.{Format, Json}

case class NewBookData(title: String, author: String, description: String)

object NewBookData {
    implicit val format: Format[NewBookData] = Json.format
}