package commands

import Command
import java.lang.NumberFormatException

class ConvertCelsiusToFahrenheitCommand: Command {

    override val keyword = "c_to_f"
    override val description = "convert celsius to fahrenheit"

    override fun execute(text: String) {
        val celsius: Double
        try {
            celsius = text.toDouble()
        }catch (e: NumberFormatException){
            println("$text - not number")
            return
        }
        val fahrenheit = celsius * 1.8 + 32
        println("${String.format("%.2f", celsius)} °C = ${String.format("%.2f", fahrenheit)} °F")
    }
}