package design.pattern.kt.flyweight

class BigString(string: String, shared: Boolean) {
    private var bigchars = emptyArray<BigChar>()

    init {
        bigchars = Array(string.length) { BigChar('-') }
        val factory = BigCharFactory.getInstance()
        if (shared) {
            string.forEachIndexed { index, c ->
                bigchars[index] = factory.getBigChar(c)
            }
        } else {
            string.forEachIndexed { index, c ->
                bigchars[index] = factory.getRawBigChar(c)
            }

        }
    }

    fun print() {
        bigchars.forEach { it.print() }
    }
}