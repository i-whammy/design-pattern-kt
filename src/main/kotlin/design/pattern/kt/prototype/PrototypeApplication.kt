package design.pattern.kt.prototype

fun main() {
    val manager = Manager()
    val underlinePen = UnderlinePen('-')
    val mBox = MessageBox('*')
    val sBox = MessageBox('/')
    manager.register("strong messages", underlinePen)
    manager.register("warning box", mBox)
    manager.register("slash box", sBox)

    val p1 = manager.create("strong messages")
    p1.use("Hello, world.")
    val p2 = manager.create("warning box")
    p2.use("Hello, world.")
    val p3 = manager.create("slash box")
    p3.use("Hello, world.")
}