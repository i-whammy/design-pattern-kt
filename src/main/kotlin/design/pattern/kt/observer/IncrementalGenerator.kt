package design.pattern.kt.observer

import kotlin.properties.Delegates

class IncrementalGenerator(private val startNumber: Int, private val endNumber: Int, private val incrementNumber: Int): NumberGenerator() {
    private var num: Int by Delegates.notNull()
    override fun getNumber(): Int {
        return num
    }

    override fun execute() {
        for (i in 0 until (endNumber - startNumber) / incrementNumber) {
            num = startNumber + incrementNumber * i
            notifyObservers()
        }
    }
}