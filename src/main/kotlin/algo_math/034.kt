package algo_math

import kotlin.math.sqrt


fun main() {
    val n = readLine()!!.toInt()
    val list = List(n) {
        readLine()!!.split(" ").map { it.toLong() }
    }
    var min = 100000.0
    var distance = 0.0
    var x: Long
    var y: Long

    for (i in 0 until n) {
        for (j in i+1 until n) {
            x = list[j][0] - list[i][0]
            y = list[j][1] - list[i][1]

            distance = sqrt((x*x + y*y).toDouble())
            if (min > distance) min = distance
        }
    }
    println("%.12f".format(min))
}