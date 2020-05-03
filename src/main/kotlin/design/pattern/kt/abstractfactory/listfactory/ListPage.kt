package design.pattern.kt.abstractfactory.listfactory

import design.pattern.kt.abstractfactory.factory.Page

class ListPage(title: String, author: String): Page(title, author) {
    override fun makeHTML(): String {
        val builder = StringBuilder()
        builder.append("<html><head><title>$title</title></head>\n")
        builder.append("<body>\n")
        builder.append("<h1>$title</h1>")
        builder.append("<ul>\n")
        val iterator = content.iterator()
        while (iterator.hasNext()) {
            builder.append(iterator.next().makeHTML())
        }
        builder.append("</ul>\n")
        builder.append("<hr><address>$author</address>")
        builder.append("</body></html>\n")
        return builder.toString()
    }
}