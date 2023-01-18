package algo_math

fun main() {
    val (N, W) = readLine()!!.split(" ").map { it.toInt() }
    val dp = LongArray(W + 1)
    repeat(N) {
        val (wi, vi) = readLine()!!.split(" ").map { it.toInt() }
        for (i in W - wi downTo 0) {
            if (dp[i + wi] < dp[i] + vi) dp[i + wi] = dp[i] + vi
        }
    }
    println(dp[W])
}