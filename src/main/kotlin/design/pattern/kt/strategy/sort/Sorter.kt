package design.pattern.kt.strategy.sort

interface Sorter<T> {
    fun sort(data: Array<Comparable<T>>)
}