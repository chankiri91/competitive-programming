fun main() {
    val n = readLine()!!.toInt()
//    val n = 20
    var s = readLine()!!
//    var s = "a,\"t,\"c,\"o,\"d,\"e,\"r,"
    var ch = s.toCharArray()
    var flag = false

    for (i in 0 until  n) {
        if (flag == false && ch[i] == '"') {
            flag = true
            continue
        }
        if (flag == true && ch[i] == '"') {
            flag = false
            continue
        }
        if (flag == false && ch[i] == ',') {
            ch[i] = '.'
        }
    }
    s = String(ch)
    println(s)
}