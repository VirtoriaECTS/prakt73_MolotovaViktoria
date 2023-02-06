//Задание 2 номер 14
fun main(){
    try {
        println("Ввведити число x")
        val x: Double = readLine()!!.toDouble()
        println("Ввведити число y")
        val y: Double = readLine()!!.toDouble()
        println("Ввведити число m")
        val m: Double = readLine()!!.toDouble()
        println("Ввведити число n")
        val n: Double = readLine()!!.toDouble()

        if((x - y) < (m % n)) println(x + 1)
        else println("Разность x - y больше m % n ")
    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }


}