package commands

import java.util.*

fun main() {
    val myFizzbuzz = FizzBazz()
    myFizzbuzz.fizzbuzz()

}

val scanner = Scanner(System.`in`)

class FizzBazz(){
    fun fizzbuzz(){
        print("Введите число от 20 до 100 включительно: ")
            val valueF = scanner.nextInt()
            if (valueF in 20..100){
                for (i in 1..valueF) {
                    when{
                        i % 15 == 0 -> println("FizzBuzz")
                        i % 3 == 0 -> println("Fizz")
                        i % 5 == 0 -> println("Buzz")
                        else -> println(i)
                    }

                }
            }else {
                throw NumberFormatException("Ошибка ввода.")
            }
    }
}