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

    println("\n")

    println(salarios.count{it in 2000.0..5000.0})

    println("\n")

    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println("\n")

    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})

}