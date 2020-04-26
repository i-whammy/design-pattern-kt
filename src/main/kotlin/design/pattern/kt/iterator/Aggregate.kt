package design.pattern.kt.iterator

interface Aggregate<T> {
    fun iterator(): Iterator<T>
    fun descIterator(): DescIterator<T>
}