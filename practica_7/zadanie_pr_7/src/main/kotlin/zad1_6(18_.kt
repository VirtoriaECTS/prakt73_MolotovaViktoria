//Задание 1 номер 6 (18)
import kotlin.math.*

fun main(){
try {
    println("Ввведити число a")
    val a: Double = readLine()!!.toDouble()
    println("Ввведити число b")
    val b: Double = readLine()!!.toDouble()
    println("Ввведити число c")
    val c: Double = readLine()!!.toDouble()
    println("Ввведити число d")
    val d: Double = readLine()!!.toDouble()
    println("Ввведити число n")
    val n: Double = readLine()!!.toDouble()
    val numerator1: Double = 0.25 * (a-b)
    val module_b: Double = abs(b)
    val denominator: Double = (10.0.pow(n + 3.0)) + ((log10(b)) / (c - d))
    val result: Double = (numerator1) / (1/8 - (module_b/ denominator))
    println(result)
}
catch (e: NumberFormatException){
    println("Ошибка. Требуется ввести число")
}
}