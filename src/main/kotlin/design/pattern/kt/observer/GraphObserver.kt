package design.pattern.kt.observer

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        print("GraphObserver:")
        val number = generator.getNumber()
        println("*".repeat(number))
        println("")
        try {
            Thread.sleep(100)
        } catch (e: InterruptedException) {

        }
    }
}