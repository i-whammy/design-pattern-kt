package design.pattern.kt.strategy

class Hand(private val handValue: Int) {
    companion object {
        val HANDVALUE_GUU = 0
        val HANDVALUE_CHO = 1
        val HANDVALUE_PAA = 2
        val hand = arrayOf(Hand(HANDVALUE_GUU), Hand(HANDVALUE_CHO), Hand(HANDVALUE_PAA))
        private val name = arrayOf("グー", "チョキ", "パー")

        fun getHand(handValue: Int) = hand[handValue]
    }

    fun isStrongerThan(h: Hand) = fight(h) == 1

    fun isWeakerThan(h: Hand) = fight(h) == -1

    private fun fight(h: Hand) : Int {
        return when {
            (this == h) -> 0
            ((this.handValue + 1) % 3 == h.handValue) -> 1
            else -> -1
        }
    }

    override fun toString() = name[handValue]
}