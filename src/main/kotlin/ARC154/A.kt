package ARC154

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.toMutableList()
    val b = readLine()!!.toMutableList()

    for (i in 0 until n) {
        if (a[i] > b[i]) {
            var tmp = a[i]
            a[i] = b[i]
            b[i] = tmp
        }
    }
    val modIntA = ModInt(a.joinToString("").toLong())
    val modIntB = ModInt(b.joinToString("").toLong())


    println(ModInt((modIntA * modIntB).value).value)
}

class ModInt(value: Long) {

    val mod = 998244353L

    val value = ((value % mod) + mod) % mod

    operator fun times(other: ModInt): ModInt = ModInt(((value * other.value) % mod + mod) % mod)
}