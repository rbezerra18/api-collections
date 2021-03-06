package bezerra.roberto.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)
//iterar sobre objeto Pair (chave + valor)
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("\n")
//criar objeto mapOf
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}