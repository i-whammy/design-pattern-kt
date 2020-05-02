package design.pattern.kt.builder

class MarkdownBuilder: Builder() {
    private val builder = StringBuilder()

    override fun buildTitle(title: String) {
        builder.append("# $title")
        builder.append("\n")
    }

    override fun buildString(str: String) {
        builder.append("## $str")
        builder.append("\n")
    }

    override fun buildItems(items: Array<String>) {
        items.forEach { builder.append("* $items\n") }
    }

    override fun buildDone() {
        builder.append("\n")
    }
}