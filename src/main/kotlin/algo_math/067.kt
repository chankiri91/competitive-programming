package algo_math

fun main() {
    val (H, W) = readLine()!!.split(" ").map { it.toInt() }
    val A = List(H) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    val rowSumList = MutableList(H) { 0 }
    val columnSumList = MutableList(W) { 0 }

    for (i in 0 until H) {
        for (j in 0 until W) {
            rowSumList[i] += A[i][j]
            columnSumList[j] += A[i][j]
        }
    }

    for (i in 0 until H) {
        var result = MutableList(W) { 0 }
        for (j in 0 until W) {
            result[j] = rowSumList[i] + columnSumList[j] - A[i][j]
        }
        print(result.joinToString(separator = " "))
        println()
    }
}