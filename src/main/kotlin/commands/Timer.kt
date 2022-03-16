package commands

import Command

class Timer : Command {
    override val keyword: String = "timer"
    override val description: String = "Enter an integer in the range 5...10 to start the timer"

    override fun execute(text: String) {
        try {
            val num = text.toInt()
        if (num in 5..10) run(num)
        else run()
        } catch (e: NumberFormatException){
            run()
        }
    }


    private fun run(num: Int = 5) {
        var i = num
        while (i != 0) {
            println("$i...")
            i--
            Thread.sleep(1000)
        }
        println(0)
    }
}
