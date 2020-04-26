package design.pattern.kt.iterator

interface DescIterator<T> {
    fun hasPrevious() : Boolean
    fun previous() : T
    fun resetIndex(): Int
}