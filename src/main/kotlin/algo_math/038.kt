package algo_math

fun main() {
    val (N, Q) = readLine()!!.split(" ").map{ it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }
    val list = List(Q) {
        readLine()!!.split(" ").map { it.toInt() }
    }
    val B = MutableList(A.size){0}
    B[0] = 0

    for (i in 1..N) B[i] = B[i - 1] + A[i]

    for (i in 1..Q) println(B[list[i][1]] - B[list[i][0]])
}