package commands

import Command

/**
 * Команда f_to_c
 * Пользователь вводит температуру в фаренгейтах (дробное число - Double).
 * Нужно перевести его в цельсии.
 * Количество символов после запятой в выводе не должно быть больше двух.
 * Если пользователь неправильно ввёл число - нужно вывести ошибку.
 */

class Sib_F_to_C: Command{
    override val keyword = "sib_FC"
    override val description = "F to C method"

    override fun execute(text: String) {
        try{
            val farIn = text.toDouble()
            val celOut = (farIn - 32) / 1.8
            println("${String.format("%.2f",farIn)} Фаренгейт = ${String.format("%.2f", celOut)} Градусов Цельсия")
        }
        catch (ex: Exception){
            println("Некорректный ввод")
        }
    }
}