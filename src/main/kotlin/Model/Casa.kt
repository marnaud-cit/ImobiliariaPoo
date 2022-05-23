package Model

class Casa(
    nome:String,
    contato:String,
    endereco: Endereco,
    var areaConstruida:Double,
    var areaTotal:Double,
    var quartos:Int,
    var tipoNegocio:Int,
): Imovel(
    nome = nome,
    contato = contato,
    endereco = endereco
) {
}