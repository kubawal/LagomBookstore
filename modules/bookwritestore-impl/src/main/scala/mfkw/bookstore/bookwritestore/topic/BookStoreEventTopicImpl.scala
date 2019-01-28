package mfkw.bookstore.bookwritestore.topic
import akka.stream.scaladsl.Source
import com.lightbend.lagom.scaladsl.api.broker.Topic
import com.lightbend.lagom.scaladsl.broker.TopicProducer
import mfkw.bookstore.bookwritestore.service.BookWriteStoreServiceImpl

trait BookStoreEventTopicImpl extends BookStoreEventTopic {
    this: BookWriteStoreServiceImpl =>

    override def bookStoreEvents: Topic[BookStoreEvent] = TopicProducer.singleStreamWithOffset(_ => Source.empty)
}
