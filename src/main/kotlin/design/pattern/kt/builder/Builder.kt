package design.pattern.kt.builder

interface Builder {
    fun makeTitle(title: String)
    fun makeString(str: String)
    fun makeItems(items: Array<String>)
    fun close()
}