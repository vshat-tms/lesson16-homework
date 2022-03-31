package commands

import Command
import java.lang.NumberFormatException

class TimerCommand: Command {

    override val keyword = "timer"
    override val description = "timer from your number to 0"

    override fun execute(text: String){
        val inputNum: Int
        try {
            inputNum = text.toInt()
        }catch (e: NumberFormatException){
            startTimer()
            return
        }
        if (inputNum in 5..10){
            startTimer(inputNum)
        }else{
            startTimer()
        }
    }

    private fun startTimer(time: Int = 5){
        var timerCount = time
        while (timerCount >= 0){
            println("$timerCount...")
            timerCount--
            Thread.sleep(THREAD_SLEEP_TIME_MS)
        }
    }

    companion object{
        private const val THREAD_SLEEP_TIME_MS = 1000L
        const val MAX_TIMER_VALUE = 10
        const val MIN_TIMER_VALUE = 5
    }
}