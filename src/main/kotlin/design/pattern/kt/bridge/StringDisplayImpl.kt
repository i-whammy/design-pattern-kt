package design.pattern.kt.bridge

class StringDisplayImpl(private val string: String): DisplayImpl() {
    private val width = string.length
    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("*")
        repeat(width) { print("-")}
        println("*")
    }
}