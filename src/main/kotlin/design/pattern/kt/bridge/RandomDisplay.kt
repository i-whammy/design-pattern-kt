package design.pattern.kt.bridge

import kotlin.random.Random

class RandomDisplay(private val displayImpl: DisplayImpl): Display(displayImpl) {
    fun randomDisplay(times: Int) {
        open()
        repeat(Random.nextInt(0, times)) { print() }
        close()
    }
}