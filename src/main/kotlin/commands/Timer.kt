package commands

import Command
import java.util.*

class Timer : Command {
    override val keyword = "timer"
    override val description = "It's a timer=)"

    override fun execute(text: String) {
        val scanner = Scanner(System.`in`)
        try {
            println("Enter a number from 5 to 10: ")
            val number = scanner.nextInt()
            if (number in MIN_VALUE_INPUT..MAX_VALUE_INPUT) {
                for (number in number downTo MIN_VALUE_TIMER) {
                    println("$number..")
                    Thread.sleep(MILLIS)
                }
            } else
                for (number in MIN_VALUE_INPUT downTo MIN_VALUE_TIMER) {
                    println("$number..")
                    Thread.sleep(MILLIS)
                }
            println("0")
        } catch (e: NumberFormatException) {
            println("Incorrect input")
        }
    }

    companion object {
        private const val MILLIS = 1000L
        private const val MIN_VALUE_INPUT = 5
        private const val MAX_VALUE_INPUT = 10
        private const val MIN_VALUE_TIMER = 1
    }
}
