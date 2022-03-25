package commands

import Command

class ConvertFahrenheitToCelsiusCommand: Command {
    override val keyword = "f_to_c"
    override val description = "convert fahrenheit to celsius"

    override fun execute(text: String) {
        try {
            val fahrenheit = text.toDouble()
            val celsius = (fahrenheit - 32)/1.8
            println("${String.format("%.2f", fahrenheit)} °F = ${String.format("%.2f", celsius)} °C")
        }catch (e: Exception){
            println("$text - not number")
        }
    }
}