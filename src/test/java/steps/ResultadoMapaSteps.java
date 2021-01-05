package steps;

import io.cucumber.java.pt.*;
import pages.ResultadoMapa;
import support.BaseSteps;

public class ResultadoMapaSteps extends BaseSteps {
    
    private static ResultadoMapa resultadoMapa = new ResultadoMapa(driver);
    
    @Então("vejo os ícones de Coração no Mapa")
    public void vejoOsÍconesDeCoraçãoNoMapa() throws InterruptedException {
        resultadoMapa.verificarCoracao();
    }

    @E("vejo os ícones de Prontos no Mapa")
    public void vejoOsÍconesDeProntosNoMapa() {
        resultadoMapa.verificarProntos();
    }

    @Então("clico em Aumentar o Zoom")
    public void clicoEmAumentarOZoom() {
        resultadoMapa.clicarAumentarZoom();
    }

    @Dado("que estou no resultado da busca")
    public void queEstouNoResultadoDaBusca() {
        resultadoMapa.verificarResultados();
    }

    @Quando("clico no link Ver no mapa")
    public void clicoNoLinkVerNoMapa() {
        resultadoMapa.clicarVerMapa();
    }

    @Entao("vejo o header")
    public void vejoOHeader() {
        resultadoMapa.validarHeader();
    }

    @E("vejo o filtro de transação")
    public void vejoOFiltroDeTransação() {
        resultadoMapa.validarTipoTransacao();
    }

    @E("vejo o campo de busca")
    public void vejoOCampoDeBusca() {
        resultadoMapa.validarCampoBusca();
    }

    @E("vejo os filtros")
    public void vejoOsFiltros() {
        resultadoMapa.validarFiltros();
    }

    @E("vejo o contador da busca")
    public void vejoOContadorDaBusca() {
        resultadoMapa.validarQtdBusca();
    }

    @E("vejo o filtro de ordenação")
    public void vejoOFiltroDeOrdenação() {
        resultadoMapa.validarOrdenacao();
    }

    @E("vejo o link Ocultar o mapa")
    public void vejoOLinkOcultarOMapa() {
        resultadoMapa.validarOcultarMapa();
    }

    @E("vejo a grid com {string} cards")
    public void vejoAGridComCards(String value) {
        resultadoMapa.validarCards(value);
    }

    @E("vejo o mapa")
    public void vejoOMapa() {
        resultadoMapa.validarMapa();
    }

    @E("vejo a paginação")
    public void vejoAPaginação() {
        resultadoMapa.validarPaginacao();
    }

    @E("vejo o footer")
    public void vejoOFooter() {
        resultadoMapa.validarFooter();
    }

    @Quando("clico no link Ocultar o mapa")
    public void clicoNoLinkOcultarOMapa() {
        resultadoMapa.clicarOcultarMapa();
    }

    @E("vejo o link Ver no mapa")
    public void vejoOLinkVerNoMapa() {
    }
}
