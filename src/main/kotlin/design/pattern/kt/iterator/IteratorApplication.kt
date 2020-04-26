package design.pattern.kt.iterator

fun main(args: Array<String>) {
    val bookShelf = BookShelf(4)
    bookShelf.appendBook(Book("Iterator"))
    bookShelf.appendBook(Book("Adaptor"))
    bookShelf.appendBook(Book("Template Method"))
    bookShelf.appendBook(Book("Factory Method"))

    val iterator = bookShelf.iterator()
    while (iterator.hasNext()) {
        val book = iterator.next() as Book
        println(book.getName())
    }
}
