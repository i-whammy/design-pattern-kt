package design.pattern.kt.strategy.sort

fun main() {
    val array: Array<Comparable<String>> = arrayOf("Dumpty", "Bowman", "Carroll", "Elfland", "Alice")
    val sorter = SortAndPrint(array, SelectionSorter())
    sorter.execute()
}