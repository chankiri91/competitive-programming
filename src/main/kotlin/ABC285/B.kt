package ABC285

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var l = 1

    repeat(n-1) {
        var i = 0
        var cnt = 0
        while (true) {
            if (s[i] != s[i+l]) cnt++
            if (s[i] == s[i+l]) {
                l++
                println(cnt)
                break
            }
            i++
            if (l > n - i) break
            if (i+l == n) {
                l++
                println(cnt)
                break
            }
        }
    }
}