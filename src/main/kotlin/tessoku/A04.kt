package tessoku

fun main() {
    val n = readLine()!!.toInt()

    println("%010d".format(Integer.toBinaryString(n).toInt()))
}