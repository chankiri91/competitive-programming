package ABC284

fun main() {
    val n = readLine()!!.toInt()
    val list = List(n) {
        readLine()!!
    }
    println(list.reversed().joinToString(separator = "\n"))
}