package ARC153

fun main() {
    var n = readLine()!!.toInt()
    var list = mutableListOf<Int>()
    culc(n, list)
}

fun culc(n: Int, list: MutableList<Int>): Int {
    var k = n % 10
    var tmp = n
    if (k == 0) {
        list.add(9)
    } else {
        list.add(k-1)
    }
    tmp /= 10
    if (tmp / 10 == 0) println(list.reversed().joinToString(""))
    culc(tmp, list)
    return tmp
}