package bezerra.roberto.collections

fun main() {

    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it)
    }

    println("\n")

    values.sort()

    values.forEach {
        println(it)
    }

}