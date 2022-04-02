package commands

import Command

class Timer : Command {
    override val keyword = "timer"
    override val description = "User enter number for timer in the range 5...10"

    override fun execute(text: String) {
        var numFromUser: Int
        try {
            numFromUser = text.toInt()
        } catch (e: NumberFormatException) {
            println("Uncorrected number!")
            return
        }
        when (numFromUser) {
            in 5..10 -> {
                while (numFromUser != 0) {
                    println("$numFromUser...")
                    Thread.sleep(1000)
                    numFromUser--
                }
            }
            !in 5..10 -> {
                numFromUser = 5
                while (numFromUser != 0) {
                    println("$numFromUser...")
                    Thread.sleep(1000)
                    numFromUser--
                }
            }
        }
        println("$numFromUser")
    }
}
