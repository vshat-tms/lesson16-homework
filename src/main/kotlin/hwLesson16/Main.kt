package hwLesson16

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter command: ")

    when (val command = scanner.nextLine()) {
        "timer" -> {
            println("Enter number from 5 to 10")
            var inputNumber = scanner.nextInt()

            if (inputNumber in 5..10) {
                //здесь так и задуманно, пустое тело, точнее inputNumber = inputNumber
                //но как оформить я нинаю(
            } else inputNumber = 5
            timerFromInputToZeroWhitDelay(inputNumber)
        }

        "fahrenheitToCelsius" -> {
            println("Enter fahrenheit")
            val input = scanner.nextLine()
            fahrenheitToCelsius(input)
        }

        "celsiusToFahrenheit" -> {
            println("Enter celsius")
            val input = scanner.nextLine()
            celsiusToFahrenheit(input)
        }

        "fizzbuzz" -> {
            println("Enter number from 20 to 100")
            val inputNumber = scanner.nextLine()
            fizzbuzz(inputNumber)
        }

        else -> {
            println("input's error")
        }
    }
}
