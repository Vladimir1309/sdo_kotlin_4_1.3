fun main () {
    print("Укажите размер матрицы: ")
    val n = readln().toIntOrNull()
    if (n == null) print("Неверное значение")
    else {
        for (i in 1..n) {
            for (j in 1 ..n) {
                if (i == j) print("0\t")
                if (j > i) print("1\t")
                if (j < i) print("2\t")
            }
            println()
        }
    }
}