package ABC283

fun main() {
    val n = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    val q = readLine()!!.toInt()
    val queries = List(q) {
        readLine()!!.split(" ").map { it.toLong() }
    }

    for (i in 0 until q) {
        if (queries[i][0] == 1L) {
            A[queries[i][1].toInt()-1] = queries[i][2]
        } else if (queries[i][0] == 2L) {
            println(A[queries[i][1].toInt()-1])
        }
    }
}