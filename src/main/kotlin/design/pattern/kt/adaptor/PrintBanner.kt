package design.pattern.kt.adaptor

class PrintBanner(private val string: String): Print, Banner(string) {
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}