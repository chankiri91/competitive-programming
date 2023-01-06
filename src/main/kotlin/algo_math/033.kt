package algo_math

import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
     val (ax, ay) = readLine()!!.split(" ").mapNotNull { it.toLongOrNull() }
     val (bx, by) = readLine()!!.split(" ").mapNotNull { it.toLongOrNull() }
     val (cx, cy) = readLine()!!.split(" ").mapNotNull { it.toLongOrNull() }

    val BAx = ax - bx
    val BAy = ay - by
    val BCx = cx - bx
    val BCy = cy - by
    val CAx = ax - cx
    val CAy = ay - cy
    val CBx = bx - cx
    val CBy = by - cy

    var pattern = 2
    if (BAx*BCx+BAy*BCy < 0L) pattern = 1
    if (CAx*CBx+CAy+CBy < 0L) pattern = 3

    var answer = 0.0
    if (pattern == 1) answer = sqrt((BAx * BAx + BAy * BAy).toDouble())
    if (pattern == 3) answer = sqrt((CAx * CAx + CAy * CAy).toDouble())
    if (pattern == 2) {
        val S = abs(BAx * CAy - BAy * CAx)
        val BCLength = sqrt((BCx * BCx + BCy * BCy).toDouble())
        answer = S / BCLength
    }

    println("%.12f".format(answer))
}