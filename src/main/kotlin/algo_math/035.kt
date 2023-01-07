package algo_math

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val (x1, y1, r1) = readLine()!!.split(" ").map { it.toLong() }
    val (x2, y2, r2) = readLine()!!.split(" ").map { it.toLong() }
    val d = sqrt(((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)).toDouble())
    val l = r1+r2.toDouble()
    val tinyl = abs(r1-r2).toDouble()

    if (d > l) {
        println(5)
    } else if (d == l) {
        println(4)
    } else if (d == tinyl) {
        println(2)
    } else if (d < tinyl) {
        println(1)
    } else {
        println(3)
    }
}