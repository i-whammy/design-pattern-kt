package design.pattern.kt.adapter

class PrintBanner(private val string: String): Print, Banner(string) {
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}