package mfkw.bookstore.bookwritestore.service

import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Descriptor, Service}
import mfkw.bookstore.bookwritestore.dao.BookWriteDao
import mfkw.bookstore.bookwritestore.topic.BookStoreEventsTopic

trait BookWriteStoreService extends Service
    with BookWriteDao with BookStoreEventsTopic {
    override def descriptor: Descriptor = {
        import Service._

        named("bookwritestore").withCalls(
            restCall(Method.POST, "/book/:isbn/", createBook _),
            restCall(Method.PUT, "/book/:isbn/", updateBook _),
            restCall(Method.DELETE, "/book/:isbn/", deleteBook _),

            restCall(Method.POST, "/book/:isbn/instances/", addBookInstance _),
            restCall(Method.PUT, "/book/:isbn/instances/:id/", updateBookInstance _),
            restCall(Method.DELETE, "/book/:isbn/instances/:id/", deleteBookInstance _)
        ).withTopics(
            topic(BookWriteStoreService.BOOKSTORE_EVENTS, bookStoreEvents)
        ).withAutoAcl(true)
    }
}

object BookWriteStoreService {
    val BOOKSTORE_EVENTS = "bookwritestore.bookstore-events"
}
