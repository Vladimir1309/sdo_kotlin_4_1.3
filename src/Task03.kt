fun main () {
    // Числовая матрица
    print("Укажите размер матрицы (от 3 до 9): ")
    val n = readln().toIntOrNull()
    if (n == null || n !in 3..9) print("Неверное значение")
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