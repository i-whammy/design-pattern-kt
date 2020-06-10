package design.pattern.kt.observer

class HexadecimalObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("HexadecimalObserver: ${generator.getNumber().toString(16)}")
    }
}