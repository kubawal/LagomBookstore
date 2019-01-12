package mfkw.bookstore.bookreadstore.service

import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Descriptor, Service}
import mfkw.bookstore.bookreadstore.dao.BookReadDao

trait BookReadStoreService extends Service
    with BookReadDao
{
    final override def descriptor: Descriptor = {
        import Service._

        named("bookreadstore").withCalls(
            restCall(Method.GET, "/book/:isbn", getBook _),
            restCall(Method.GET, "/book/:isbn/instances", getBookInstances _),
            restCall(Method.GET, "/book/:isbn/instances/count", getBookInstanceCount _),
            restCall(Method.GET, "/book/:isbn/presentInstances/", getBookPresentInstances _),
            restCall(Method.GET, "/book/:isbn/presentInstances/count", getBookPresentInstanceCount _),
            restCall(Method.GET, "/bookInstance/:id", getBookInstance _)
        ).withAutoAcl(true)
    }
}
