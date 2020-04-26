package design.pattern.kt.adapter

import java.io.IOException

fun main (args: Array<String>) {
    val print: Print = PrintBanner("Sample sentence.")
    val print2: Print = DelegatedPrintBanner(Banner("Sample sentence."))
    print.printWeak()
    print.printStrong()
    print2.printWeak()
    print2.printStrong()

    val f = FileProperties()
    try {
        f.readFromFile("src/main/resources/adapter/file.txt")
        f.setValue("year", "2004")
        f.setValue("month", "4")
        f.setValue("day", "21")
        f.writeToFile("src/main/resources/adapter/newfile.txt")
    } catch (e: IOException) {
        e.printStackTrace()
    }
}