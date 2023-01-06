package algo_math

fun main() {
    val n = readLine()!!.toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }.sum() / n.toDouble()
    val b = readLine()!!.split(" ").map { it.toLong() }.sum() / n.toDouble()

    println((a/3.0 + b/3.0*2.0)*n)
}