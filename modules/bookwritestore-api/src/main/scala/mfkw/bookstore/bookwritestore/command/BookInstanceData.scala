package mfkw.bookstore.bookwritestore.command

import play.api.libs.json.{Format, Json}

case class BookInstanceData(isPresent: Option[Boolean] = None)

object BookInstanceData {
    implicit val format: Format[BookInstanceData] = Json.format
}
