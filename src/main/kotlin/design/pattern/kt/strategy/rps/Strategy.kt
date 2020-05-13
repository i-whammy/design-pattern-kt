package design.pattern.kt.strategy.rps

interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}