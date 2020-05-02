package design.pattern.kt.builder

class TextBuilder: Builder() {
    private val builder = StringBuilder()
    override fun buildTitle(title: String) {
        builder.append("======================\n")
        builder.append("[$title]\n")
        builder.append("\n")
    }

    override fun buildString(str: String) {
        builder.append("■$str\n")
        builder.append("\n")
    }

    override fun buildItems(items: Array<String>) {
        items.forEach { builder.append("$it\n") }
        builder.append("\n")
    }

    override fun buildDone() {
        builder.append("======================\n")
    }

    fun getResult() :String {
        return builder.toString()
    }
}