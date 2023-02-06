//Задание 1 номер 3
fun main(){
    try {
        println("Введите первый номер прогресии");
        val n: Int = readLine()!!.toInt()
        println("Введите значение этого номера");
        val n_number: Int = readLine()!!.toInt()
        println("Введите первый номер прогресии");
        val m: Int = readLine()!!.toInt()
        println("Введите значение этого номера");
        val m_number: Int = readLine()!!.toInt()

        val summa: Int = (n_number + m_number) * (n-m+1)/2
        println("Сумма " + summa)
    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }

}
