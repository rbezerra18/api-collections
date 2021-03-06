package bezerra.roberto.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String)
{
    override fun toString(): String =
        """
        Nome: $nome           Salário: $salario         Tipo Contratação: $tipoContratacao
        """.trimIndent()
}