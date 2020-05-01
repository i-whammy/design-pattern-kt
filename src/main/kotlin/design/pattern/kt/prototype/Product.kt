package design.pattern.kt.prototype

interface Product: Cloneable {
    fun use(s: String)
    fun createClone(): Product
}