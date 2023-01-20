package tessoku

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    for (i in 0 until n) {
        for (j in i+1 until n) {
            for (k in j+1 until n) {
                if (a[i] + a[j] + a[k] == 1000) {
                    println("Yes")
                    return
                }
            }
        }
    }
    println("No")
}