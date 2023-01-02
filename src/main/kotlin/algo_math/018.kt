package algo_math

fun main() {
    val n = readLine()!!.toLong()
    val a = readLine()!!.split(" ").map { it.toLong() }

    val one = a.count { it == 100L }.toLong()
    val two = a.count { it == 200L }.toLong()
    val three = a.count { it == 300L }.toLong()
    val four = a.count { it == 400L }.toLong()

    println(one*four+two*three)
}