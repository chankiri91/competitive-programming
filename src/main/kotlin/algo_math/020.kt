package algo_math

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0

    for (i in 0 until n) {
        for (j in i+1 until n) {
            for (k in j+1 until n) {
                for (l in k+1 until n) {
                    for (m in l+1 until n) {
                        if (a[i]+a[j]+a[k]+a[l]+a[m] == 1000) ans++
                    }
                }
            }
        }
    }
    println(ans)
}