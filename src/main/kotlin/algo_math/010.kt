package algo_math

fun main() {
    val n = readLine()!!.toInt()
    var result = 1L

    (1..n).forEach {
        result *= it
    }

    println(result)
}