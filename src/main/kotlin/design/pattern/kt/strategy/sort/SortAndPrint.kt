package design.pattern.kt.strategy.sort

class SortAndPrint<T>(private val data: Array<Comparable<T>>, private val sorter: Sorter<T>) {
    fun execute() {
        print()
        sorter.sort(data)
        print()
    }

    private fun print() {
        println(data.joinToString(",") { it.toString() })
    }
}