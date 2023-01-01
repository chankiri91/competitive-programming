package ABC283

fun main() {
    val s = readLine()!!
    var list = mutableListOf<String>()
    var c = 0

    for (i in 0 .. s.length) {
        if (s[i] == '(') continue
        if (s[i] in CharRange('a', 'z')) {
            if (list.filter {it == s[i].toString()} != null) {
                println("No")
                return
            } else {
                list.add(s[i].toString())
                continue
            }
        }
        if (s[i] == ')') {
            for (j in i downTo 0) {
                if (s[j] in CharRange('a', 'z')) {
                    list.remove(s[j].toString())
                }
                if (s[j] == '(') {
                    continue
                }
            }
        }
    }
}