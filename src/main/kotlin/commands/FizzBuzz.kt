package commands

import Command
import java.util.*

class FizzBuzz : Command {
    override val keyword = "fizzbuzz"
    override val description = " FizzBuzz ᕦ(ツ)ᕤ "

    override fun execute(text: String) {

        val scanner = Scanner(System.`in`)
        val isTrue = true

        println("Enter a number from 20 to 100: ")
        val number = scanner.nextInt()
        if (number in 20..100) {

            for (number in 1..number) {

                when (isTrue) {

                    number % 15 == 0 -> println("FizzBuzz")

                    number % 5 == 0 -> println("Buzz")

                    number % 3 == 0 -> println("Fizz")

                    else -> println(number)
                }
            }
        } else (number !in 20..100)
        print("Enter the correct number: ")
        val number1 = scanner.nextInt()
        if (number1 in 20..100) {
            for (number1 in 1..number1) {
                println(number1)
            }
        }
    }
}
