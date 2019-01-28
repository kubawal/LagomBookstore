package mfkw.bookstore.bookwritestore.command

import play.api.libs.json.{Format, Json}

case class NewBookInstanceData(isPresent: Boolean)

object NewBookInstanceData {
    implicit val format: Format[NewBookInstanceData] = Json.format
}
