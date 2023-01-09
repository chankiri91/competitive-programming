package ABC284

import kotlin.math.sqrt

fun main() {
    val T = readLine()!!.toInt()
    val N = List(T) {
        readLine()!!.toLong()
    }
    for (i in 0 until T) {
        for (j in 1..sqrt(N[i].toDouble()).toInt()) {
            if (N[i] % j == 0L && j != 1) {
                println("$j ${N[i]/j}")
                break
            }
        }
    }
}