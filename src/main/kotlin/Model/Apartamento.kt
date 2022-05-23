
package Model

class Apartamento(
    nome:String,
    contato:String,
    endereco: Endereco,
    var area: Double,
    var quartos:Int,
    var vagaGaragem:Int,
    var tipoNegocio:Int,
    var valor:Double,

    ): Imovel(
    nome = nome,
    contato = contato,
    endereco = endereco
) {
}