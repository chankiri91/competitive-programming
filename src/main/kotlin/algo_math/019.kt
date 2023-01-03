package algo_math

fun main() {
    val n = readLine()!!.toLong()
    val a = readLine()!!.split(" ").map { it.toInt() }

    val red = a.count { it == 1 }.toLong()
    val yellow = a.count { it == 2 }.toLong()
    val blue = a.count { it == 3 }.toLong()

    println(red*(red-1)/2 + yellow*(yellow-1)/2 + blue*(blue-1)/2)
}