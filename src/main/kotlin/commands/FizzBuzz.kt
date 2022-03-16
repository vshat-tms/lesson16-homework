package commands

import Command

class FizzBuzz: Command {
    override val keyword: String = "fizzbuzz"
    override val description: String = "Enter an integer in the range 20...100"


    override fun execute(text: String) {
        try {
            var nummber = text.toInt()
            if (nummber in 20..100) {
                for (num in 1..nummber) {
                    when {
                        num % 15 == 0 ->
                            println("FizzBuzz")
                        num % 5 == 0 ->
                            println("Buzz")
                        num % 3 == 0 ->
                            println("Fizz")
                        else -> println(num)
                    }
                }
            } else println("Error $description")
        } catch (e: NumberFormatException){
            println("Error $description")
        }
    }


}