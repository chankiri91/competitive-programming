fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
//    val (n, m) = listOf(2,4)
//    val list = listOf("xxxx", "oxox")
    val list = List(n) {
        readLine()!!
    }
    var sum = 0
    var flag = 0

    for (i in 0 until n) {
        for (j in 1 until n) {
            for (k in 0 until m) {
                if (k == 0) flag = 0
                if (i+j >= n) break
                if (list[i][k] == 'o' || list[i+j][k] == 'o') flag++
                if (flag == m) sum++
            }
        }
    }
    println(sum)
}