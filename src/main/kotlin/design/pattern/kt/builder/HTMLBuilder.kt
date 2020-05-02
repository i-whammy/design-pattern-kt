package design.pattern.kt.builder

import java.io.FileWriter
import java.io.PrintWriter

class HTMLBuilder: Builder() {
    private var filename = ".html"
    private var writer : PrintWriter? = null

    override fun buildTitle(title: String) {
        filename = title + filename
        writer = PrintWriter(FileWriter(filename))
        writer!!.println("""
            <html>
                <head>
                    <title>$title</title>
                </head>
                <body>
        """.trimIndent())
        writer!!.println("<h1>$title</h1>")
    }

    override fun buildString(str: String) {
        writer!!.println("<p>$str</p>")
    }

    override fun buildItems(items: Array<String>) {
        writer!!.println("<ul>")
        items.forEach { writer!!.println("<li>$it</li>") }
        writer!!.println("</ul>")
    }

    override fun buildDone() {
        writer!!.println("</body></html>")
        writer!!.close()
    }

    fun getResult() : String {
        return filename
    }
}