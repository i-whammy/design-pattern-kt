package design.pattern.kt.strategy

import kotlin.random.Random

class WinningStrategy(private val seed: Int): Strategy {
    private val random = Random(seed)
    private var won = false
    private var prevHand = Hand.getHand(random.nextInt(3))
    override fun nextHand(): Hand {
        if (!won) {
            prevHand =  Hand.getHand(random.nextInt(3))
        }
        return prevHand
    }

    override fun study(win: Boolean) {
        won = win
    }
}