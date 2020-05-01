package design.pattern.kt.prototype

data class UnderlinePen(private val ulchar: Char): Product {
    override fun use(s: String) {
        val length = s.length
        println("\"$s\"")
        println(ulchar.toString().repeat(length))
        println("")
    }

    override fun createClone(): Product {
        return copy()
    }
}