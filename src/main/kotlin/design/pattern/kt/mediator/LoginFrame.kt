package design.pattern.kt.mediator

import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import kotlin.system.exitProcess

class LoginFrame(title: String): Frame(title), ActionListener, Mediator {
    private lateinit var checkBoxGuest : ColleagueCheckbox
    private lateinit var checkBoxLogin : ColleagueCheckbox
    private lateinit var textUser : ColleagueTextField
    private lateinit var textPass : ColleagueTextField
    private lateinit var buttonOk : ColleagueButton
    private lateinit var buttonCancel : ColleagueButton

    init {
        background = Color.LIGHT_GRAY
        layout = GridLayout(4,2)
        createColleagues()
        add(checkBoxGuest)
        add(checkBoxLogin)
        add(Label("UserName: "))
        add(textUser)
        add(Label("Password: "))
        add(textPass)
        add(buttonOk)
        add(buttonCancel)
        colleagueChanged()
        pack()
        show()
    }

    override fun actionPerformed(e: ActionEvent?) {
        println(e)
        exitProcess(0)
    }

    override fun createColleagues() {
        val checkboxGroup = CheckboxGroup()
        checkBoxGuest = ColleagueCheckbox("Guest", checkboxGroup, true)
        checkBoxLogin = ColleagueCheckbox("Login", checkboxGroup, false)
        textUser = ColleagueTextField("", 10)
        textPass = ColleagueTextField("", 10)
        textPass.echoChar = '*'
        buttonOk = ColleagueButton("OK")
        buttonCancel = ColleagueButton("Cancel")

        checkBoxGuest.setMediator(this)
        checkBoxLogin.setMediator(this)
        textUser.setMediator(this)
        textPass.setMediator(this)
        buttonOk.setMediator(this)
        buttonCancel.setMediator(this)

        checkBoxGuest.addItemListener(checkBoxGuest)
        checkBoxLogin.addItemListener(checkBoxLogin)
        textUser.addTextListener(textUser)
        textPass.addTextListener(textPass)
        buttonOk.addActionListener(this)
        buttonCancel.addActionListener(this)
    }

    override fun colleagueChanged() {
        if (checkBoxGuest.state) {
            textUser.setColleagueEnabled(false)
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(true)
        } else {
            textUser.setColleagueEnabled(true)
            userPassChanged()
        }
    }

    private fun userPassChanged() {
        if (textUser.text.isNotEmpty()) {
            textPass.setColleagueEnabled(true)
            buttonOk.setColleagueEnabled(textPass.text.isNotEmpty())
        } else {
            textPass.setColleagueEnabled(false)
            buttonOk.setColleagueEnabled(false)
        }
    }

}
