package tessoku

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val q = readLine()!!.toInt()
    val win = LongArray(n+1)

    win[0] = 0
    for (i in 1..n) {
        win[i] = win[i-1] + a[i-1]
    }

    repeat(q) {
        val (l, r) = readLine()!!.split(" ").map { it.toInt() }
        val res = win[r] - win[l-1]
        val lose = r - l + 1 - res
        if (res > lose) println("win")
        else if (res < lose) println("lose")
        else println("draw")
    }
}