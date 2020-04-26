package design.pattern.kt.iterator

fun main(args: Array<String>) {
    val bookShelf = BookShelf()
    bookShelf.appendBook(Book("Iterator"))
    bookShelf.appendBook(Book("Adaptor"))
    bookShelf.appendBook(Book("Template Method"))
    bookShelf.appendBook(Book("Factory Method"))
    bookShelf.appendBook(Book("Singleton"))

    val iterator = bookShelf.iterator()
    val descIterator = bookShelf.descIterator()

    while (iterator.hasNext()) {
        println(iterator.next().getName())
    }

    while (descIterator.hasPrevious()) {
        println(descIterator.previous().getName())
    }
}
