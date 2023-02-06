//Задание 2 номер 46
fun main(){
    try {
        println("Ввведити число, обозначающее день недели")
        val number: Int = readLine()!!.toInt()
        if((number > 0) && (number <= 5)) println("Рабочий день")
        else if((number > 5) && (number <= 7)) println("Выходной день")
        else println("Вы велли неверное число")
    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }

}