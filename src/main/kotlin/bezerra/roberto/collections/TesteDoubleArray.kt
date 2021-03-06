package bezerra.roberto.collections

fun main() {
//criação de Vetor de Double
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    println("\n")
//incremento de 10% sobre cada valor do vetor
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    salarios.sort()

    salarios.forEach { println(it) }

    println("\n")

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)

    salarios2.sort()

    salarios2.forEach { println(it) }

}