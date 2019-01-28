package mfkw.bookstore.bookwritestore.command

import play.api.libs.json.{Format, Json}

case class BookData(title: Option[String] = None, author: Option[String] = None, description: Option[String] = None)
object BookData
{
    implicit val format: Format[BookData] = Json.format
}