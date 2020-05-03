package design.pattern.kt.abstractfactory.tablefactory

import design.pattern.kt.abstractfactory.factory.Page

class TablePage(title: String, author: String): Page(title, author) {
    override fun makeHTML(): String {
        return buildString {
            append("<html><head><title>$title</title></head></html>")
            append("<body>\n")
            append("<h1>$title</h1>\n")
            append("<table width=\"80\" border=\"3\">\n")
            val iterator = content.iterator()
            while (iterator.hasNext()) {
                append(iterator.next().makeHTML())
            }
            append("</table>\n")
            append("<hr><address>$author</address></hr>\n")
            append("</body></html>\n")
        }
    }

}