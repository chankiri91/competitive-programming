package tessoku

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    for (i in a..b) {
        if (100 % i == 0) {
            println("Yes")
            return
        }
    }
    println("No")
}