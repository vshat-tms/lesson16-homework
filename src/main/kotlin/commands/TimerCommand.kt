package commands

import Command
import java.util.*

class TimerCommand : Command {
    override val keyword = "timer"
    override val description = "timer from input to zero"

    override fun execute(text: String) {
        println("Enter number from 5 to 10")
        val scanner = Scanner(System.`in`)
        var inputNumber = scanner.nextInt()

        if (inputNumber in 5..10) {
            //здесь так и задуманно, пустое тело, точнее inputNumber = inputNumber
            //но как оформить я нинаю(
        } else inputNumber = 5
        timerFromInputToZeroWhitDelay(inputNumber)
    }
}

fun timerFromInputToZeroWhitDelay(item: Int) {
    var inputNumber = item

    while (inputNumber > 0) {
        println(inputNumber--)
        Thread.sleep(1000)
    }
    println(inputNumber)
}

