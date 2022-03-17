package commands

import Command
import java.util.*

class FizzBuzz : Command {
    override val keyword = "fizzbuzz"
    override val description = " FizzBuzz ᕦ(ツ)ᕤ "

    override fun execute(text: String) {

        val scanner = Scanner(System.`in`)
        var isCorrect = false

        println("Enter a number from 20 to 100: ")
        while (!isCorrect) {
            val inputNumber = scanner.nextInt()
            isCorrect=inputNumber in 20..100
            if (isCorrect) {
                for (number in 1..inputNumber) {
                    when {
                        number % 15 == 0 -> println("FizzBuzz")
                        number % 5 == 0 -> println("Buzz")
                        number % 3 == 0 -> println("Fizz")
                        else -> println(number)
                    }
                }
            } else
                println("Enter the correct number: ")
        }
    }
}
