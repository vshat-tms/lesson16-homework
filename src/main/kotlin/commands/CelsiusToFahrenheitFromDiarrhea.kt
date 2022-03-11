package commands
import Command
import java.text.DecimalFormat

class CelsiusToFahrenheitFromDiarrhea : Command {
    override val keyword = "c_to_f"
    override val description = "Celsius to Fahrenheit converter, min value $ABSOLUTE_ZERO_CELSIUS"

    override fun execute(text: String) {
        val celsius: Double? = try {
            text.toDouble()
        } catch (e: NumberFormatException) {
            null
        }
        if (celsius != null && celsius >= ABSOLUTE_ZERO_CELSIUS) {
            celsiusToFahrenheitConverter(celsius)
        } else {
            println("incorrect input")
        }
    }

    private fun celsiusToFahrenheitConverter(celsius: Double) {
        val fahrenheit: Double = celsius * 1.8 + 32
        println("${DecimalFormat(DECIMAL_FORMAT).format(celsius)} ℃ = " +
                "${DecimalFormat(DECIMAL_FORMAT).format(fahrenheit)} ℉ ")
    }

    companion object {
        const val DECIMAL_FORMAT = "#0.00"
        const val ABSOLUTE_ZERO_CELSIUS = -273.15
    }
}

