package design.pattern.kt.decorator

class FullBorder(private val disp: Display): BorderDisplay(disp) {
    override fun getColumns(): Int {
        return disp.getColumns().plus(2)
    }

    override fun getRows(): Int {
        return disp.getRows().plus(2)
    }

    override fun getRowText(row: Int): String {
        return when (row) {
            0 -> {
                "+${makeLine('-', disp.getColumns())}+"
            }
            disp.getRows() + 1 -> {
                "+${makeLine('-', disp.getColumns())}+"
            }
            else -> {
                "|${disp.getRowText(row-1)}|"
            }
        }
    }

    private fun makeLine(char: Char, count: Int): String {
        val sb = StringBuilder()
        repeat(count) { sb.append(char) }
        return sb.toString()
    }
}