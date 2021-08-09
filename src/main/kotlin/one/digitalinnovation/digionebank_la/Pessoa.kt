package one.digitalinnovation.digionebank_la

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.456.789-01"

    override fun toString(): String {
        return "${this.nome}, ${this.cpf}"
    }
}

fun main() {
    val jether = Pessoa()
    println(jether)
}