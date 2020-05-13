package design.pattern.kt.strategy.rps

import kotlin.random.Random

class RandomStrategy(private val seed: Int): Strategy {
    private val random = Random(seed)

    override fun nextHand(): Hand {
        return Hand.getHand(random.nextInt(3))
    }

    override fun study(win: Boolean) {
        // do nothing
    }
}