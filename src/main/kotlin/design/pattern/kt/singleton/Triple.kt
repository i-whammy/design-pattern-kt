package design.pattern.kt.singleton

class Triple private constructor(val number: Int) {
    companion object {
        private val instance1 = Triple(0)
        private val instance2 = Triple(1)
        private val instance3 = Triple(2)

        fun getInstance(id: Int): Triple {
            when (id) {
                1 -> return instance1
                2 -> return instance2
                3 -> return instance3
                else -> throw InvalidArgumentException()
            }
        }
    }
}

class InvalidArgumentException: Exception()