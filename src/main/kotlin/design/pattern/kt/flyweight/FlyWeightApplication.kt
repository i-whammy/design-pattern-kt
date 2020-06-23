package design.pattern.kt.flyweight

fun main() {
    repeat(100) {
        BigString("121113", true).print()
    }
    Runtime.getRuntime().gc()
    val l = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()
    println("Used: $l")
}