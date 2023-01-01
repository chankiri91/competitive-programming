package algo_math

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toLong()

    for (i in 2 .. sqrt(n.toDouble()).toInt()) {
        if (n % i == 0L) {
            println("No")
            return
        }
    }
    println("Yes")
}