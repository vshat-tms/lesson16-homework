package Ermoshin_Stepan

import Command

class FahrenheitToCelsius : Command{
    override val keyword: String = "f_to_c"
    override val description: String = "translates fahrenheits to celsius"

    override fun execute(text: String) {
        var fahrenheits = 0.0
        try {
            fahrenheits = text.toDouble()
        } catch (ex: NumberFormatException) {
            println("$text isn't a number")
        }

        val celsius = (fahrenheits - 32) / 1.8
        println("${String.format("%.2f", fahrenheits)} °F = ${String.format("%.2f", celsius)} °C")
    }
}