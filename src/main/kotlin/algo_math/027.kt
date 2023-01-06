package algo_math

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }

    MergeSort(1, n + 1)
    println(a.joinToString(separator = " "))
}

fun MergeSort(l: Int, r:Int) {
    // r-l = 1 の場合、すでにソートされていrので何もしない
    if (r - l == 1) return

    // 2つに分割した後、小さい配列をソート
    var m = (l+r) / 2
    MergeSort(l, m)
    MergeSort(m, r)

    // この時点で以下の2つの配列がソートされている
    // 列A' に相当するもの [A[l], A[l+1], ..., A[m-1]]
    // 列B' に相当するもの [A[m], A[m+1], ..., A[r-1]]
    var c1 = l
    var c2 = m
    var cnt = 0

    while (c1 != m || c2 != r) {
        if (c1 != m) {
            // 列A' が空の場合

        }
    }
}