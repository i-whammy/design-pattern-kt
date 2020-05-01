package design.pattern.kt.prototype

class Manager {
    private val showcase = hashMapOf<String, Product>()
    fun register(name: String, proto: Product) {
        showcase[name] = proto
    }

    fun create(protoname: String): Product {
        val product = showcase[protoname]!!
        return product.createClone()
    }
}