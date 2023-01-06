package algo_math

fun main() {
    readLine()
    val array = LongArray(100000)
    readLine()!!.split(" ").forEach { array[it.toInt()]++ }

    var count = 0L
    for (i in 1 until 50000) {
        count += array[i] * array[100000 - i]
    }

    count += array[50000] * (array[50000] - 1) / 2L

    println(count)
}