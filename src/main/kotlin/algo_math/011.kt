package algo_math

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    var flag = true

    for (i in 2 .. n) {
        for (j in 2 .. sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) flag = false
        }
        if (flag == true) list.add(i)
        flag = true
    }

    println(list.joinToString(separator = " "))
}