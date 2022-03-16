package commands

import Command

class F_To_C: Command {
    override val keyword: String = "fahrenheit"
    override val description: String = "fahrenheit to celsius"

    override fun execute(text: String) {
        try {
            val fahrenheit: Double = text.toDouble()
            val celsius: Double = (fahrenheit - 32) / 1.8
            println("${String.format("%.2f", fahrenheit)}℉ = ${String.format("%.2f", celsius)}°C")
        } catch (e: NumberFormatException){
            println("An invalid value was entered")
        }
    }
}