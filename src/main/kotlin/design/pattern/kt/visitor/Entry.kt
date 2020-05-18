package design.pattern.kt.visitor

abstract class Entry: Element {
    abstract fun getName(): String
    abstract fun getSize(): Int

    open fun add(entry: Entry): Entry {
        throw FileTreatmentException()
    }

    fun printList() {
        printList("")
    }

    abstract fun printList(prefix: String)

    override fun toString(): String {
        return "${getName()} (${getSize()})"
    }

    fun printFullPath() {
        printFullPath("")
    }

    open fun iterator(): Iterator<Entry> {
        throw FileTreatmentException()
    }

    abstract fun printFullPath(prefix: String)
}