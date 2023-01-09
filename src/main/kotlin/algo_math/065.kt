package algo_math

fun main() {
    val (H, W) = readLine()!!.split(" ").map { it.toLong() }

    if (H == 1L || W == 1L) println(1)
    else if (H * W % 2 == 1L) println(H * W / 2 + 1)
    else println(H * W / 2)
}