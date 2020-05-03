package design.pattern.kt.abstractfactory.factory

import java.io.FileWriter

abstract class Page(protected val title: String, protected val author: String) {
    protected val content = mutableListOf<Item>()

    fun add(item: Item) {
        content.add(item)
    }

    fun output() {
        val filename = "$title.html"
        val writer = FileWriter(filename)
        writer.write(this.makeHTML())
        writer.close()
        println("$filename が作成されました。")
    }

    abstract fun makeHTML(): String
}