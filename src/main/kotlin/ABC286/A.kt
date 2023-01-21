package ABC286

fun main() {
    val (n, p, q, r, s) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    val pq = A.subList(p-1, q)
    val pq2 = pq.toList()
    val rs = A.subList(r-1, s)

    var j = 0

    for (i in p-1 until q) {
        A[i] = rs[j]
        j++
    }

    j = 0

    for (i in r-1 until s) {
        A[i] = pq2[j]
        j++
    }

    println(A.joinToString(separator = " "))
}