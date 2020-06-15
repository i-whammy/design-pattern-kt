package design.pattern.kt.state

class DayState private constructor() : State {
    companion object {
        private val dayState = DayState()
        fun getInstance() = dayState
    }

    override fun doClock(context: Context, hour: Int) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance())
        }
    }

    override fun doUse(context: Context) {
        context.recordLog("金庫使用(昼間)")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル(昼間)")
    }

    override fun doPhone(context: Context) {
        context.callSecurityCenter("通常の通話(昼間)")
    }
}