package algo_math

import kotlin.math.max

fun main() {
    var (a,b) = readLine()!!.split(" ").map { it.toLong() }
    while (a != 0L && b != 0L) {
        if (a > b) {
            a %= b
        } else if (b > a) {
            b %= a
        }
    }
    println(max(a,b))
}