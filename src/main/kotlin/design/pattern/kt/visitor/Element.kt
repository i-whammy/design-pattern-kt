package design.pattern.kt.visitor

interface Element {
    fun accept(visitor: Visitor)
}