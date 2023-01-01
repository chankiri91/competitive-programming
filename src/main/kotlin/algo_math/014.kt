package algo_math

import kotlin.math.sqrt

fun main() {
    var n = readLine()!!.toLong()
    val list = mutableListOf<Long>()

    for (i in 2 until sqrt(n.toDouble()).toLong()) {
        while (n % i == 0L) {
            list.add(i)
            n /= i
        }
    }

    if (n > 2) list.add(n)
    println(list.joinToString(separator = " "))
}