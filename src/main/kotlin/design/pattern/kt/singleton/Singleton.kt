package design.pattern.kt.singleton

class Singleton private constructor() {
    init {
        println("Initialized.")
    }

    companion object {
        private val singleton: Singleton = Singleton()
        fun getInstance() = singleton
    }
}