package design.pattern.kt.flyweight

class BigCharFactory private constructor() {
    private val pool = mutableMapOf<Char, BigChar>()

    companion object {
        private val factory = BigCharFactory()

        fun getInstance(): BigCharFactory {
            return factory
        }
    }

    fun getBigChar(c: Char): BigChar {
        if (!pool.containsKey(c)) pool[c] = BigChar(c)
        return pool[c]!!
    }

    fun getRawBigChar(c: Char): BigChar {
        return BigChar(c)
    }
}