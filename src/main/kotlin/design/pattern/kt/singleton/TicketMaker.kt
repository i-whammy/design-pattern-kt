package design.pattern.kt.singleton

class TicketMaker private constructor() {
    companion object {
        private var ticket = 1000
        fun getNextTicketNumber() = ticket++
    }
}