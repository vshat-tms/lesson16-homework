package commands

import Command

/**
 * Пользователь вводит целое число от 5 до 10.
 * Если число не указано или вне этого диапазона, то используйте число 5.
 * Нужно отсчитать от указанного числа до нуля.
 * После вывода каждой строки кроме последней (0) должна быть пауза в 1 секунду.
 */

class Sib_timer: Command{
    override val keyword = "sib_timer"
    override val description = "Timer method"

    override fun execute(text: String) {
        try{
            val timeValue = if (text.isNotBlank() && text.toInt() in 5..10)
            text.toInt()
            else 5
            for (it in timeValue downTo 0){
                if (it != 0) {
                    println("$it...")
                    Thread.sleep(1000)
                }
                else println(it)
            }
        }
        catch (ex: Exception){
            println("Некорректный ввод")
        }
    }
}