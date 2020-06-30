package design.pattern.kt.interpreter

interface Node {
    fun parse(context: Context)
}