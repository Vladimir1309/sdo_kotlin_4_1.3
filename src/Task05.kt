fun main () {
    // Обработка потоков данных
    var avg = 0.toDouble()
    var sum = 0
    var min = 0
    var max = 0
    var c = 0
    var cMax = 0
    var cMin = 0
    while (true) {
        print("Введите число: ")
        val n = readln().toIntOrNull()
        if (n == null) {
            println("Неверное значение, ожидаю ввод")
            continue
        }
        else {
            if (n == 0) {
                if (c == 0) {
                    println("Не было введено ни одного числа")
                    continue
                }
                else {
                    avg = sum.toDouble() / c.toDouble()
                    println("Среднее арифметическое: %.1f".format(avg))
                    println("Наибольшее значение: $max")
                    println("Наименьшее значение: $min")
                    println("Количество повторений максимума: $cMax")
                    println("Количество повторений минимума: $cMin")
                    break
                }
            }
            sum += n
            c++
            if (n > 0)
                if (n < min)
                    min = n
            if (min == cMin)
                cMin++
            if (n > max)
                max = n
            if (max == cMax)
                cMax++
        }
    }
}