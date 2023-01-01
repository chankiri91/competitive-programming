package algo_math

fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toLong() }

    list.reduce { acc, value ->
        val result = gcv(acc, value)
        result
    }


}

fun gcv(a: Long, b: Long): Long {
    var x = a
    var y = b
    while (x >= 1 && y >= 1) {
        if (x > y) x %= y else y %= x
    }
    return if (x >= 1) x else y
}