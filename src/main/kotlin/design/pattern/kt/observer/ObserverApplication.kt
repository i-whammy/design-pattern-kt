package design.pattern.kt.observer

fun main() {
    val randomNumberGenerator = RandomNumberGenerator()
    val digitObserver = DigitObserver()
    val graphObserver = GraphObserver()
    randomNumberGenerator.addObserver(digitObserver)
    randomNumberGenerator.addObserver(graphObserver)
    randomNumberGenerator.execute()
}