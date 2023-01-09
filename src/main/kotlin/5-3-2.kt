import kotlin.math.pow

fun main() {
    var sum = 0
    var j = 1

    for (i in 1..10) {
        sum = (5.0.pow(i) * j).toInt()
        if (i % 2 == 0) j++
    }
    println(sum)
}