package design.pattern.kt.observer

import java.util.*
import kotlin.properties.Delegates

class RandomNumberGenerator: NumberGenerator() {
    private val random = Random()
    private var num: Int by Delegates.notNull()

    override fun getNumber(): Int {
        return num
    }

    override fun execute() {
        repeat(20) {
            num = random.nextInt(50)
            notifyObservers()
        }
    }
}