package design.pattern.kt.factory.framework

abstract class Factory {
    fun create(owner: String) : Product {
        val product = createProduct(owner)
        registerProduct(product)
        return product
    }
    abstract fun createProduct(owner: String): Product
    abstract fun registerProduct(product: Product)
}