package design.pattern.kt.composite

class Directory(private val name: String): Entry() {
    private val directory = arrayListOf<Entry>()
    override fun getName() = name
    override fun getSize(): Int {
        var count = 0
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            count += iterator.next().getSize()
        }
        return count
    }

    override fun printList(prefix: String) {
        println("$prefix/$this")
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            iterator.next().printList("$prefix/$name")
        }
    }

    override fun add(entry: Entry): Entry {
        directory.add(entry)
        return this
    }
}