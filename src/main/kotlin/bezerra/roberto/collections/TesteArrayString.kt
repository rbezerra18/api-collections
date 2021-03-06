package bezerra.roberto.collections

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Maria"
    nomes[1] = "Pedro"
    nomes[2] = "João"

    for(nome in nomes){
        println(nome)
    }

    println("\n")

    nomes.sort()

    nomes.forEach { println(it) }

    println("\n")

    val nomes2 = arrayOf("Maria", "Pedro", "João")

    nomes2.sort()

    nomes2.forEach { println(it) }

}