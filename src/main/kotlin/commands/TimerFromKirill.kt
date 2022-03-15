package commands

import Command

class TimerFromKirill: Command {

    override val keyword = "timer"
    override val description = "timer from your number to 0"

    override fun execute(text: String) {
        try {
            val timerCount = if (text.isNotBlank()){
                text.toInt()
            }else{
                5
            }

            for(it in timerCount downTo 0){
                if (it != 0){
                    Thread.sleep(1000)
                    println("$it...")
                }else{
                    println(it)
                }
            }

        }catch (ex: Exception){
            println("$text - not number")
        }
    }
}