package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomeBusca;
import support.BaseSteps;

public class HomeBuscaSteps extends BaseSteps {
    
    private static HomeBusca homeBusca = new HomeBusca(driver);
    
    @Dado("retiro a seleção Comprar na Planta")
    public void retiroASeleçãoComprarNaPlanta() {
        homeBusca.checkComprarPlanta();
    }

    @Dado("que estou na página de resultado de busca por aluguel")
    public void clicarEAlugar() {
        homeBusca.clicarAluguel();
    }

    @Dado("que estou na página de resultado de busca por lançamento")
    public void clicarEmLancamento() {
        homeBusca.clicarLancamento();
    }
    @Dado("que estou na página de resultado de busca por prontos")
    public void clicarEmProntos() {
        homeBusca.clicarProntos();
    }

    @Quando("clico no botão Buscar")
    public void clicoNoBotãoBuscar() throws InterruptedException {
        homeBusca.clicarBuscar();
    }

    @Então("vejo os Resultados de Busca com a url {string}")
    public void vejoOsResultadosDeBuscaFiltradosComAUrl(String value) throws InterruptedException {
        homeBusca.aguardarResultados();
        homeBusca.validarResultados(value);
    }

    @Quando("insiro {string} no campo de busca")
    public void insiroNoCampoDeBusca(String value) {
        homeBusca.inserirBusca(value);
    }

    @E("seleciono a opção {string}")
    public void selecionoAOpção(String value) {
        homeBusca.selecionarBusca(value);
    }

    @E("clico em Alugar")
    public void clicoEmAlugar() {
        homeBusca.clicarAlugar();
    }

    @E("retiro a seleção Comprar Pronto")
    public void retiroASeleçãoComprarPronto() {
        homeBusca.checkComprarPronto();
    }
    @E("que estou no resultado de busca por compra")
    public void ComprarPronto() {
        homeBusca.clicarComprarPronto();
    }

    @Quando("seleciono o checkbox Buscar pelo código do imóvel")
    public void selecionoOCheckboxBuscarPeloCódigoDoImóvel() {
        homeBusca.clicarCodigo();
    }

    @Então("vejo a mensagem de busca inválida {string}")
    public void vejoAMensagemDeBuscaInválida(String value) {
        homeBusca.msgEnderecoInvalido(value);
    }

    @Quando("vejo o autocomplete com as sugestões de busca")
    public void vejoOAutocompleteComAsSugestõesDeBusca() {
        homeBusca.verificarCaixaBusca();
    }
}
