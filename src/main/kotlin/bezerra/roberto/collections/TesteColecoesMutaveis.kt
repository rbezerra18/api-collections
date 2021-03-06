package bezerra.roberto.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")
//criação de lista mutável
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("\n")
//adição de objeto na lista mutável
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("\n")
//remoção de objeto na lista mutável
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("\n")
//criação de conjunto mutável
    val funcionarioSet = mutableSetOf(joao)
//adição de objetos no conjunto mutável
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("\n")
//adição de objetos no conjunto mutável
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }

}