package design.pattern.kt.adapter

import java.io.File
import java.util.*

class FileProperties: FileIO {
    private val properties = Properties()

    override fun readFromFile(filename: String) {
        File(filename).forEachLine { it.split("=").let { (k,v) -> setValue(k,v) } }
    }

    override fun writeToFile(filename: String) {
        val newFile = File(filename)
        val props = properties.map { (k,v) -> "$k=$v" }.joinToString("\n")
        newFile.writeText(props)
    }

    override fun setValue(key: String, value: String) {
        properties[key] = value
    }

    override fun getValue(key: String): String {
        return properties[key] as String
    }
}