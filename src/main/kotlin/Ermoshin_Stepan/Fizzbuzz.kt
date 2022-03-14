package Ermoshin_Stepan

import Command

class Fizzbuzz : Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "makes 'fizzbuzz' :)"

    override fun execute(text: String) {
        val isTrue = true
        var digit = 0

        try {
            digit = text.toInt()
            if (digit in 20..100) {
                for (x in 1..digit){
                    when (isTrue) {
                        x % 15 == 0 -> println("FizzBuzz")

                        x % 5 == 0 -> println("Buzz")

                        x % 3 == 0 -> println("Fizz")

                        else -> println(x)
                    }
                }
            }
            else {
                println("Entered digit isn't in range 20 .. 100 ")
            }

        } catch (ex : NumberFormatException){
            println("$text isn't a digit")
        }
    }
}