package design.pattern.kt.bridge

fun main() {
    val d1 = Display(StringDisplayImpl("Hello, Japan."))
    val d2: Display = CountDisplay(StringDisplayImpl("Hello, Japan."))
    val d3 = CountDisplay(StringDisplayImpl("Hello, Japan."))
    val d4 = RandomDisplay(StringDisplayImpl("This will be random display."))
    val d5 = Display(FileDisplayImpl("src/main/resources/builder/file.txt"))
    d1.display()
    d2.display()
    d3.multiDisplay(5)
    d4.randomDisplay(4)
    d5.display()
}