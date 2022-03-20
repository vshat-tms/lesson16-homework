package commands

import Command

class Timer : Command {
    override val keyword = "timer"
    override val description = "timer from input downTo 0"

    override fun execute(text: String) {
        val timerCount: Int? = text.toIntOrNull()
        val timeout = if (timerCount in RANGE) {
            timerCount
        } else 5
        timeout?.let { startTimer(it) }
    }

    private fun startTimer(time: Int) {
        for (i in time downTo 1) {
            println("$i...")
            Thread.sleep(TIMEOUT_MS)
        }
        println(TIMER_END)
    }

    companion object {
        private const val MIN_VALUE = 5
        private const val MAX_VALUE = 10
        private val RANGE = MIN_VALUE..MAX_VALUE
        private const val TIMEOUT_MS = 1000L
        private const val TIMER_END = 0
    }
}
