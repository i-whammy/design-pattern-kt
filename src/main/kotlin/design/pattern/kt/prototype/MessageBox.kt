package design.pattern.kt.prototype

data class MessageBox(private val decochar: Char): Product {
    override fun use(s: String) {
        val length = s.length
        println(decochar.toString().repeat(length + 4))
        println("")
        println("$decochar $s $decochar")
        println("")
        println(decochar.toString().repeat(length + 4))
        println("")

    }

    override fun createClone(): Product {
        return copy()
    }
}