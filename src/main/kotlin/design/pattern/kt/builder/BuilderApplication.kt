package design.pattern.kt.builder

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        usage()
        exitProcess(0)
    }
    when (args[0]) {
        "plain" -> {
            val textBuilder = TextBuilder()
            val director = Director(textBuilder)
            director.construct()
            val result = textBuilder.getResult()
            println(result)
        }
        "html" -> {
            val htmlBuilder = HTMLBuilder()
            val director = Director(htmlBuilder)
            director.construct()
            val result = htmlBuilder.getResult()
            println(result)
        }
        else -> {
            usage()
            exitProcess(0)
        }
    }

}

fun usage(){
    println("Usage: java Main plain ... printing document with plain text")
    println("Usage: java Main html ... printing document with HTML file")
}