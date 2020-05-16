package design.pattern.kt.decorator

class MultiStringDisplay(): Display() {
    private val strings = mutableListOf<String>()

    override fun getColumns(): Int {
        return strings.minBy { it.length }!!.length
    }

    override fun getRows(): Int {
        return strings.size
    }

    override fun getRowText(row: Int): String {
        return strings[row]
    }

    fun add(string: String) {
        strings.add(string)
    }
}