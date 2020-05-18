package design.pattern.kt.visitor

class File(private val name:String, private val size:Int): Entry() {
    override fun getName() = name
    override fun getSize() = size

    override fun printList(prefix: String) {
        println("$prefix/$this")
    }

    override fun printFullPath(prefix: String) {
        println("$prefix/$name")
    }

    override fun accept(visitor: Visitor) {
        visitor.visit(this)
    }
}