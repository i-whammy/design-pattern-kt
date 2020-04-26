package design.pattern.kt.iterator

class BookShelf(maxSize: Int) : Aggregate<Book> {

    private var books: Array<Book> = emptyArray()
    private var last: Int = 0

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }

    fun getBookAt(index: Int): Book = books[index]
    fun getLength(): Int = last
    fun appendBook(book: Book) {
        this.books[last] = book
        this.last++
    }

    init {
        this.books = Array(maxSize) { Book("no title") }
    }
}