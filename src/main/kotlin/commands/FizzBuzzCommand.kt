package commands

import Command

class FizzBuzzCommand: Command {
    override val keyword = "fizzbuzz"
    override val description = "doing fizzbuzz yeaaaaah"

    override fun execute(text: String) {
        var number = 0

        try {
            number = text.toInt()
            if(number in 20..100){
                for (x in 1..number){
                    when(x <= number){
                        x % 15 == 0 -> println("fizzbuzz")
                        x % 5 == 0 -> println("fizz")
                        x % 3 == 0 -> println("buzz")
                        else -> println(x)
                    }
                }
            }else println("$text is not in range from 20 to 100")

        }catch (e: Exception){
            println("$number is not int")
        }
    }
}