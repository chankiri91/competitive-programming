package ABS

fun main() {
    val N = readLine()!!.toInt()
    var A = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    var cnt = 0L

    for (i in 0 until N) {
        if (A[i]%2==1L) break
        A[i] /= 2L
        if (i==N-1) cnt++
    }
    println(cnt)
}