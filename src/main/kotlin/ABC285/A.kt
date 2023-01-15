package ABC285

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    if (b == a*2 || b == a*2+1) println("Yes") else println("No")
}