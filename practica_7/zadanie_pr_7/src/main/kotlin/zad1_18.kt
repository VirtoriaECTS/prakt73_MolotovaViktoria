//Задание 1 номер 18
fun main(){
    try {
        println("Ввведити число")
        val number: Int = readLine()!!.toInt()
        if(number > 99 && number < 1000){
            val one: Int = number / 100
            val two: Int= (number / 10) % 10
            val three: Int = number % 10

            val sum: Int =  one + two + three
            val proisvedenie: Int = one * two * three

            println("Сумма чисел " + sum + ".Произведение чисел " + proisvedenie)
        }
        else{
            println("Необходимо ввести трехзначное число")
        }

    }
    catch (e: NumberFormatException){
        println("Ошибка. Требуется ввести число")
    }

}
