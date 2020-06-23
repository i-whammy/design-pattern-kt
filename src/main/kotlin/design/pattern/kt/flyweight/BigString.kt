package design.pattern.kt.flyweight

class BigString(string: String) {
    private var bigchars = emptyArray<BigChar>()

    init {
        bigchars = Array(string.length) { BigChar('-') }
        val factory = BigCharFactory.getInstance()
        string.forEachIndexed { index, c ->
            bigchars[index] = factory.getBigChar(c)
        }
    }

    fun print() {
        bigchars.forEach { it.print() }
    }
}