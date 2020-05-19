package design.pattern.kt.chainofresponsibility

class Trouble(private val number: Int) {
    fun getNumber() = number
    override fun toString() : String {
        return "[Trouble $number]"
    }
}