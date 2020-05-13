package design.pattern.kt.strategy.rps

fun main() {
    val player1 = Player("Taro", WinningStrategy(314))
    val player2 = Player("Jiro", ProvStrategy(157))

    repeat(10000) {
        val nextHand1 = player1.nextHand()
        val nextHand2 = player2.nextHand()
        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                player1.win()
                player2.lose()
            }
            nextHand1.isWeakerThan(nextHand2) -> {
                player2.win()
                player1.lose()
            }
            else -> {
                player1.even()
                player2.even()
            }
        }
    }

    println(player1.toString())
    println(player2.toString())
}