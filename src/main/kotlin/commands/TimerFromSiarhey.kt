package commands

import Command

class TimerFromSiarhey : Command {
    override val keyword = "timer"
    override val description = "timer from Siarhey"

    override fun execute(text: String) {
        val timerCount: Int? = try {
            text.toInt()
        } catch (e: NumberFormatException) {
            null
        }
        if (timerCount in 5..10) timerCount?.let { startTimer(it) } else startTimer()
    }

    private fun startTimer(time: Int = 5) {
        var timerCont = time
        while (timerCont != 0) {
            println(timerCont)
            Thread.sleep(1000)
            timerCont--
        }
        println(timerCont)
    }
}