package design.pattern.kt.visitor

class FileFindVisitor(private val extension: String): Visitor() {
    private var currentDirectory = ""
    private val matchedFiles = mutableListOf<Entry>()

    override fun visit(file: File) {
        if (file.getName().contains(extension)) matchedFiles.add(file)
    }

    override fun visit(directory: Directory) {
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            iterator.next().accept(this)
        }
        currentDirectory += "/${directory.getName()}"
    }

    fun getFoundFiles(): Iterator<Entry> {
        return matchedFiles.iterator()
    }
}