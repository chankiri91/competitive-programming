package algo_math

fun main() {
    // 入力
    val (N, M) = readLine()!!.split(" ").map { it.toInt() }
    val G = List(N) { mutableListOf<Int>() } // G[i]は頂点iに連結する頂点のリスト

    // 連結リストの作成
    for (i in 0 until M) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        G[a].add(b)
        G[b].add(a)
    }

    // 深さ優先探索
    val visited = MutableList(N) { false }
    val toGo = listOf<Int>()
    visited[0] = true

}