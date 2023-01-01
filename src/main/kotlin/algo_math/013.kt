package algo_math

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toLong()

    for (i in 1 .. sqrt(n.toDouble()).toInt()) {
        if (n % i == 0L) {
            println(i)
            println(n/i)
        }
    }
}