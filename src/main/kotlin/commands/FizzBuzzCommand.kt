package commands

import Command

class FizzBuzzCommand : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "Enter an integer in the range 20...100"

    override fun execute(text: String) {
        val inputNum: Int
        try {
            inputNum = text.toInt()
        } catch (e: NumberFormatException) {
            println("Error $description")
            return
        }
        if (inputNum in 20..100) {
            for (i in 1..inputNum) {
                when {
                    i % 15 == 0 -> println("FizzBuzz")
                    i % 5 == 0 -> println("Buzz")
                    i % 3 == 0 -> println("Fizz")
                    else -> println(i)
                }
            }
        } else println("Error $description")
    }
}