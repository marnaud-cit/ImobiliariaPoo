class ViewCadastro {
    var endereco = Controller.criaEndereco("teste", "8036695", "")

    fun welcome(){
        println("Bem vindo a imobiliaria,deseja cadastrar algo?")
        println("Digite 1 se sim ou 2 se não")
        while (true){
            when (readLine()) {
                "1" -> {
                    apartmentView()
                    println("testando cadastro")
                    Controller.view()
                }
                "2" -> {
                    houseView()
                    Controller.view()
                    println("Um prazer lhe ter por aqui ")
                }
                "3" -> {
                    terrenoView()
                    Controller.view()
                    println("Um prazer lhe ter por aqui ")
                }
            }
        }

    }
    fun apartmentView(){
        println("cadastre as informações do apartamento")
        Controller.cadastraApartamento("Model.Apartamento","999343672",221.14,
            3,1,2,112.12,endereco)
    }

    fun houseView(){
        println("cadastrando casa")
        Controller.cadastraCasa("casa","839994223",endereco,
            222.1,333.5,3,2)
    }

    fun terrenoView(){
        println("cadastrando terreno")
        Controller.cadastraTerreno("terreno", "8333333",endereco,223.6,1,2224.4)
    }
}
