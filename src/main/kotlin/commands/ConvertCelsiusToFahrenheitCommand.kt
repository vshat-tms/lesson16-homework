package commands

import Command

class ConvertCelsiusToFahrenheitCommand: Command {

    override val keyword = "c_to_f"
    override val description = "convert celsius to fahrenheit"

    override fun execute(text: String) {
        try {
            val celsius = text.toDouble()
            val fahrenheit = celsius * 1.8 + 32
            println("${String.format("%.2f", celsius)} °C = ${String.format("%.2f", fahrenheit)} °F")
        }catch (e: Exception){
            println("$text - not number")
        }
    }
}