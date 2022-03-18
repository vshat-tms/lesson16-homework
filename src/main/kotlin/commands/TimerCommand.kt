package commands

import Command

class TimerCommand : Command {
    override val keyword: String = "timer"
    override val description: String = "Enter an integer in the range 5...10 to start the timer"

    override fun execute(text: String) {
        val inputNum: Int
        try {
            inputNum = text.toInt()
        } catch (e: NumberFormatException) {
            startedTimer()
            return
        }
        if (inputNum in 5..10) {
            startedTimer(inputNum)
        } else {
            startedTimer()
        }
    }

    private fun startedTimer(sec: Int = 5) {
        var i = sec
        while (i != 0) {
            println("$i...")
            i--
            Thread.sleep(1000)
        }
        println(0)
    }
}
