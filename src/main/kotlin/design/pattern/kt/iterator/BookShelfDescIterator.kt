package design.pattern.kt.iterator 

class BookShelfDescIterator(private val bookShelf: BookShelf) : DescIterator<Book> {
    private var index = bookShelf.getLength() - 1

    override fun hasPrevious(): Boolean {
        return index >= 0
    }

    override fun previous(): Book {
        val book = bookShelf.getBookAt(index)
        index--
        return book
    }
}
