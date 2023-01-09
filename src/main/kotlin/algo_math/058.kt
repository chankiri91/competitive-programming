package algo_math

import kotlin.math.abs

fun main() {
    val (N, X, Y) = readLine()!!.split(" ").map { it.toLong() }

    if ((abs(X) + abs(Y)) <= N && (N % 2) == ((abs(X) + abs(Y)) % 2)) println("Yes") else println("No")
}