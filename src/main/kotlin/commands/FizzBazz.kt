package commands

import Command

class FizzBuzzCommand : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "Введите число от 20 до 100 включительно: "

    override fun execute(text: String) {
        val input: Int
        try {
            input = text.toInt()
        } catch (e: NumberFormatException) {
            println("Ошибка.. $description")
            return
        }
        if (input in START_RANGE..END_RANGE) {
            for (i in 1..input) {
                when {
                    i % FIZZBUZZ == 0 -> println("FizzBuzz")
                    i % FIZZ == 0 -> println("Fizz")
                    i % BUZZ == 0 -> println("Buzz")
                    else -> println(i)
                }
            }
        } else {
            println("Ошибка.. Значение ввода вне диапазона $START_RANGE..$END_RANGE")
        }
    }

    companion object {
        private const val START_RANGE = 20
        private const val END_RANGE = 100
        private const val FIZZ = 3
        private const val FIZZBUZZ = 15
        private const val BUZZ = 5
    }
}