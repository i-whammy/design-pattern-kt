package design.pattern.kt.abstractfactory.listfactory

import design.pattern.kt.abstractfactory.factory.Tray

class ListTray(caption: String): Tray(caption) {
    override fun makeHTML(): String {
        val builder = StringBuilder()
        builder.append("<li>\n")
        builder.append("$caption \n")
        builder.append("<ul>\n")
        val iterator = tray.iterator()
        while (iterator.hasNext()) {
            builder.append(iterator.next().makeHTML())
        }
        builder.append("</ul>\n")
        builder.append("</li>\n")
        return builder.toString()
    }
}