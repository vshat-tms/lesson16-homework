package commands

import Command

class FizzBuzz : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "Print Integer from 1 to input in 20..100 with Fizz or Buzz"

    override fun execute(text: String) {
        val number: Int? = text.toIntOrNull()
        if (number != null && number in RANGE) {
            fizzBuzz(number)
        } else {
            println("incorrect input")
        }
    }

    private fun fizzBuzz(number: Int) {
        for (i in START_OUTPUT..number) {
            println(
                when {
                    i % FIZZ_BUZZ == 0 -> "FizzBuzz"
                    i % BUZZ == 0 -> "Buzz"
                    i % FIZZ == 0 -> "Fizz"
                    else -> i
                }
            )
        }
    }

    companion object {
        private const val MIN_VALUE = 20
        private const val MAX_VALUE = 100
        private val RANGE = MIN_VALUE..MAX_VALUE
        private const val START_OUTPUT = 1
        private const val FIZZ = 3
        private const val BUZZ = 5
        private const val FIZZ_BUZZ = 15
    }
}