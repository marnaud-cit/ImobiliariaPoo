import Model.*

object Controller{
    private val listaImoveis: MutableList<Imovel> = arrayListOf()

    @JvmStatic
    fun criaEndereco(rua:String,cep:String,referecia:String): Endereco {
        return Endereco(rua,cep,referecia)
    }
    @JvmStatic
    fun cadastraApartamento(nome:String,contato:String,
                            area:Double, quartos:Int,
                            vagaGaragem:Int, tipoNegocio:Int,valor:Double,
                            endereco: Endereco
    ){

        adicionaImovel(Apartamento(nome,contato,endereco,area,quartos,vagaGaragem,tipoNegocio,valor))
    }
    @JvmStatic
    fun cadastraCasa(nome: String, contato: String,
                     endereco: Endereco, areaConstruida:Double,
                     areaTotal:Double, quartos: Int, tipoNegocio: Int){
        adicionaImovel(Casa(nome,contato,endereco, areaConstruida,areaTotal,quartos,tipoNegocio ))
    }

    @JvmStatic
    fun cadastraTerreno(nome:String, contato: String, endereco: Endereco,
                        areaTotal: Double, tipoNegocio: Int, valor: Double){
        adicionaImovel(Terreno(nome, contato, endereco, areaTotal, tipoNegocio, valor))
    }

    @JvmStatic
    fun filtraApartamento():List<Imovel>{
        return listaImoveis.filterIsInstance<Apartamento>()
    }

    @JvmStatic
    fun filtraCasa(): List<Imovel> {
        return listaImoveis.filterIsInstance<Casa>()
    }


    @JvmStatic
    fun filtraTerreno():List<Imovel>{
        return listaImoveis.filterIsInstance<Terreno>()
    }
    @JvmStatic
    fun filtraNome(nome: String){
        val listaFiltrada = listaImoveis.filter {  it.nome == nome}
    }

    @JvmStatic
    private fun adicionaImovel(imovel: Imovel){
        listaImoveis.add(imovel)
    }
    fun getImoveis():List<Imovel>{
        return listaImoveis
    }
    fun view(){
        println("Testando $listaImoveis")
    }
}