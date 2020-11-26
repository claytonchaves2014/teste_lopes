package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.HomeFooter;
import pages.ResultadoBusca;
import support.BaseSteps;

public class ResultadosBuscaSteps extends BaseSteps {

    private static ResultadoBusca resultadosBusca = new ResultadoBusca(driver);
    private static HomeFooter homeFooter = new HomeFooter(driver);

    @Então("vejo a mensagem {string} de resultados não encontrados")
    public void vejoAMensagemDeResultadosNãoEncontrados(String value) {
        resultadosBusca.verificarSemResultado(value);
    }

    @Então("vejo a quantidade de imóveis encontrados")
    public void vejoAQuantidadeDeImóveisEncontrados() {
        resultadosBusca.verificarQntd();
    }

    @E("vejo os resultados na grid")
    public void vejoOsResultadosNaGrid() {
        resultadosBusca.verificarGrid();
    }

    @E("vejo o Mapa do resultado de busca")
    public void vejoOMapaDoResultadoDeBusca() {
        resultadosBusca.verificarMapa();
    }

    @Quando("clico no botão avançar")
    public void clicoNoBotãoAvançar() {
        resultadosBusca.clicarAvançarPag();
    }

    @E("clico no botão voltar")
    public void clicoNoBotãoVoltar() {
        resultadosBusca.clicarVoltarPag();
    }

    @Então("vejo a card do imóvel")
    public void vejoACardDoImóvel() {
        resultadosBusca.verificarCard();
    }

    @E("vejo o tipo de imóvel na card")
    public void vejoOTipoDeImóvelNaCard() {
        resultadosBusca.verificarTipoImovel();
    }

    @E("vejo o valor do imóvel na card")
    public void vejoOValorDoImóvelNaCard() {
        resultadosBusca.verificarValor();
    }

    @E("vejo o valor de condomínio na card")
    public void vejoOValorDeCondomínioNaCard() {
        resultadosBusca.verificarCondominio();
    }

    @E("vejo o endereço do imóvel na card")
    public void vejoOEndereçoDoImóvelNaCard() {
        resultadosBusca.verificarEndereco();
    }

    @E("vejo as características do imóvel na card")
    public void vejoAsCaracterísticasDoImóvelNaCard() {
        resultadosBusca.verificarCaracteristicas();
    }

    @E("vejo o botão favorito na card")
    public void vejoOBotãoFavoritoNaCard() {
        resultadosBusca.verificarFavorito();
    }

    @Quando("clico em uma card")
    public void clicoEmUmaCard() {
        resultadosBusca.clicarCard();
    }
}
