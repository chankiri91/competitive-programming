package algo_math

fun main() {
    val (n, s) = readLine()!!.split(" ").map { it.toInt() }
    var cnt = 0

    for (i in 1..n) {
        for (j in 1 .. n) {
            if (i+j <= s) cnt++
        }
    }

    println(cnt)
}