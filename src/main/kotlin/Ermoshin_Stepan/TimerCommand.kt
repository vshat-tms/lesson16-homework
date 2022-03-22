package Ermoshin_Stepan

import Command

class TimerCommand : Command {
    override val keyword: String = "timer"
    override val description: String = "Sets and starts timer from X to 1"

    override fun execute(text: String) {
        var timerApex = ZERO
        try {
            timerApex = text.toInt()
        } catch (ex: NumberFormatException){
            println("$text isn't a number")
        }

        if (timerApex > MAX_TIMER_VALUE || timerApex < MIN_TIMER_VALUE) timerApex = MIN_TIMER_VALUE

        for (x in timerApex downTo ZERO) {
            if (x != ZERO) {
                Thread.sleep(TIMER_MILLIS)
                println("$x...")
            }
            else {
                println(x)
            }
        }
    }

    companion object {
        const val TIMER_MILLIS : Long = 1000
        const val MAX_TIMER_VALUE = 10
        const val MIN_TIMER_VALUE = 5
        const val ZERO = 0
    }
}