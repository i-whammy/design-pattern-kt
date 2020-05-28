package design.pattern.kt.facade.pagemaker

import java.io.FileWriter

class PageMaker {
    private constructor()
    companion object {
        fun makeWelcomePage(mailAddress: String, fileName: String) {
            val properties = Database.getProperties("maildata")
            val userName = properties.getProperty(mailAddress)
            val htmlWriter = HTMLWriter(FileWriter(fileName))
            htmlWriter.title("Welcome to $userName page!")
            htmlWriter.paragraph("${userName}のページへようこそ")
            htmlWriter.paragraph("メール待っていますね。")
            htmlWriter.mailTo(mailAddress, userName)
            htmlWriter.close()
            println("$fileName is created for $mailAddress($userName)")
        }
    }
}