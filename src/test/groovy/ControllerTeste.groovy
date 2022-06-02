import Model.Apartamento
import Model.Casa
import Model.Terreno
import org.jeasy.random.EasyRandom
import spock.lang.Specification

class ControllerTest extends Specification {
    private controller =  Controller.INSTANCE
    def easyRandom = new EasyRandom()

    def "Deve cadastrar apartamento na lista"(){
        given:
        def apartamento = easyRandom.nextObject(Apartamento)
        controller.cadastraImovel(apartamento)
        when:
        def lista = Controller.INSTANCE.imoveis
        then:
        lista.size() == 1
    }

    def "Deve cadastrar a casa na lista"(){
        given:
        def casa = easyRandom.nextObject(Casa)
        Controller.cadastraImovel(casa)
        when:
        def lista = Controller.INSTANCE.imoveis
        then:
        lista.size() == 2
    }

    def "Deve cadastrar terreno na lista"(){
        given:
        def terreno = easyRandom.nextObject(Terreno)
        Controller.cadastraImovel(terreno)
        when:
        def lista = Controller.INSTANCE.imoveis
        then:
        lista.size() == 3
    }

    def "Nao deve cadastrar dois imoveis no mesmo endereco"(){
        given:
        def apartamento = easyRandom.nextObject(Apartamento)
        controller.cadastraApartamento(apartamento.nome,apartamento.contato,apartamento.area,
                apartamento.quartos,apartamento.vagaGaragem,apartamento.tipoNegocio,apartamento.valor,endereco)

        when:
        def lista = controller.getImoveis()


        then:
        lista.size() == 3

    }


}
