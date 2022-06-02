import Model.*


object Controller{
    private val listaImoveis: MutableList<Imovel> = arrayListOf()

    @JvmStatic
    fun criaEndereco(rua:String,cep:String,referecia:String): Endereco {
        return Endereco(rua,cep,referecia)
    }
    @JvmStatic
    fun cadastraImovel(imovel: Imovel){
        if(verificaEndereco(listaImoveis,imovel.endereco)){
            adicionaImovel(imovel)
        }else{
            println("Cadastro não efetuado pois enndereço ja foi cadastrado")
        }

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

    fun verificaEndereco(listaImovel: List<Imovel>,endereco: Endereco): Boolean{
        val imovel = listaImovel.find { imovel -> imovel.endereco == endereco   }

        if (imovel != null) {
            return false
        }
        println("estoy aca $imovel")
        return true
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