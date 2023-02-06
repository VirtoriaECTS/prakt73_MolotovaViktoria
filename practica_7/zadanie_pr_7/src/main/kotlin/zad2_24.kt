//Задание 2 номер 24
fun main(){
    try {
        println("Ввведити число x")
        val x: Double = readLine()!!.toDouble()
        println("Введите y")
        val y: Double = readLine()!!.toDouble()

        if((x > 0) && (y > 0)) println("1 четверть")
        else{
            if((x < 0) && (y > 0)) println("2 четверть")
            else{
                if((x < 0) && (y < 0)) println("3 четверть")
                else{
                    if((x > 0) && (y < 0)) println("4 четверть")
                    else println("Точка не лежит на оси")
                }
            }
        }

    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }

}