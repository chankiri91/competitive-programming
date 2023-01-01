package algo_math

fun main() {
    val (n, x, y) = readLine()!!.split(" ").map { it.toInt() }
//    val (n, x, y) = listOf(15,3,5)
    var cnt = 0

    (1..n).forEach {
        if (it % x == 0 || it % y == 0) cnt++
    }

    println(cnt)
}