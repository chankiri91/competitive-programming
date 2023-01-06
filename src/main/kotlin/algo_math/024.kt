package algo_math

fun main() {
    val n = readLine()!!.toInt()
    var expected = 0.0
    (0 until n).forEach {
        val (p, q) = readLine()!!.split(" ").map { it.toDouble() }
        expected += q / p
    }
    println(expected)
}