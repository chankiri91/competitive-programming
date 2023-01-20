package tessoku

fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }

    if (a.any { it == x }) println("Yes") else println("No")
}