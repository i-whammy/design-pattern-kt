package design.pattern.kt.adapter

import io.mockk.*
import kotlin.test.Test

class DelegatedPrintBannerTest {

    private val banner = mockk<Banner>()

    private val printBanner = DelegatedPrintBanner(banner)

    @Test
    fun testPrintWeak() {
        every { banner.showWithParen() } just runs
        printBanner.printWeak()
        verify { banner.showWithParen() }
    }

    @Test
    fun testPrintStrong() {
        every { banner.showWithAster() } just runs
        printBanner.printStrong()
        verify { banner.showWithAster() }
    }
}