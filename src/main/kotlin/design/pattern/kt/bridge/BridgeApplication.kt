package design.pattern.kt.bridge

fun main() {
    val d1 = Display(StringDisplayImpl("Hello, Japan."))
    val d2: Display = CountDisplay(StringDisplayImpl("Hello, Japan."))
    val d3 = CountDisplay(StringDisplayImpl("Hello, Japan."))
    d1.display()
    d2.display()
    d3.multiDisplay(5)
}