package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.SiteCorretorHeader;
import support.BaseSteps;

public class SiteCorretorHeaderSteps extends BaseSteps {

    private static SiteCorretorHeader siteCorretorHeader = new SiteCorretorHeader(driver);

    @Dado("acesso o Site do Corretor {string}")
    public void acessoOSiteDoCorretor(String value) throws InterruptedException {
        siteCorretorHeader.acessarSiteCorretor(value);
    }

    @Quando("verifico o header do Site do Corretor")
    public void verificoOHeaderDoSiteDoCorretor() {
        siteCorretorHeader.verificarHeader();
    }

    @Então("visualizo o Logo da Lopes")
    public void visualizoOLogoDaLopes() {
        siteCorretorHeader.verificarLogo();
    }

    @E("não visualizo o link Lançamentos")
    public void nãoVisualizoOLinkLançamentos() {
        siteCorretorHeader.validarLinkLancamento();
    }

    @E("não visualizo o link Prontos")
    public void nãoVisualizoOLinkProntos() {
        siteCorretorHeader.validarLinkProntos();
    }

    @E("não visualizo o link Aluguel")
    public void nãoVisualizoOLinkAluguel() {
        siteCorretorHeader.validarLinkAluguel();
    }

    @E("não visualizo o link Anuncie seu imóvel")
    public void nãoVisualizoOLinkAnuncieSeuImóvel() {
        siteCorretorHeader.validarLinkAnuncieSeuImovel();
    }

    @E("não visualizo o link Seja franqueado")
    public void nãoVisualizoOLinkSejaFranqueado() {
        siteCorretorHeader.validarLinkSejaFranqueado();
    }

    @E("não visualizo o link Calculadora de Compra")
    public void nãoVisualizoOLinkCalculadoraDeCompra() {
        siteCorretorHeader.validarLinkCalculadoraCompra();
    }

    @E("não visualizo o link Fale Conosco")
    public void nãoVisualizoOLinkFaleConosco() {
        siteCorretorHeader.validarLinkFaleConosco();
    }

    @E("não visualizo o link Favoritos")
    public void nãoVisualizoOLinkFavoritos() {
        siteCorretorHeader.validarLinkFavoritos();
    }

    @E("não visualizo o link Minha Conta")
    public void nãoVisualizoOLinkMinhaConta() {
        siteCorretorHeader.validarLinkLogin();
    }

    @Quando("clico no Logo do CRM")
    public void clicoNoLogoDoCRM() {
        siteCorretorHeader.clicarLogo();
    }
}
