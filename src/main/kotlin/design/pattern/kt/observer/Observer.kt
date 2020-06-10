package design.pattern.kt.observer

interface Observer {
    fun update(generator: NumberGenerator)
}