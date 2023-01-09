package algo_math

fun main() {
    val N = readLine()!!.toLong()

    when (N%4) {
        1L -> println(2)
        2L -> println(4)
        3L -> println(8)
        0L -> println(6)
    }
}