fun main() {
    val value = count()
    value()
    value()
}

// 親関数
//fun count():() -> Unit {
//    var counter = 0
//
//    // 小関数
//    return {
//        counter++
//        println(counter)
//    }
//}