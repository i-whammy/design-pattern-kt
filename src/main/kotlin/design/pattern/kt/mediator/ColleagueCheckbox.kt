package design.pattern.kt.mediator

import java.awt.Checkbox
import java.awt.CheckboxGroup
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

class ColleagueCheckbox(caption: String, checkboxGroup: CheckboxGroup, state: Boolean): Checkbox(caption, checkboxGroup, state), ItemListener, Colleague {

    private lateinit var mediator: Mediator

    override fun setMediator(mediator: Mediator) {
        this.mediator = mediator
    }

    override fun setColleagueEnabled(enabled: Boolean) {
        mediator.colleagueChanged()
    }

    override fun setEnabled(enabled: Boolean) {
        isEnabled = enabled
    }

    override fun itemStateChanged(e: ItemEvent?) {
        mediator.colleagueChanged()
    }
}
