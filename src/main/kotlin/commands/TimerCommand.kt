package commands

import Command

class TimerCommand: Command {

    override val keyword = "timer"
    override val description = "timer from your number to 0"

    override fun execute(text: String){
        val timerCount: Int? = text.toIntOrNull()
        val timeout = if(timerCount in 5..10){
           timerCount
        }else 5
        timeout?.let {  }
    }

    private fun startTimer(time: Int){
        for(i in time downTo 1){
            println("$i...")
            Thread.sleep(THREAD_SLEEP_TIME_MS)
        }
        println(0)
    }


    companion object{
     private const val THREAD_SLEEP_TIME_MS = 1000L
    }
}