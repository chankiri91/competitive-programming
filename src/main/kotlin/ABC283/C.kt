package ABC283

fun main() {
    val s = readLine()!!.reversed()
    var total = 0
    var i = 0

    while (true) {
        if (s[i] == '0' && s[i+1] == '0') {
            total++
            i += 2
            continue
        }
        when(s[i]) {
            '1','2','3','4','5','6','7','8', '9', '0' -> {
                total++
                i++
            }
        }
        if (i >= s.length) break
    }
    println(total)
}