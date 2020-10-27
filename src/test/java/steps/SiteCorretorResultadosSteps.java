package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.SiteCorretorResultados;
import support.BaseSteps;

public class SiteCorretorResultadosSteps extends BaseSteps {

    public static SiteCorretorResultados siteCorretorResultados = new SiteCorretorResultados(driver);

    @Quando("verifico os resultados de imóveis do corretor")
    public void verificoOsResultadosDeImóveisDoCorretor() {
        siteCorretorResultados.verificarResultados();
    }

    @Então("visualizo a descrição com o total dos imóveis encontrados")
    public void visualizoADescriçãoComOTotalDosImóveisEncontrados() {
        siteCorretorResultados.verificarDescricao();
    }

    @E("visualizo o botão Ordenar")
    public void visualizoOBotãoOrdenar() {
        siteCorretorResultados.verificarBtnOrdenar();
    }

    @E("visualizo o botão Filtros")
    public void visualizoOBotãoFiltros() {
        siteCorretorResultados.verificarBtnFiltros();
    }

    @E("visualizo as cards dos imóveis")
    public void visualizoAsCardsDosImóveis() {
        siteCorretorResultados.verificarListaCards();
    }

    @E("visualizo a paginação")
    public void visualizoAPaginação() {
        siteCorretorResultados.verificarPaginacao();
    }

    @E("visualizo o footer como {string}")
    public void visualizoOFooterComo(String value) {
        siteCorretorResultados.verificarFooter(value);
    }

    @Então("visualizo a card do imóvel")
    public void visualizoACardDoImóvel() {
        siteCorretorResultados.verificarCard();
    }

    @E("visualizo a foto do imóvel na card")
    public void visualizoAFotoDoImóvelNaCard() {
        siteCorretorResultados.verificarFoto();
    }

    @E("visualizo o tipo do imóvel na card")
    public void visualizoOTipoDoImóvelNaCard() {
        siteCorretorResultados.verificarTipoImovel();
    }

    @E("visualizo o endereço do imóvel na card")
    public void visualizoOEndereçoDoImóvelNaCard() {
        siteCorretorResultados.verificarEndereco();
    }

    @E("visualizo os atributos do imóvel na card")
    public void visualizoOsAtributosDoImóvelNaCard() {
        siteCorretorResultados.verificarAtributos();
    }

    @E("clico no botão Ordenar")
    public void clicoNoBotãoOrdenar() {
        siteCorretorResultados.clicarOrdenar();
    }

    @E("seleciono a opção {string} de ordenção")
    public void selecionoAOpçãoDeOrdenção(String value) throws InterruptedException {
        siteCorretorResultados.selecionarOrdenacao(value);
    }

    @Então("verifico que os resultados foram ordenados por {string}")
    public void verificoQueOsResultadosForamOrdenadosPor(String value) {
        siteCorretorResultados.validarOrdenar(value);
    }

    @Quando("clico no botão Filtros dos resultados do corretor")
    public void clicoNoBotãoFiltrosDosResultadosDoCorretor() {
        siteCorretorResultados.clicarFiltros();
    }

    @Então("vejo o tipo de transação como {string}")
    public void vejoOTipoDeTransaçãoComo(String value) {
        siteCorretorResultados.validarTipoTransação(value);
    }

    @E("clico no botão avançar para a próxima página")
    public void clicoNoBotãoAvançarParaAPróximaPágina() {
        siteCorretorResultados.btnAvancarPagina();
    }

    @Então("valido que a próxima página é aberta")
    public void validoQueAPróximaPáginaÉAberta() {
        siteCorretorResultados.validarProxPagina();
    }

    @E("seleciono Aluguel como Tipo de Transação")
    public void selecionoAluguelComoTipoDeTransação() {
        siteCorretorResultados.selecionarTipoTransacaoAluguel();
    }

    @E("clico em Tipo de Transação do corretor")
    public void clicoEmTipoDeTransaçãoDoCorretor() {
        siteCorretorResultados.btnTipoTransacao();
    }
}
