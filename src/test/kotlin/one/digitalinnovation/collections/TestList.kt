package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario(nome = "Joao", salario = 2000.0, tipoContracao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContracao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContracao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach{ println(it)}

    println("-----------------------------------")
    println(funcionarios.find{it.nome == "Maria"})

    println("-----------------------------------")
    funcionarios
        .groupBy { it.tipoContracao }
        .forEach{ println(it)}


}

