package design.pattern.kt.chainofresponsibility

fun main() {
    val alice = NoSupport("Alice")
    val bob = LimitSupport("Bob", 100)
    val charlie = SpecialSupport("Charlie", 200)
    val diana = LimitSupport("Diana", 400)
    val elmo = OddSupport("Elmo")
    val fred = LimitSupport("Fred", 500)
    alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred)
    repeat(500) {
        alice.support(Trouble(it))
    }
}