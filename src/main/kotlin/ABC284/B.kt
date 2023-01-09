package ABC284

import kotlin.reflect.typeOf

fun main() {
    val T = readLine()!!.toInt()
    var test = List(2*T) {
        readLine()!!.split(" ").toList()
    }

    for (i in 1 until 2*T step 2) {
        var intTest = test[i].map { it.toLong() }
        var cnt = intTest.count { it % 2 == 1L}
        println(cnt)
    }
}