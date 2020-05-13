package design.pattern.kt.composite

abstract class Entry {
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

    abstract fun printFullPath(prefix: String)
}