package commands

import Command
import java.util.*

class FahrenheitToCelsius : Command {
    override val keyword = "f_to_c"
    override val description = "translates fahrenheits to celsius"

    override fun execute(text: String) {
        val fahrenheit: Double
        print("Enter Fahrenheit: ")
        try {
            fahrenheit = text.toDouble()
        } catch (e: InputMismatchException) {
            print("Enter a number, not a letter: ")
            return
        }
        val celsius = (fahrenheit - 32) / 1.8
        println("${String.format("%.2f", fahrenheit)}℉ = ${String.format("%.2f", celsius)}°C")
    }
}
