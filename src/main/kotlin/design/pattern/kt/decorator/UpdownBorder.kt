package design.pattern.kt.decorator

class UpdownBorder(private val disp: Display, private val char: Char): BorderDisplay(disp) {
    override fun getColumns(): Int {
        return disp.getColumns()
    }

    override fun getRows(): Int {
        return disp.getRows().plus(2)
    }

    override fun getRowText(row: Int): String {
        if (row == 0 || row == 2) {
            val sb = StringBuilder()
            repeat(this.getColumns()) {sb.append(char) }
            return sb.toString()
        } else return disp.getRowText(row-1)
    }
}