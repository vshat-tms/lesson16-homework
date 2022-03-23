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
            isCorrect = inputNumber in START_RANG..END_RANG
            if (isCorrect) {
                for (number in 1..inputNumber) {
                    when {
                        number % FIZZBUZZ == 0 -> println("FizzBuzz")
                        number % BUZZ == 0 -> println("Buzz")
                        number % FIZZ == 0 -> println("Fizz")
                        else -> println(number)
                    }
                }
            } else
                println("Enter the correct number: ")
        }
    }

    companion object {
        private const val START_RANG = 20
        private const val END_RANG = 100
        private const val FIZZ = 3
        private const val BUZZ = 5
        private const val FIZZBUZZ = 15
    }
}
