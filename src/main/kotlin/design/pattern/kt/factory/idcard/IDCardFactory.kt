package design.pattern.kt.factory.idcard

import design.pattern.kt.factory.framework.Factory
import design.pattern.kt.factory.framework.Product

class IDCardFactory: Factory() {
    private var cardId = 1
    private val owners = mutableListOf<String>()
    override fun createProduct(owner: String): Product {
        return IDCard(owner, cardId++)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).getOwner())
    }

    fun getOwners() = owners
}