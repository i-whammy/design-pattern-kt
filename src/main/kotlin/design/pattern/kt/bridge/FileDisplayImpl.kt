package design.pattern.kt.bridge

import java.io.BufferedReader
import java.io.FileReader

class FileDisplayImpl(private val filepath: String): DisplayImpl() {
    private val string = BufferedReader(FileReader(filepath)).readLines().joinToString("")
    private val width = string.length

    override fun rawOpen() {
        printLine()
    }

    override fun rawPrint() {
        println("|$string|")
    }

    override fun rawClose() {
        printLine()
    }

    private fun printLine() {
        print("*")
        repeat(width) { print("-")}
        println("*")
    }
}