package design.pattern.kt.state

class NightState private constructor(): State {
    companion object {
        private val state = NightState()
        fun getInstance() = state
    }

    override fun doClock(context: Context, hour: Int) {
        if (hour in 9..16) {
            context.changeState(DayState.getInstance())
        }
    }

    override fun doUse(context: Context) {
        context.recordLog("非常：夜間の金庫使用！")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル(夜間)")
    }

    override fun doPhone(context: Context) {
        context.callSecurityCenter("夜間の通話録音")
    }

}
