package mfkw.bookstore.bookwritestore.dao

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall
import mfkw.bookstore.bookwritestore.command.{BookData, BookInstanceData, NewBookData, NewBookInstanceData}
import mfkw.bookstore.bookwritestore.model.{Book, BookInstance}

trait BookWriteDao {
    def createBook(isbn: String): ServiceCall[NewBookData, Book]
    def updateBook(isbn: String): ServiceCall[BookData, NotUsed]
    def deleteBook(isbn: String): ServiceCall[NotUsed, NotUsed]

    def addBookInstance(isbn: String): ServiceCall[NewBookInstanceData, BookInstance]
    def updateBookInstance(isbn: String, id: Long): ServiceCall[BookInstanceData, NotUsed]
    def deleteBookInstance(isbn: String, id: Long): ServiceCall[NotUsed, NotUsed]
}
