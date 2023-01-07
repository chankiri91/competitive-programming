package algo_math

import kotlin.math.*

fun main() {
    val (a, b, h, m) = readLine()!!.split(" ").map { it.toInt() }

    val angleH = 30.0 * h + 0.5 * m
    val angleM = 6.0 * m
    val hx = a * cos(angleH * PI / 180.0)
    val hy = a * sin(angleH * PI / 180.0)
    val mx = b * cos(angleM * PI / 180.0)
    val my = b * sin(angleM * PI / 180.0)

    val d = sqrt((hx-mx).pow(2) + (hy-my).pow(2))

    println(d)
}