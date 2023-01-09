package algo_math

fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val A = readLine()!!.split(" ").map { it.toInt() }

    if ((A.sum() % 2) != (K % 2)) println("No")
    else if (A.sum() > K) println("No")
    else println("Yes")
}