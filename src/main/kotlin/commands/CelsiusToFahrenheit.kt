package commands

import Command
import java.util.*

class CelsiusToFahrenheit : Command {
    override val keyword = "c_to_f"
    override val description = "translates celsius to fahrenheits"

    override fun execute(text: String) {
        val scanner = Scanner(System.`in`)
        val consA = 1.8
        val consB = 32

        print("Enter Fahrenheit: ")
        try {
            val celsius = scanner.nextDouble()
            val fahrenheit = celsius * consA + consB
            println("$celsius℃=" + String.format("%.2f", fahrenheit) + "F")
        } catch (e: InputMismatchException) {
            print("Enter a number, not a letter: ")
        }
    }
}