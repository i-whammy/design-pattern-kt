package design.pattern.kt.strategy.sort

class SelectionSorter<T>: Sorter<T> {

    override fun sort(data: Array<Comparable<T>>) {
        data.sort()
    }
}