package commands

import Command
import java.util.*

class ScreenOutPut : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "User enter number which enter to screen"

    override fun execute(text: String) {
        var numOfUser = 0
        var firstNumber  = 1
        try {
            numOfUser = text.toInt()
        } catch (e: InputMismatchException){
            println("Uncorrect number!")
        }
        when (numOfUser) {
            in 20..100 -> {
                while (firstNumber < numOfUser){
                    if (firstNumber % 15 == 0) {
                        println("FizzBuzz")
                    } else if (firstNumber % 5 == 0) {
                        println("Buzz")
                    } else if (firstNumber % 3 == 0) {
                        println("Fizz")
                    } else {
                        println(firstNumber)
                    }
                    firstNumber++
                }
            }
            !in 20..100 -> {
                println("Number is not in a diapozone")
            }
        }
    }
}