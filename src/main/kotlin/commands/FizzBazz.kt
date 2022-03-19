package commands

import Command

class FizzBuzzCommand : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "Введите число от 20 до 100 включительно: "

    override fun execute(text: String) {
        val input: Int
        try {
            input = text.toInt()
        }catch (e: NumberFormatException) {
            println("Ошибка.. $description")
            return
        }
        if (input in 20..100) {
            for (i in 1..input) {
                when {
                    i % 15 == 0 -> println("FizzBuzz")
                    i % 3 == 0 -> println("Fizz")
                    i % 5 == 0 -> println("Buzz")
                    else -> println(i)
                }
            }
        } else {
            println("Ошибка.. Значение ввода вне диапазона 20..100")
        }
    }
}