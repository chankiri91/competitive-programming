package algo_math

import kotlin.math.abs
import kotlin.math.min

fun main() {
    val N = readLine()!!.toInt()
    val H = readLine()!!.split(" ").map { it.toInt() }
    val dp = IntArray(N)

    for (i in 0 until N) {
        if (i == 0) dp[i] = 0
        if (i == 1) dp[i] = abs(H[i - 1] - H[i])
        if (i >= 2) {
            val v1 = dp[i - 1] + abs(H[i - 1] - H[i])
            val v2 = dp[i - 2] + abs(H[i - 2] - H[i])
            dp[i] = min(v1, v2)
        }
    }
    println(dp[N - 1])
}