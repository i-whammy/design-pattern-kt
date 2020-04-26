package design.pattern.kt.iterator

interface Iterator<T> {
    fun hasNext(): Boolean
    fun next(): T
}