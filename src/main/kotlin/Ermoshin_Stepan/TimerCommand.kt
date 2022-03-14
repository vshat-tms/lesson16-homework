package Ermoshin_Stepan

import Command

class TimerCommand : Command {
    override val keyword: String = "timer";
    override val description: String = "Sets and starts timer from X to 1"

    override fun execute(text: String) {
        try {
            val timerApex = if (text.isNotBlank()) {
                text.toInt()
            } else {
                5
            }

            for (x in timerApex downTo 0) {
                if (x != 0) {
                    Thread.sleep(1000)
                    println("$x...")
                }
                else {
                    println(x)
                }
            }
        } catch (ex: NumberFormatException){
            println("$text isn't a number")
        }
    }
}