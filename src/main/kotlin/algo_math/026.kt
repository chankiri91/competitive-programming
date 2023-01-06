package algo_math

fun main() {
    val n = readLine()!!.toLong()
    var ans = 0.0

    for (i in n downTo 1) {
        ans += 1.0 * n / i
    }

    println(ans)
}