package commands

import Command


class TimerCommand : Command {
    override val keyword: String = "timer"
    override val description: String = "Performs a countdown"

    override fun execute(text: String) {
        try {
            val inputValue = text.toInt()
            if (inputValue in MIN_VALUE_INPUT..MAX_VALUE_INPUT) {
                for (i in inputValue downTo MIN_VALUE_TAIMER) {
                    println("$i..")
                    Thread.sleep(MILLIS.toLong())
                }
            } else {
                for (i in MIN_VALUE_INPUT downTo MIN_VALUE_TAIMER) {
                    println("$i..")
                    Thread.sleep(MILLIS.toLong())
                }
            }
            println(0)
        } catch (e: NumberFormatException) {
            println("Некорректный ввод")
        }
    }

    companion object {
        private const val MILLIS = 1000
        private const val MAX_VALUE_INPUT = 10
        private const val MIN_VALUE_INPUT = 5
        private const val MIN_VALUE_TAIMER = 1
    }
}