package bezerra.roberto.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")
//criar objeto do tipo Repositório
    val repositorio = Repositorio<Funcionario>()
//popular mapa
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)
//encontrar objeto no mapa
    println(repositorio.findById(maria.nome))

    println("\n")
//imprimir o mapa completo
    repositorio.findAll().forEach { println(it) }

    println("\n")
//remover objeto no mapa
    repositorio.remove(maria.nome)

    repositorio.findAll().forEach { println(it) }

}