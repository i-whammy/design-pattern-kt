package design.pattern.kt.memento.game

import java.util.*
import kotlin.collections.ArrayList
import kotlin.properties.Delegates

class Gamer {
    private var money: Int by Delegates.notNull()
    private var fruits = ArrayList<String>()
    private val random = Random()
    companion object {
        val fruitsName = arrayOf("リンゴ", "ぶどう", "バナナ", "みかん")
    }

    constructor(money: Int) {
        this.money = money
    }

    fun money(): Int {
        return money
    }

    fun bet() {
        val dice = random.nextInt(6) + 1
        if (dice == 1) {
            this.money += 100
            println("所持金が増えました。")
        } else if (dice == 2) {
            this.money /= 2
            println("所持金が半分になりました。")
        } else if (dice == 6) {
            val fruit = getFruit()
            println("フルーツ($fruit)をもらいました。")
            fruits.add(fruit)
        } else {
            println("何も起こりませんでした。")
        }
    }

    fun createMemento() : Memento {
        val memento = Memento(money)
        val iterator = fruits.iterator()
        while (iterator.hasNext()) {
            val fruit = iterator.next()
            if (fruit.startsWith("おいしい")) {
                memento.addFruit(fruit)
            }
        }
        return memento
    }

    fun restoreMemento(memento: Memento) {
        this.money = memento.money()
        this.fruits = memento.fruits()
    }

    override fun toString(): String {
        return "[money = $money, fruits = $fruits ]"
    }

    private fun getFruit(): String {
        var prefix = ""
        if (random.nextBoolean()) {
            prefix = "おいしい"
        }
        return "${prefix}${fruitsName[random.nextInt(fruitsName.size)]}"
    }
}