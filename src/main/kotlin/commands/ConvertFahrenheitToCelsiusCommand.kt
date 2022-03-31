package commands

import Command
import java.lang.NumberFormatException

class ConvertFahrenheitToCelsiusCommand: Command {
    override val keyword = "f_to_c"
    override val description = "convert fahrenheit to celsius"

    override fun execute(text: String) {
        val fahrenheit: Double
        try {
            fahrenheit = text.toDouble()
        }catch (e: NumberFormatException){
            println("$text - not number")
            return
        }
        val celsius = (fahrenheit - 32)/1.8
        println("${String.format("%.2f", fahrenheit)} °F = ${String.format("%.2f", celsius)} °C")
    }
}