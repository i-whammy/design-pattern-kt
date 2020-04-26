package design.pattern.kt.adapter

interface FileIO {
    fun readFromFile(filename: String)
    fun writeToFile(filename: String)
    fun setValue(key: String, value: String)
    fun getValue(key: String) : String
}