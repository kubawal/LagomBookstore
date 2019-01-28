package mfkw.bookstore.bookwritestore.loader

import com.lightbend.lagom.scaladsl.devmode.LagomDevModeComponents
import com.lightbend.lagom.scaladsl.server.{LagomApplicationContext, LagomApplicationLoader}
import com.lightbend.rp.servicediscovery.lagom.scaladsl.LagomServiceLocatorComponents
import mfkw.bookstore.bookwritestore.service.BookWriteStoreService

class BookWriteStoreLoader extends LagomApplicationLoader {
    override def load(context: LagomApplicationContext) =
        new BookWriteStoreApplication(context) with LagomServiceLocatorComponents

    override def loadDevMode(context: LagomApplicationContext) =
        new BookWriteStoreApplication(context) with LagomDevModeComponents

    override def describeService = Some(readDescriptor[BookWriteStoreService])
}
