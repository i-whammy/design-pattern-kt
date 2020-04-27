package design.pattern.kt.template

fun main() {
    val d1: AbstractDisplay = CharDisplay('H')
    val d2: AbstractDisplay = StringDisplay("Hello, world")
    val d3: AbstractDisplay = StringDisplay("こんにちは")

    d1.display()
    d2.display()
    d3.display()
}