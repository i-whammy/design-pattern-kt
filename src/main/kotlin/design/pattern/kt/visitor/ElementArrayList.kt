package design.pattern.kt.visitor

class ElementArrayList {
    private val entries = mutableListOf<Entry>()

    fun add(entry: Entry) {
        entries.add(entry)
    }

    fun accept(visitor: ListVisitor) {
        val iterator = entries.iterator()
        while (iterator.hasNext()) {
            val entry = iterator.next()
            if (entry is File) visitor.visit(entry)
            else if (entry is Directory) visitor.visit(entry)
        }
    }
}