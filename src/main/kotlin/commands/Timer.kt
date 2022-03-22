package commands

import Command
import java.util.*

class Timer : Command {
    override val keyword = "timer"
    override val description = "It's a timer=)"

    override fun execute(text: String) {
        val scanner = Scanner(System.`in`)

        println("Enter a number from 5 to 10: ")
        val number = scanner.nextInt()
        if (number in 5..10) {

            for (number in number downTo (1)) {
                print(number)
                println("..")
                Thread.sleep(1000)
            }

        } else (number !in 5..10)
        for (number in 5 downTo (1)) {
            print(number)
            println("..")
            Thread.sleep(1000)
        }
        println("0")
    }
}
