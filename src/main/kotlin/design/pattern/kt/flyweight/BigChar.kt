package design.pattern.kt.flyweight

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import kotlin.properties.Delegates

class BigChar(charName: Char) {
    private var fontdata: String by Delegates.notNull<String>()

    init {
        try {
            val bufferedReader = BufferedReader(FileReader("src/main/resources/flyweight/big${charName}.txt"))
            val stringBuilder = StringBuilder()
            bufferedReader.use { stringBuilder.append(it.readLine()) }
            this.fontdata = stringBuilder.toString()
        } catch (e: IOException) {
            this.fontdata = "$charName?"
        }
    }

    fun print() {
        println(this.fontdata)
    }
}