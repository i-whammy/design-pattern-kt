package design.pattern.kt.visitor

class SizeVisitor: Visitor() {
    private var size = 0
    override fun visit(file: File) {
        size += file.getSize()
    }

    override fun visit(directory: Directory) {
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            size += iterator.next().getSize()
        }
    }

    fun getSize() : Int = size
}