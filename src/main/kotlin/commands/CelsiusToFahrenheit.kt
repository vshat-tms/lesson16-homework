package commands

import Command
import java.text.DecimalFormat

class CelsiusToFahrenheit : Command {
    override val keyword = "c_to_f"
    override val description = "Celsius to Fahrenheit converter"

    override fun execute(text: String) {
        val celsius: Double? = text.toDoubleOrNull()
        if (celsius != null && celsius >= ABSOLUTE_ZERO_CELSIUS) {
            convertCelsiusToFahrenheit(celsius)
        } else {
            println("incorrect input")
        }
    }

    private fun convertCelsiusToFahrenheit(celsius: Double) {
        val fahrenheit: Double = celsius * 1.8 + 32
        println("${DECIMAL_FORMAT.format(celsius)} ℃ = " +
                "${DECIMAL_FORMAT.format(fahrenheit)} ℉ ")
    }

    companion object {
        private val DECIMAL_FORMAT = DecimalFormat("#0.00")
        private const val ABSOLUTE_ZERO_CELSIUS = -273.15
    }
}

