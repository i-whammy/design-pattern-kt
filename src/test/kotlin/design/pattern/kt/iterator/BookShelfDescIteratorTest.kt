package design.pattern.kt.iterator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BookShelfDescIteratorTest {

    private val bookShelf = BookShelf()

    private val descIterator = BookShelfDescIterator(bookShelf)

    @Test
    fun testHasPreviousReturnsTrueWhenItHasPreviousBook() {
        bookShelf.appendBook(Book("Last Book"))
        descIterator.resetIndex()
        assertTrue { descIterator.hasPrevious() }
    }

    @Test
    fun testHasPreviousReturnsFalseWhenItHasNoBook() {
        assertFalse { descIterator.hasPrevious() }
    }

    @Test
    fun testHasPreviousReturnsFalseWhenItHasNoBookLeft() {
        bookShelf.appendBook(Book("Last Book"))
        descIterator.resetIndex()
        descIterator.previous()
        assertFalse { descIterator.hasPrevious() }
    }

    @Test
    fun testPreviousReturnsFirstBook() {
        val lastBook = Book("Last Book")
        bookShelf.appendBook(lastBook)
        descIterator.resetIndex()
        assertEquals(lastBook, descIterator.previous())
    }

    @Test
    fun testPreviousReturnsSecondBookWhenFirstBookIsAlreadyReturned() {
        val lastBook = Book("Last Book")
        val secondBook = Book("Second Book")
        bookShelf.appendBook(lastBook)
        bookShelf.appendBook(secondBook)
        descIterator.resetIndex()
        descIterator.previous()     
        assertEquals(lastBook, descIterator.previous())
    }

    @Test(expected = NoBooksAvailableException::class)
    fun testPreviousThrowsNoBooksAvaliableException() {
        descIterator.previous()
    }

    @Test
    fun testResetIndexTo2WhenThreeBooksAreAppended() {
        bookShelf.appendBook(Book("Book 1"))
        bookShelf.appendBook(Book("Book 2"))
        bookShelf.appendBook(Book("Book 3"))
        assertEquals(2, descIterator.resetIndex())
    }
}