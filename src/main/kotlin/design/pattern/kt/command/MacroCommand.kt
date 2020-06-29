package design.pattern.kt.command

import java.util.*

class MacroCommand: Command {
    private val commands = Stack<Command>()
    override fun execute() {
        val iterator = commands.iterator()
        while (iterator.hasNext()) {
            iterator.next().execute()
        }
    }

    fun append(cmd: Command) {
        if (cmd != this) commands.push(cmd)
    }

    fun undo() {
        if (commands.isNotEmpty()) commands.pop()
    }

    fun clear() {
        commands.clear()
    }
}