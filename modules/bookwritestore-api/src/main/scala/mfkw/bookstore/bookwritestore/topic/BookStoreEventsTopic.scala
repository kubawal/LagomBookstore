package mfkw.bookstore.bookwritestore.topic

import com.lightbend.lagom.scaladsl.api.broker.Topic

trait BookStoreEventsTopic {
    def bookStoreEvents: Topic[BookStoreEvent]
}
