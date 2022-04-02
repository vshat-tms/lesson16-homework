package commands

import Command
import java.text.DecimalFormat

class TemperatureConversionCToF : Command {
    override val keyword: String = "c_to_f"
    override val description: String = "Temperature conversion from celsius to fahrenheit"

    override fun execute(text: String) {
        val numFromUser: Double
        try {
            numFromUser = text.toDouble()
        } catch (e: NumberFormatException) {
            println("Uncorrected enter!")
            return
        }
        val temperaturaInFahrenheit = numFromUser * 1.8 + 32
        println(
            "${DecimalFormat(DECIMAL_FORMAT).format(numFromUser)} ℃ = " +
                    "${DecimalFormat(DECIMAL_FORMAT).format(temperaturaInFahrenheit)} ℉ "
        )
    }

    companion object {
        const val DECIMAL_FORMAT = "#0.00"
    }
}