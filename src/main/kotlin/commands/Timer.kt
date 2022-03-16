package commands

import java.util.*

fun main() {
    val myTimer = Timer()
    myTimer.timer()
}

class Timer() {
    fun timer() {
        print("Введете начало отсчета от 5 до 10: ")
        val value = scanner.nextInt()
        if (value >= 5 && value <= 10) {
            for (i in value downTo 0) {
                println("$i..")
                Thread.sleep(1000)
            }
        } else {
            for (i in 5 downTo 0) {
                println("$i..")
                Thread.sleep(1000)
            }
        }
    }
}