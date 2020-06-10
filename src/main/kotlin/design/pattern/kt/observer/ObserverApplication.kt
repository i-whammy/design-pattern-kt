package design.pattern.kt.observer

fun main() {
    val incrementalGenerator = IncrementalGenerator(10, 50, 5)
    val digitObserver = DigitObserver()
    val graphObserver = GraphObserver()
    val hexadecimalObserver = HexadecimalObserver()
    incrementalGenerator.addObserver(digitObserver)
    incrementalGenerator.addObserver(graphObserver)
    incrementalGenerator.addObserver(hexadecimalObserver)
    incrementalGenerator.execute()
}