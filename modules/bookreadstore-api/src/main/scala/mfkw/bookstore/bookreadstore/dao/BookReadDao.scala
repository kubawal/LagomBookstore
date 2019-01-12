package mfkw.bookstore.bookreadstore.dao

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall
import mfkw.bookstore.bookreadstore.model.{Book, BookInstance}

trait BookReadDao {
    def getBook(isbn: String): ServiceCall[NotUsed, Book]
    def getBookInstances(isbn: String): ServiceCall[NotUsed, List[BookInstance]]
    def getBookInstanceCount(isbn: String): ServiceCall[NotUsed, Int]
    def getBookPresentInstances(isbn: String): ServiceCall[NotUsed, List[BookInstance]]
    def getBookPresentInstanceCount(isbn: String): ServiceCall[NotUsed, Int]

    def getBookInstance(id: Long): ServiceCall[NotUsed, BookInstance]
}
