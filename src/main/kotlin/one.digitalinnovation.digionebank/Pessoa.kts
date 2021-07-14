class Pessoa {
    var nome: String = "Brazz"
    var cpf: String = "987.456.897-00"
    private set
    
    constructor()

    fun pessoaInfo() = "$nome + $cpf"
}

fun main(){
    val filipe = Pessoa()
    println(filipe.pessoaInfo())
}