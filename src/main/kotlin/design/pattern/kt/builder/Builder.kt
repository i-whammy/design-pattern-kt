package design.pattern.kt.builder

abstract class Builder {
    private var initialized = false
    fun makeTitle(title: String) {
        if (!initialized) {
            buildTitle(title)
            initialized = true
        }
    }

    fun makeString(str: String) {
        if (initialized) {
            buildString(str)
        }
    }

    fun makeItems(items: Array<String>) {
        if (initialized) {
            buildItems(items)
        }
    }

    fun close() {
        if (initialized) {
            close()
        }
    }

    abstract fun buildTitle(title: String)
    abstract fun buildString(str: String)
    abstract fun buildItems(items: Array<String>)
    abstract fun buildDone()
}