import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val iterable: Iterable<*> = listOf(1, "foo", 2.4, false)
    println(iterable.filterIsInstance<Number>())
    println(iterable.filterIsInstance(String::class.java))
}