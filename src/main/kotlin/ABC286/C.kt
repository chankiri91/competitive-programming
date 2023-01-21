package ABC286

fun main() {
    val (n, a, b) = readLine()!!.split(" ").map { it.toLong() }
    val s = readLine()!!
    var acnt = 0
    var bcnt = 0

    val s1 = s.substring(0 until (n/2).toInt()).toMutableList()
    val s2 = s.substring((n/2).toInt() until n.toInt()).toMutableList()

    println(s1)
    println(s2)

    for (i in 0 until (n/2).toInt()) {
        if (!s1.any { it == s2[(n/2).toInt()-i] }) {
            s2[(n/2).toInt()-i] = s1[i]
            bcnt++
        }
    }
    println(s1)
    println(s2)

    for (i in 0 until (n/2).toInt()) {
        if (s1[i] != s2[(n/2).toInt()-1-i]) {
            acnt++
        }
    }

    println(acnt*a + bcnt*b)
}