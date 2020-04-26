package design.pattern.kt.adapter

class DelegatedPrintBanner(private val banner: Banner): Print {
    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}