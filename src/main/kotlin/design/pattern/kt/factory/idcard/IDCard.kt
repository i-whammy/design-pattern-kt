package design.pattern.kt.factory.idcard

import design.pattern.kt.factory.framework.Product

class IDCard(private val owner: String, private val cardId: Int): Product() {
    init {
        println("ID $cardId の${owner}のカードを作ります。")
    }
    override fun use() {
        println("ID $cardId の${owner}のカードを使います。")
    }
    fun getOwner() = owner
}