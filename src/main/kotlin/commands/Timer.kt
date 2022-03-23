package commands

import Command


class TimerCommand : Command {
    override val keyword: String = "timer"
    override val description: String = "Performs a countdown"

    override fun execute(text: String) {
        try {
            val inputValue = text.toInt()
            if (inputValue in 5..10) {
                for (i in inputValue downTo 1) {
                    println("$i..")
                    Thread.sleep(1000)
                }
            } else {
                for (i in 5 downTo 0) {
                    println("$i..")
                    Thread.sleep(1000)
                }
            }
            println(0)
        }catch (e : NumberFormatException) {
            println("Некорректный ввод")
    }
}


}