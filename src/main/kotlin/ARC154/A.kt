package ARC154

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.toMutableList()
    val b = readLine()!!.toMutableList()

    for (i in 0 until n) {
        if (a[i] > b[i]) {
            var tmp = a[i]
            a[i] = b[i]
            b[i] = tmp
        }
    }

    println(a.joinToString("").toBigInteger() * b.joinToString("").toBigInteger() % (998244353).toBigInteger())
}