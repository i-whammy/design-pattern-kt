package design.pattern.kt.iterator

interface Aggregate<T> {
    fun iterator(): Iterator<T>
}