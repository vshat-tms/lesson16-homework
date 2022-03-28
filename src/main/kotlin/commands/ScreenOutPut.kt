package commands

import Command

class ScreenOutPut : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "User enter number which enter to screen in the range 20...100"

    override fun execute(text: String) {
        val numOfUser: Int
        try {
            numOfUser = text.toInt()
        } catch (e: NumberFormatException){
            println("Uncorrected number!")
            return
        }
        if (numOfUser in 20..100) {
            for (i in 1..numOfUser) {
                when {
                    i % 15 == 0 -> println("FizzBuzz")
                    i % 5 == 0 -> println("Buzz")
                    i % 3 == 0 -> println("Fizz")
                    else -> println(i)
                }
            }
        } else println("Uncorrected number!")
    }
}