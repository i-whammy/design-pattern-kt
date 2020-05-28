package design.pattern.kt.facade.pagemaker

import java.io.Writer

class HTMLWriter(private val writer: Writer) {
    fun title(title: String) {
        writer.write("<html>")
        writer.write("<head>")
        writer.write("<title>$title</title>")
        writer.write("</head>")
        writer.write("<body>\n")
        writer.write("<h1>$title</h1>\n")
    }

    fun paragraph(message: String) {
        writer.write("<p>$message</p>")
    }

    fun link(href: String, caption: String) {
        writer.write("<a href='$href'>$caption</a>")
    }

    fun mailTo(mailAddress: String, userName: String) {
        link("$mailAddress: mailAddress", userName)
    }

    fun close() {
        writer.write("</body>")
        writer.write("</html>\n")
        writer.close()
    }
}