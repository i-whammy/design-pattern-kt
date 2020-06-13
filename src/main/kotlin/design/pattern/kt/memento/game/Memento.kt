package design.pattern.kt.memento.game

import kotlin.properties.Delegates

class Memento {
    private var money by Delegates.notNull<Int>()
    private var fruits: ArrayList<String>

    constructor(money: Int) {
        this.money = money
        this.fruits = ArrayList()
    }

    fun money() : Int {
        return money
    }

    fun fruits(): ArrayList<String> {
        return fruits
    }

    fun addFruit(fruit: String) {
        fruits.add(fruit)
    }
}