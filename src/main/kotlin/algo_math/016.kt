package algo_math

fun main() {
    val n = readLine()!!.toInt()
    var list = readLine()!!.split(" ").map { it.toLong() }
    var result = 0L

    list.reduce {acc, value ->
        result = acc / gcd(acc, value) * value
        result
    }

    print(result)
}

fun gcd(a: Long, b: Long): Long {
    var x = a
    var y = b
    while (x >= 1 && y >= 1) {
        if (x > y) x %= y else y %= x
    }
    return if (x > y) x else y
}