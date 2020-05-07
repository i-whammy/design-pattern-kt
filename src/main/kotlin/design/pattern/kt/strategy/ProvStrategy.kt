package design.pattern.kt.strategy

import kotlin.random.Random

class ProvStrategy(private val seed: Int): Strategy {
    private val random = Random(seed)
    private var prevHandValue = 0
    private var currentHandValue = 0
    private var history = arrayOf(arrayOf(1,1,1),arrayOf(1,1,1),arrayOf(1,1,1))
    override fun nextHand(): Hand {
        val bet = random.nextInt(getSum(currentHandValue))
        val handValue =
                when {
                    bet < history[currentHandValue][0] -> 0
                    bet < history[currentHandValue][0] + history[currentHandValue][1] -> 1
                    else -> 2
                }
        prevHandValue = currentHandValue
        currentHandValue = handValue
        return Hand.getHand(handValue)
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }

    private fun getSum(hv : Int): Int {
        return history[hv].reduce{ a , b -> a + b }
    }
}