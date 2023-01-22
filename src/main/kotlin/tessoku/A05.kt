package tessoku

fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0

    for (x in 1..n) {
        for (y in 1..n) {
            var z = k - x - y
            if (z >= 1 && z <= n) ans++
        }
    }

    println(ans)
}