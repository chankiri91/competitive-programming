package tessoku

fun main() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val s = LongArray(n+1)

    s[0] = 0
    for (i in 1 .. n) {
        s[i] = s[i-1] + a[i-1]
    }

    repeat(q) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        println("${s[r]-s[l-1]}")
    }
}