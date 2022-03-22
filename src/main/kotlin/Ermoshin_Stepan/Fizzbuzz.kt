package Ermoshin_Stepan

import Command

class Fizzbuzz : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "makes 'fizzbuzz' :)"

    override fun execute(text: String) {
        var digit = 0
        try {
            digit = text.toInt()
        } catch (ex : NumberFormatException){
            println("$text isn't a digit")
        }

        if (digit in START_RANGE_VALUE..END_RANGE_VALUE) {
            for (x in 1..digit){
                when {
                    x % FIZZBUZZ_VALUE == 0 -> println("FizzBuzz")
                    x % BUZZ_VALUE == 0 -> println("Buzz")
                    x % FIZZ_VALUE == 0 -> println("Fizz")
                    else -> println(x)
                    }
                }
            }
        else {
            println("Entered digit isn't in range $START_RANGE_VALUE .. $END_RANGE_VALUE ")
        }
    }

    companion object {
        const val START_RANGE_VALUE = 20
        const val END_RANGE_VALUE = 100
        const val FIZZBUZZ_VALUE = 15
        const val BUZZ_VALUE = 5
        const val FIZZ_VALUE = 3
    }
}