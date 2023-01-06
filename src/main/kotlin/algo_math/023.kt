package algo_math

fun main() {
    val n = readLine()!!.toLong()
    val B = readLine()!!.split(" ").map { it.toInt() }.sum()
    val R = readLine()!!.split(" ").map { it.toInt() }.sum()

    println(B.toDouble()/n + R.toDouble()/n)
}