package design.pattern.kt.abstractfactory.tablefactory

import design.pattern.kt.abstractfactory.factory.Tray

class TableTray(caption: String) : Tray(caption) {
    override fun makeHTML(): String {
        return buildString {
            append("<td>")
            append("<table width=\"100\" border=\"1\"><tr>")
            append("<td>$caption</td>")
            append("</tr>")
            append("<tr>")
            val it = tray.iterator()
            while (it.hasNext()) {
                append(it.next().makeHTML())
            }
            append("</tr></table>")
            append("</td>")
        }
    }
}
