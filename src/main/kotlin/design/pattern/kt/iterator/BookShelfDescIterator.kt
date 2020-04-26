package design.pattern.kt.iterator 

class BookShelfDescIterator(private val bookShelf: BookShelf) : DescIterator<Book> {
    private var index = bookShelf.getLength() - 1

    override fun hasPrevious(): Boolean {
        return index >= 0 && index < bookShelf.getLength()
    }

    override fun previous(): Book {
        if (hasPrevious()) {
            val book = bookShelf.getBookAt(index)
            index--
            return book
        } else throw NoBooksAvailableException()
    }

    override fun resetIndex(): Int {
        val newIndex = bookShelf.getLength() - 1
        index = newIndex
        return newIndex
    }
}
