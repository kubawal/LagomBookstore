package mfkw.bookstore.bookwritestore.service

import mfkw.bookstore.bookwritestore.dao.BookWriteDaoImpl
import mfkw.bookstore.bookwritestore.topic.BookStoreEventTopicImpl

import scala.concurrent.ExecutionContext

class BookWriteStoreServiceImpl(implicit ec: ExecutionContext) extends BookWriteStoreService
    with BookWriteDaoImpl
    with BookStoreEventTopicImpl {

}
