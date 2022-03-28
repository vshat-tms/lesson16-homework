package commands

import Command

class Timer : Command {
    override val keyword = "timer"
    override val description = "User enter number for timer in the range 5...10"

    override fun execute(text: String) {
        var numOfUser : Int
        try {
            numOfUser = text.toInt()
        } catch (e: NumberFormatException){
            println("Uncorrected number!")
            return
        }
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
    }
}
