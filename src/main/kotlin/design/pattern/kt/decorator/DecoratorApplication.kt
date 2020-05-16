package design.pattern.kt.decorator

fun main() {
    val d1 = StringDisplay("Hello, world")
    val d2 = SideBorder(d1, '#')
    val d3 = FullBorder(d2)
    d1.show()
    d2.show()
    d3.show()
    val d4 = SideBorder(FullBorder(SideBorder(FullBorder(StringDisplay("こんにちは。")), '#')), '/')
    d4.show()
}