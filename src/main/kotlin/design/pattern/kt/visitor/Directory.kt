package design.pattern.kt.visitor

class Directory(private val name: String): Entry() {
    private val directory = arrayListOf<Entry>()
    override fun getName() = name
    override fun getSize(): Int {
        val sizeVisitor = SizeVisitor()
        accept(sizeVisitor)
        return sizeVisitor.getSize()
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

    override fun printFullPath(prefix: String) {
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            iterator.next().printFullPath("$prefix/$name")
        }
    }

    override fun iterator(): Iterator<Entry> {
        return directory.iterator()
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}