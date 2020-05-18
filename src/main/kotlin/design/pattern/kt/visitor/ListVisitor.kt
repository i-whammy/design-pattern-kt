package design.pattern.kt.visitor

class ListVisitor: Visitor() {
    private var currentDirectory = ""
    override fun visit(file: File) {
        println("$currentDirectory/$file")
    }

    override fun visit(directory: Directory) {
        println("$currentDirectory/$directory")
        val iterator = directory.iterator()
        while (iterator.hasNext()) {
            iterator.next().accept(this)
        }
        currentDirectory += "/${directory.getName()}"
    }
}