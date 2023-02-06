//Задание 2 номер 4

import kotlin.math.*
fun main(){
    try {
        println("Ввведити число a")
        val a: Double = readLine()!!.toDouble()
        println("Ввведити число b")
        val b: Double = readLine()!!.toDouble()
        println("Ввведити число c")
        val c: Double = readLine()!!.toDouble()

        var max = max(a,b)
        if(max < c) max = c
        var min = min(a,b)
        if(min > c) min = c

        val p = (max + min) /2
        println(p)
    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }

}