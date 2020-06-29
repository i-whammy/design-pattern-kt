package design.pattern.kt.command

import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

class DrawCanvas(width: Int, height: Int, history: MacroCommand): Drawable, Canvas() {
    private val color = Color.RED
    private val radius = 6
    private var history: MacroCommand
    
    init {
        setSize(width, height)
        background = Color.WHITE
        this.history = history
    }

    override fun paint(g: Graphics) {
        history.execute()
    }

    override fun draw(x: Int, y: Int) {
        val graphics = graphics
        graphics.color = color
        graphics.fillOval(x-radius, y-radius, radius * 2, radius * 2)
    }
}