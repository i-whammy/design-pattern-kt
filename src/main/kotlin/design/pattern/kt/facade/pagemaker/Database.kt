package design.pattern.kt.facade.pagemaker

import java.io.FileInputStream
import java.io.IOException
import java.util.*

class Database {
    private constructor() {}
    companion object {
        fun getProperties(dbname: String) : Properties {
            val filename = "src/main/kotlin/design/pattern/kt/facade/$dbname.txt"
            val properties = Properties()
            try {
                properties.load(FileInputStream(filename))
            } catch (e: IOException) {
                println("WARNING: $filename is not found.")
            }
            return properties
        }
    }
}