package commands

import Command
import java.util.*

class FahrenheitToCelsius : Command {
    override val keyword = "f_to_c"
    override val description="translates fahrenheits to celsius"

    override fun execute(text: String) {
        val scanner = Scanner(System.`in`)
        val consA = 1.8
        val consB = 32

        print("Enter Fahrenheit: ")
        try {
            val fahrenheit = scanner.nextDouble()
            val celsius = (fahrenheit - consB) / consA
            println("$fahrenheit℉=" + String.format("%.2f", celsius) + "℃")
        } catch (e: InputMismatchException) {
            print("Enter a number, not a letter: ")
        }
    }
}