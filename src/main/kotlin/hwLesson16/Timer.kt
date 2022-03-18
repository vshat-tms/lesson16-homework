package hwLesson16

fun timerFromInputToZeroWhitDelay(item: Int) {
    var inputNumber = item

    while (inputNumber > 0) {
        println(inputNumber--)
        Thread.sleep(1000)
    }
    println(inputNumber)
}