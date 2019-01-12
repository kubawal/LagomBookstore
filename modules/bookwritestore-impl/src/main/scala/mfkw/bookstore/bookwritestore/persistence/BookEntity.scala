package mfkw.bookstore.bookwritestore.persistence

import com.lightbend.lagom.scaladsl.persistence.PersistentEntity

class BookEntity extends PersistentEntity{
    override type Command = BookCommand
    override type State = BookState
    override type Event = BookState

    override def initialState: BookState = BookState.notInitialized

    override def behavior: Behavior = Actions()
}
