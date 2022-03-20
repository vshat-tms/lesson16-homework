package commands

import Command
import java.text.DecimalFormat

class FahrenheitToCelsius : Command {
    override val keyword = "f_to_c"
    override val description = "Fahrenheit to Celsius converter"

    override fun execute(text: String) {
        val fahrenheit: Double? = text.toDoubleOrNull()
        if (fahrenheit != null && fahrenheit >= ABSOLUTE_ZERO_FAHRENHEIT) {
            convertFahrenheitToCelsius(fahrenheit)
        } else {
            println("incorrect input")
        }
    }

    private fun convertFahrenheitToCelsius(fahrenheit: Double) {
        val celsius: Double = (fahrenheit - 32) / 1.8
        println("${DECIMAL_FORMAT.format(fahrenheit)} ℉ = " +
                "${DECIMAL_FORMAT.format(celsius)} ℃")
    }

    companion object {
        private val DECIMAL_FORMAT = DecimalFormat("#0.00")
        private const val ABSOLUTE_ZERO_FAHRENHEIT = -459.67
    }
}