package commands

import Command

class FizzBuzz : Command {
    override val keyword = "fizzbuzz"
    override val description = "Multiplicity Check: 3, 5, 15 and replacing numbers with words"

    override fun execute(text: String) {

        println("Enter a number from 20 to 100: ")
        val inputNumber = text.toInt()
        while (inputNumber in START_RANG..END_RANG) {
            if (inputNumber in START_RANG..END_RANG) {
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
            break
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
