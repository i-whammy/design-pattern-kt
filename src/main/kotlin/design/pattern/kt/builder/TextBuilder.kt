package design.pattern.kt.builder

class TextBuilder: Builder {
    private val builder = StringBuilder()
    override fun makeTitle(title: String) {
        builder.append("======================\n")
        builder.append("[$title]\n")
        builder.append("\n")
    }

    override fun makeString(str: String) {
        builder.append("■$str\n")
        builder.append("\n")
    }

    override fun makeItems(items: Array<String>) {
        items.forEach { builder.append("$it\n") }
        builder.append("\n")
    }

    override fun close() {
        builder.append("======================\n")
    }

    fun getResult() :String {
        return builder.toString()
    }
}