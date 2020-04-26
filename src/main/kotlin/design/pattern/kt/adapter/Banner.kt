package design.pattern.kt.adapter

open class Banner(private val string: String) {
    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("\"$string\"")
    }
}