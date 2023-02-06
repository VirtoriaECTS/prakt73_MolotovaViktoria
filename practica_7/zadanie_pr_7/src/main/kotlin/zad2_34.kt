//Задание 2 номер 34

import kotlin.math.*
fun main(){
    try {
        println("Ввведити число k")
        val k: Double = readLine()!!.toDouble()
        println("Введите a")
        val a: Double = readLine()!!.toDouble()
        println("Введите b")
        val b: Double = readLine()!!.toDouble()

        val d = b.pow(2) + 4 * k
        val x1 = (-b - sqrt(d)) / 2 * k
        val x2 = (-b + sqrt(d) ) / 2 * k

        if(x1 == x2) println("Одна точка с координатами $x1; ${a / x1}")
        else{
            val y1 = a / x1
            val y2 = a / x2
            println("Две точки с координатами $x1; $y1 и $x2;$y2")
        }
    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }

}