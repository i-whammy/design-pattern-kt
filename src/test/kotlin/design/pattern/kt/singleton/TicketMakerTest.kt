package design.pattern.kt.singleton

import kotlin.test.Test
import kotlin.test.assertEquals

class TicketMakerTest {
    @Test
    fun testThatTicketMakerIncrementsFrom1000() {
        assertEquals(1000, TicketMaker.getNextTicketNumber())
        assertEquals(1001, TicketMaker.getNextTicketNumber())
        assertEquals(1002, TicketMaker.getNextTicketNumber())
    }
}