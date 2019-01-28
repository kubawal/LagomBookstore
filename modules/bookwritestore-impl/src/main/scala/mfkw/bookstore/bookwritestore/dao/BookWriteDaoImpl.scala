package mfkw.bookstore.bookwritestore.dao

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall
import mfkw.bookstore.bookwritestore.command.{BookData, BookInstanceData, NewBookData, NewBookInstanceData}
import mfkw.bookstore.bookwritestore.model.{Book, BookInstance}

import scala.concurrent.Future

trait BookWriteDaoImpl extends BookWriteDao {
    def createBook(isbn: String): ServiceCall[NewBookData, Book]
        = ServiceCall { _ => Future.successful(Book("", "", "", "")) }
    def updateBook(isbn: String): ServiceCall[BookData, NotUsed]
        = ServiceCall { _ => Future.successful(NotUsed) }
    def deleteBook(isbn: String): ServiceCall[NotUsed, NotUsed]
        = ServiceCall { _ => Future.successful(NotUsed) }

    def addBookInstance(isbn: String): ServiceCall[NewBookInstanceData, BookInstance]
        = ServiceCall { _ => Future.successful(BookInstance(123, "", isPresent = true)) }
    def updateBookInstance(isbn: String, id: Long): ServiceCall[BookInstanceData, NotUsed]
        = ServiceCall { _ => Future.successful(NotUsed) }
    def deleteBookInstance(isbn: String, id: Long): ServiceCall[NotUsed, NotUsed]
        = ServiceCall { _ => Future.successful(NotUsed) }
}
