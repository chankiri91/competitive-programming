package algo_math

fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toLong() }
    val A = readLine()!!.split(" ").map { it.toLong() }
    var First = MutableList(K.toInt()) {-1}
    var Second = MutableList(K.toInt()) {-1}
    var cnt = 0
    // cur は現在いる街の番号
    var cur = 1

    while (true) {
        // First, Secondの更新
        if (First[cur] == -1) First[cur] = cnt
        else if (Second[cur] == -1) Second[cur] = cnt

        // K回の移動後に街 cur にいるかの判定
        if (cnt == K.toInt()) {
            println(cur)
            return
        } else if (Second[cur] != -1 && (K-First[cur]) % (Second[cur]-First[cur]) == 0L) {
            println(cur)
            return
        }

        // 位置の更新
        cur = A[cur-1].toInt()
        cnt++
    }
}
// とけへん