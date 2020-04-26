package design.pattern.kt.iterator

class BookShelfIterator(private val bookShelf: BookShelf) : Iterator<Book> {
    private var index: Int = 0
    override fun hasNext(): Boolean = index < bookShelf.getLength()

    override fun next(): Book {
        if (hasNext()) {
            val book = bookShelf.getBookAt(index)
            index++
            return book
        } else throw NoBooksAvailableException()
    }
}
