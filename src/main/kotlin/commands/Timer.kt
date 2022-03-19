package commands

import Command
import java.util.*

class Timer : Command {
    override val keyword = "timer"
    override val description = "User enter number for timer"

    override fun execute(text: String) {
        println("Enter number from 5 to 10:")
        val scanner = Scanner(System.`in`)
        try {
            var numOfUser = scanner.nextInt()
            when (numOfUser) {
                in 5..10 -> {
                    while (numOfUser != 0) {
                        println("$numOfUser...")
                        Thread.sleep(1000)
                        numOfUser--
                    }
                }
                !in 5..10 -> {
                    numOfUser = 5
                    while (numOfUser != 0) {
                        println("$numOfUser...")
                        Thread.sleep(1000)
                        numOfUser--
                    }
                }
            }
            println("$numOfUser")
        }catch(e: InputMismatchException){
            println("Uncorrect number!")
        }
    }
}
