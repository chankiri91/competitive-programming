package tessoku

fun main() {
    val n = readLine()!!.chunked(1).map { it.toInt() }
    var res = 0

    for (i in n.size-1 downTo 0) {
        var kake = 1 shl n.size-1-i
        res += kake * n[i]
    }
    println(res)
}