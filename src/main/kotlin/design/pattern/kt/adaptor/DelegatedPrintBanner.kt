package design.pattern.kt.adaptor

class DelegatedPrintBanner(private val banner: Banner): Print {
    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}