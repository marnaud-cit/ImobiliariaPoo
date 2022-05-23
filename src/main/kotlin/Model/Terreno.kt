package Model

class Terreno(
    nome:String,
    contato:String,
    endereco: Endereco,
    var areaTotal:Double,
    var tipoNegocio:Int,
    var valor:Double,
): Imovel(
    nome = nome,
    contato = contato,
    endereco = endereco
) {
}