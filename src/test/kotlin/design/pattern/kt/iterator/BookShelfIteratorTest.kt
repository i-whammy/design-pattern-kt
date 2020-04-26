package design.pattern.kt.iterator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BookShelfIteratorTest {

    private val bookShelf = BookShelf()

    private val bookShelfIterator = BookShelfIterator(bookShelf)

    @Test
    fun testHasNextReturnsTrueWhenItHasNextBook() {
        bookShelf.appendBook(Book("First book"))
        assertTrue { bookShelfIterator.hasNext() }
    }

    @Test
    fun testHasNextReturnsFalseWhenItHasNoBook() {
        assertFalse { bookShelfIterator.hasNext() }
    }

    @Test
    fun testHasNextReturnsFalseWhenItHasNoBookLeft() {
        bookShelf.appendBook(Book("The only book"))
        bookShelfIterator.next()
        assertFalse { bookShelfIterator.hasNext() }
    }

    @Test
    fun testNextReturnsFirstBook() {
        val firstBook = Book("First book")
        bookShelf.appendBook(firstBook)
        assertEquals(firstBook, bookShelfIterator.next())
    }

    @Test
    fun testNextReturnsSecondBookWhenTheFirstBookIsAlreadyCalled() {
        val firstBook = Book("First book")
        val secondBook = Book("Second book")
        bookShelf.appendBook(firstBook)
        bookShelf.appendBook(secondBook)
        bookShelfIterator.next()
        assertEquals(secondBook, bookShelfIterator.next())
    }

    @Test(expected = NoBooksAvailableException::class)
    fun testNextThrowsInvalidExceptionWhenNoBooksAreAvailable() {
        bookShelfIterator.next()
    }
}