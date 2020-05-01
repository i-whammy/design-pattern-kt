package design.pattern.kt.singleton

import kotlin.test.Test
import kotlin.test.assertEquals

class TripleTest {
    @Test
    fun testGetFirstInstance() {
        val instance1 = Triple.getInstance(1)
        assertEquals(0, instance1.number)
    }

    @Test
    fun testGetSecondInstance() {
        val instance2 = Triple.getInstance(2)
        assertEquals(1, instance2.number)
    }

    @Test
    fun testGetThirdInstance() {
        val instance3 = Triple.getInstance(3)
        assertEquals(2, instance3.number)
    }

    @Test(expected = InvalidArgumentException::class)
    fun testGetThrowsExceptionWhenArgumentIsNotBetween1to3() {
        Triple.getInstance(-1)
    }
}