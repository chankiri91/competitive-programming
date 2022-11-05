fun main() {
    val value1 = count()
    val value2 = count()

    println("value1: "+ value1())
    println("value1: "+ value1())
    println("value2: "+ value2())
    println("value2: "+ value2())
    println("value1: "+ value1())

}

fun count():() -> Int {
    var counter = 1

    return {
        counter++
    }
}