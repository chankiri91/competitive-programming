package generics

fun main() {
    val n = readLine()!!.toInt()
    for (i in 1 .. 9) {
        for (j in 1 .. 9) {
            if (i * j == n) {
                println("Yes")
                return
            }
        }
    }
    println("No")
}