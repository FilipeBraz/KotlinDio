package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
    senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario, senha = senha) {
    override fun calculoAuxilio(): Double = salario * 0.4
}