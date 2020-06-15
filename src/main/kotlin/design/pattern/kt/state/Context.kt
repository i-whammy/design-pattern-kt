package design.pattern.kt.state

interface Context {
    fun setClock(hour: Int)
    fun changeState(state: State)
    fun callSecurityCenter(message: String)
    fun recordLog(message: String)
}
