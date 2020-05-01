package design.pattern.kt.singleton

fun main() {
    println("Begin.")
    val singleton = Singleton.getInstance()
    val singleton2 = Singleton.getInstance()
    println(if (singleton == singleton2) "The same instance." else "The different instance.")
    println("Finish.")
}