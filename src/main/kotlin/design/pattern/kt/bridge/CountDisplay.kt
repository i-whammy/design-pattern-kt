package design.pattern.kt.bridge

class CountDisplay(private val impl: DisplayImpl): Display(impl) {
    fun multiDisplay(times: Int) {
        open()
        repeat(times) { print() }
        close()
    }
}