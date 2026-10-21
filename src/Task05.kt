fun main () {
    // Обработка потоков данных
    var current = 0
    var next = 0
    var avg = 0.toDouble()
    var sum = 0
    var min = 0
    var max = 0
    var c = 0
    var cMax = 0
    var cMin = 0
    while (true) {
        print("Введите число: ")
        var n = readln().toIntOrNull()
        if (n == null) {
            println("Неверное значение, ожидаю ввод")
            continue
        }
        else {
            if (n == 0) {
                avg = sum.toDouble() / c.toDouble()
                println("Среднее арифметическое: ${avg}")
                println("Наибольшее значение: $max")
                println("Наименьшее значение: $min")
                println("Количество повторений максимума: $cMax")
                println("Количество повторений минимума: $cMin")
                break
            }
            next = n
            sum = current + next
            current = next
            c++
            if (min < current) min = current
            if (min == cMin) cMin++
            if (max > current) max = current
            if (max == cMax) cMax++
            if (current == 0) print("Не было введено ни одного числа")
        }
    }
}