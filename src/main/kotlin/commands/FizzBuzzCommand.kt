package commands

import Command
import java.lang.NumberFormatException

class FizzBuzzCommand: Command {
    override val keyword = "fizzbuzz"
    override val description = "Pls enter an integer in the rage from $START_RANGE_VALUE to $END_RANGE_VALUE"

    override fun execute(text: String) {
        val inputNumber: Int
        try {
            inputNumber = text.toInt()
        }catch (e: NumberFormatException){
            println("Error $description")
            return
        }
        if (inputNumber in START_RANGE_VALUE..END_RANGE_VALUE){
            for (i in 1..inputNumber){
                when{
                    i % FIZZBUZZ_VALUE == 0 -> println("FizzBuzz")
                    i % BUZZ_VALUE == 0 -> println("Buzz")
                    i % FIZZ_VALUE == 0 -> println("Fizz")
                    else -> println(i)
                }
            }
        }else println("Error $description")
    }

    companion object{
        const val START_RANGE_VALUE = 20
        const val END_RANGE_VALUE = 100
        const val FIZZBUZZ_VALUE = 15
        const val BUZZ_VALUE = 5
        const val FIZZ_VALUE = 3
    }
}