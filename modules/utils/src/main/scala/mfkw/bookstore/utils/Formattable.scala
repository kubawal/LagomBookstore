package mfkw.bookstore.utils

import julienrf.json.derived
import play.api.libs.json.{Format, Json, __}

trait Formattable[A] {
    implicit val format: Format[A] = Json.format
}

trait FormattableBase[A] {
    implicit val format: Format[A] = derived.flat.oformat((__ \ "type").format[String])
}
