package design.pattern.kt.factory

import design.pattern.kt.factory.idcard.IDCardFactory

fun main() {
    val factory = IDCardFactory()
    val card1 = factory.create("山田")
    val card2 = factory.create("田中")
    val card3 = factory.create("佐藤")
    card1.use()
    card2.use()
    card3.use()
}