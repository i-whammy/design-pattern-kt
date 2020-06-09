package design.pattern.kt.mediator

import java.awt.Button

class ColleagueButton(caption: String): Button(caption), Colleage {
    private lateinit var mediator: Mediator

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        isEnabled = enabled
    }
}