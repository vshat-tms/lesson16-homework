package commands
import Command
import java.text.DecimalFormat

class FahrenheitToCelsiusFromSiarhey : Command {
    override val keyword = "f_to_c"
    override val description = "Fahrenheit to Celsius converter, min value $ABSOLUTE_ZERO_FAHRENHEIT"

    override fun execute(text: String) {
        val fahrenheit: Double? = try {
            text.toDouble()
        } catch (e: NumberFormatException) {
            null
        }
        if (fahrenheit != null && fahrenheit >= ABSOLUTE_ZERO_FAHRENHEIT) {
            fahrenheitToCelsiusConverter(fahrenheit)
        } else {
            println("incorrect input")
        }
    }

    private fun fahrenheitToCelsiusConverter(fahrenheit: Double) {
        val celsius: Double = (fahrenheit.minus(32)).div(1.8)
        println("${DecimalFormat(DECIMAL_FORMAT).format(fahrenheit)} ℉ = " +
                "${DecimalFormat(DECIMAL_FORMAT).format(celsius)} ℃")
    }

    companion object {
        const val DECIMAL_FORMAT = "#0.00"
        const val ABSOLUTE_ZERO_FAHRENHEIT = -459.67
    }
}