package algo_math

fun main() {
    val N = readLine()!!.toInt()
    val dp = IntArray(N+1)

    for (i in 0..N) {
        if (i <= 1) dp[i] = 1
        else dp[i] = dp[i - 1] + dp[i - 2]
    }
    println(dp[N])
}