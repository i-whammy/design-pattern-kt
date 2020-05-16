package design.pattern.kt.decorator

class SideBorder(private val disp: Display, private val char: Char): BorderDisplay(disp) {
    override fun getColumns(): Int {
        return disp.getColumns().plus(2)
    }

    override fun getRows(): Int {
        return disp.getRows()
    }

    override fun getRowText(row: Int): String {
        return char + disp.getRowText(row) + char
    }
}