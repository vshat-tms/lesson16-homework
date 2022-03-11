package commands

import Command

class FizzBuzzFromSiarhey : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "Print Integer from 1 to input in 20..100 with Fizz or Buzz"

    override fun execute(text: String) {
        val number: Int? = try {
            text.toInt()
        } catch (e: NumberFormatException) {
            null
        }
        if (number != null && number in 20..100) {
            fizzBuzz(number)
        } else {
            println("incorrect input")
        }
    }

    private fun fizzBuzz(number: Int) {
        var num = 0
        do {
            num++
            if (num % 15 == 0) {
                println("FizzBuzz")
            } else if (num % 5 == 0) {
                println("Buzz")
            } else if (num % 3 == 0) {
                println("Fizz")
            } else {
                println(num)
            }
        } while (num != number)

    }
}