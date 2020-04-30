package design.pattern.kt.factory.idcard

import design.pattern.kt.factory.framework.Factory
import design.pattern.kt.factory.framework.Product

class IDCardFactory: Factory() {
    private val owners = mutableListOf<String>()
    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).getOwner())
    }

    fun getOwners() = owners
}