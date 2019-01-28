package mfkw.bookstore.bookwritestore.loader

import com.lightbend.lagom.scaladsl.broker.kafka.LagomKafkaComponents
import com.lightbend.lagom.scaladsl.persistence.cassandra.CassandraPersistenceComponents
import com.lightbend.lagom.scaladsl.playjson.JsonSerializerRegistry
import com.lightbend.lagom.scaladsl.server.{LagomApplication, LagomApplicationContext, LagomServer}
import mfkw.bookstore.bookwritestore.service.{BookWriteStoreService, BookWriteStoreServiceImpl}
import play.api.libs.ws.ahc.AhcWSComponents
import com.softwaremill.macwire.wire
import mfkw.bookstore.bookwritestore.serializer.BookWriteStoreSerializerRegistry

abstract class BookWriteStoreApplication(context: LagomApplicationContext) extends LagomApplication(context)
    with AhcWSComponents
    with LagomKafkaComponents
    with CassandraPersistenceComponents {

    override lazy val lagomServer: LagomServer = serverFor[BookWriteStoreService](wire[BookWriteStoreServiceImpl])
    override lazy val jsonSerializerRegistry: JsonSerializerRegistry = BookWriteStoreSerializerRegistry
}
