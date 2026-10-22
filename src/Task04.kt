fun main () {
    // Золотое сечение
    print("Укажите целое неотрицательное число: ")
    val m = readln().toIntOrNull()
    if (m == null || m < 0)
        print("Неверное значение")
    else {
        if (m == 0) {
            print("Число 0 является числом Фибоначчи. Его порядковый номер: 1.")
            return
        }
        if (m == 1) {
            print("Число 1 является числом Фибоначчи. Его порядковый номер: 2 и 3.")
            return
        }
        var n = 2
        var previous = 0
        var current = 1
        var next = 0
        while (current < m) {
            n++
            next = current + previous
            previous = current
            current = next
            if (current == m) {
                print("Число $m является числом Фибоначчи. Его порядковый номер: $n")
                break
            }
        }
        if (current != m)
            print("Число $m не является числом Фибоначчи")
    }
}