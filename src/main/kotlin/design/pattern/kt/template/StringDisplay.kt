package design.pattern.kt.template

class StringDisplay(private val string :String) : AbstractDisplay(){
    private val width: Int = string.length

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$string|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")
        repeat(width) { print("-") }
        println("+")

    }
}