package design.pattern.kt.adaptor

fun main (args: Array<String>) {
    val print: Print = PrintBanner("Sample sentence.")
    val print2: Print = DelegatedPrintBanner(Banner("Sample sentence."))
    print.printWeak()
    print.printStrong()
    print2.printWeak()
    print2.printStrong()
}