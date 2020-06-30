package design.pattern.kt.interpreter

import java.lang.NumberFormatException
import java.util.*

class Context(private var text: String) {
    private val tokenizer = StringTokenizer(text)
    var currentToken: String? = null

    init {
        nextToken()
    }

    fun nextToken(): String? {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken()
        } else {
            currentToken = null
        }
        return currentToken
    }

    fun skipToken(token: String) {
        if (token != currentToken) throw ParseException("Warning: $token is expected, but $currentToken is found.")
        nextToken()
    }

    fun currentNumber(): Int {
        var number = 0
        try {
            number = Integer.parseInt(currentToken)
        } catch (e: NumberFormatException) {
            throw ParseException("Warning : $e")
        }
        return number
    }
}