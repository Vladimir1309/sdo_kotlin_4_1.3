fun main () {
    // Комплексный анализ числа
    print("Введите целое неотрицательное число: ")
    val x = readln().toIntOrNull()
    if (x == null)
        println("Неверное значение")
    else {
        var n = x
        var count = 0
        var sumNum = 0
        var sumAnswer = 0
        var min = 0
        var max = 0
        var temp = 0
        if (n == 0)
            count = 1
        while (n > 0) {
            count++
            sumNum = n % 10
            sumAnswer += sumNum
            if (sumNum > max)
                max = sumNum
            else
                min = sumNum
            temp = temp * 10 + sumNum
            n /= 10
        }
        println("Количество цифр: $count")
        println("Сумма цифр: $sumAnswer")
        println("Наибольшая цифра: $max")
        println("Наименьшая цифра: $min")
        if (temp != x) println("Палиндром: нет")
        else println("Палиндром: да")
    }
}