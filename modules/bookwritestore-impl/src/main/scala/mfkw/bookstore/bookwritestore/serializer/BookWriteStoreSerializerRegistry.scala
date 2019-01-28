package mfkw.bookstore.bookwritestore.serializer

import com.lightbend.lagom.scaladsl.playjson.{JsonSerializer, JsonSerializerRegistry}
import mfkw.bookstore.bookwritestore.command.{BookData, BookInstanceData, NewBookData, NewBookInstanceData}
import mfkw.bookstore.bookwritestore.model.{Book, BookInstance}
import mfkw.bookstore.bookwritestore.topic.BookStoreEvent

import scala.collection.immutable

object BookWriteStoreSerializerRegistry extends JsonSerializerRegistry {
    override def serializers: immutable.Seq[JsonSerializer[_]] = immutable.Seq(
        JsonSerializer[BookData],
        JsonSerializer[BookInstanceData],
        JsonSerializer[NewBookData],
        JsonSerializer[NewBookInstanceData],

        JsonSerializer[Book],
        JsonSerializer[BookInstance],

        JsonSerializer[BookStoreEvent],
        JsonSerializer[BookStoreEvent.BookCreated],
        JsonSerializer[BookStoreEvent.BookUpdated],
        JsonSerializer[BookStoreEvent.BookDeleted],
        JsonSerializer[BookStoreEvent.BookInstanceAdded],
        JsonSerializer[BookStoreEvent.BookInstanceUpdated],
        JsonSerializer[BookStoreEvent.BookInstanceDeleted]
    )
}
