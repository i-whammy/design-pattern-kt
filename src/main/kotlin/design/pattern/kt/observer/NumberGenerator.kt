package design.pattern.kt.observer

abstract class NumberGenerator {
    private val observers = mutableListOf<Observer>()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun deleteObserver(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObservers() {
        val iterator = observers.iterator()
        while (iterator.hasNext()) {
            val observer = iterator.next()
            observer.update(this)
        }
    }

    abstract fun getNumber(): Int
    abstract fun execute()
}