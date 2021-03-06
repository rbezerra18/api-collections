package bezerra.roberto.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach { println(it) }

    println("\n")
//encontrar Maria
    println(funcionarios.find{it.nome == "Maria"})

    println("\n")
//ordenar por salário
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("\n")
//ordenar por nome
    funcionarios
        .sortedBy { it.nome }
        .forEach { println(it) }

    println("\n")
//ordenar por tipocontratacao
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String)
{
    override fun toString(): String =
        """
        Nome: $nome           Salário: $salario                       
        """.trimIndent()
}