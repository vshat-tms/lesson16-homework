package Ermoshin_Stepan

import Command

class FahrenheitToCelsius : Command{
    override val keyword: String = "f_to_c"
    override val description: String = "translates fahrenheits to celsius"

    override fun execute(text: String) {

        try {
            val fahrenheits = text.toDouble()
            val celsius = (fahrenheits - 32) / 1.8
            println("${String.format("%.2f", fahrenheits)} °F = ${String.format("%.2f", celsius)} °C")
        } catch (ex: NumberFormatException) {
            println("$text isn't a number")
        }

    }
}