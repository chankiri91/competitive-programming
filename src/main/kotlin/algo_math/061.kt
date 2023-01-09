package algo_math

import kotlin.math.pow

fun main() {
    val N = readLine()!!.toLong()

    for (i in 1 .. 60) {
        if (N == (1L.shl(i) - 1)) {
            println("Second")
            return
        }
    }
    println("First")
}