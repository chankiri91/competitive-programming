package algo_math

fun main() {
    val (n, r) = readLine()!!.split(" ").map { it.toLong() }
    var npr = n

    for (i in 1 until  r) {
        npr *= n-i
    }
    val d = fact(r)
    println(npr/d)
}

fun fact(r: Long): Long {
    return if (r != 1L) {
        r * fact(r - 1)
    } else {
        1
    }
}