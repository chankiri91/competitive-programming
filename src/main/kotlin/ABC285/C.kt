package ABC285

import kotlin.math.pow

fun main() {
    val s = readLine()!!.reversed()
    var cnt = 0L
    // アルファベットは全部で26個
    val alpha = mapOf('A' to 1, 'B' to 2,'C' to 3,'D' to 4,'E' to 5,'F' to 6,'G' to 7,'H' to 8,'I' to 9,'J' to 10,'K' to 11,'L' to 12,'M' to 13,'N' to 14,'O' to 15,'P' to 16,'Q' to 17,'R' to 18,'S' to 19,'T' to 20,'U' to 21,'V' to 22,'W' to 23,'X' to 24,'Y' to 25,'Z' to 26)

    for (i in s.indices) {
        if (i == 0) {
            cnt += alpha[s[0]]!!
        } else {
            cnt += alpha[s[i]]!! * 26.0.pow(i).toLong()
        }
    }

    println(cnt)
}