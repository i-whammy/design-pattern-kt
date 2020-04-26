package design.pattern.kt.iterator

class BookShelf() : Aggregate<Book> {

    private var books: MutableList<Book> = mutableListOf()
    private var last: Int = 0

    override fun iterator(): Iterator<Book> {
        return BookShelfIterator(this)
    }

    fun getBookAt(index: Int): Book = books[index]
    fun getLength(): Int = last
    fun appendBook(book: Book) {
        this.books.add(book)
        this.last++
    }
}