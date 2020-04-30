package design.pattern.kt.factory.idcard

import design.pattern.kt.factory.framework.Product

class IDCard(private val owner: String): Product() {
    init {
        println("${owner}のカードを作ります。")
    }
    override fun use() {
        println("${owner}のカードを使います。")
    }
    fun getOwner() = owner
}