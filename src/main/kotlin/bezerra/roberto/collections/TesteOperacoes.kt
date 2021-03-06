package bezerra.roberto.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("\n")

    println("Maior salário: ${salarios.max()}")
    println("Menor salário: ${salarios.min()}")
    println("Média salarial: ${salarios.average()}")

    println("\n")

    val salarioMaior2500 = salarios.filter { it > 2500.0 }

    salarioMaior2500.forEach { println(it) }

}