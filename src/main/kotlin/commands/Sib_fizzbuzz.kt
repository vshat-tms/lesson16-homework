package commands

import Command

/**
 * Выводит на экран числа от 1 до n включительно. n - целое число от 20 до 100.
 * Если число вне этого диапазона или неверно введено - то сообщите об этом пользователю.
 * При этом вместо чисел, кратных трем, программа должна выводить слово Fizz,
 * а вместо чисел, кратных пяти — слово Buzz.
 * Если число кратно пятнадцати, то программа должна выводить слово FizzBuzz.
 */

class Sib_fizzbuzz: Command {
    override val keyword = "sib_fzbz"
    override val description = "fizz buzz method"

    override fun execute(text: String) {
        try{
            val fizzbuzz = text.toInt()
            if (fizzbuzz in 20..100){
                for (i in 1..fizzbuzz){
                    when{
                        i % 15 == 0 -> println("FizzBuzz")
                        i % 3 == 0 -> println("Fizz")
                        i % 5 == 0 -> println("Buzz")
                        else -> println(i)
                    }
                }
            }
        else println("Число вне допустимого диаппазона")
        }
        catch (ex: Exception){
            println("Некорретный ввод")
        }
    }
}