import spock.lang.Specification

class ControllerTest extends Specification {
    def "Deve cadastrar a casa na lista"(){
        given:
        def endereco = Controller.criaEndereco("teste", "8036695", "")
        when:
        Controller.cadastraCasa("casa","839994223",endereco,
                222.1,333.5,3,2)
        def lista = Controller.INSTANCE.imoveis
        then:
        lista.size() == 1
    }
}
