package commands

import Command

/**
 * Пользователь вводит целое число от 5 до 10.
 * Если число не указано или вне этого диапазона, то используйте число 5.
 * Нужно отсчитать от указанного числа до нуля.
 * После вывода каждой строки кроме последней (0) должна быть пауза в 1 секунду.
 */

class Timer : Command {
    override val keyword = "timer"
    override val description = "Countdown timer"

    override fun execute(text: String) {

        val inputValue = text.toIntOrNull()
        if (inputValue == null) {
            println("Некорректный ввод")
            return
        }
        val timeValue = if (inputValue in (5..10)) {
            inputValue
        } else 5

        for (it in timeValue downTo 0) {
            if (it != 0) {
                println("$it...")
                Thread.sleep(1000)
            } else println(it)
        }
    }
}