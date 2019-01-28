package mfkw.bookstore.bookwritestore.topic

import com.lightbend.lagom.scaladsl.api.broker.Topic

trait BookStoreEventTopic {
    def bookStoreEvents: Topic[BookStoreEvent]
}
