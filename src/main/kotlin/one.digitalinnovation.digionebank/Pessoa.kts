class Pessoa {
    var nome: String = "Brazz"
    var cpf: String = "987.456.897-00"
    private set
}

fun main(){
    val filipe = Pessoa()
    println(filipe.nome)
    println(filipe.cpf)
}