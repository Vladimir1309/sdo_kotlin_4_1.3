fun main () {
    // Комплексный анализ числа
    print("Введите целое неотрицательное число: ")
    val x = readln().toIntOrNull()
    if (x == null) println("Неверное значение")
    else {
        var n = x
        var count = 0
        var sumNum = 0
        if (n == 0) count = 1
        while (n > 0){
            count++
            n /= 10
        }
        println("Количество цифр: $count")
        n = x
        while (n > 0) {
            n /= 10
            sumNum %= x
        }
    }
}