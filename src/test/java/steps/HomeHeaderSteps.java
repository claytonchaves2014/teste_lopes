package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import pages.HomeHeader;
import support.BaseSteps;

public class HomeHeaderSteps extends BaseSteps {

    private static HomeHeader homeHeader = new HomeHeader(driver);

    public HomeHeaderSteps() {}

    @Dado("acesso o Portal da Lopes")
    public void acessoOPortalDaLopes() {
        homeHeader.abrirPortal();
    }

    @Então("clico em Aceitar Cookies")
    public void clicoEmAceitarCookies() {
        homeHeader.clicarCookies();
    }

    @Dado("clico no Logo da Lopes")
    public void clicoNoLogoDaLopes() {
        homeHeader.clicarLogo();
    }

    @Então("verifico que a URL é aberta {string}")
    public void verificoQueAURLÉAberta(String value) throws InterruptedException {
        homeHeader.verificarURL(value);
    }

    @Dado("clico no header Lançamentos")
    public void clicoNoHeaderLançamentos() {
        homeHeader.clicarLancamentos();
    }

    @Dado("clico no header Prontos")
    public void clicoNoHeaderProntos() {
        homeHeader.clicarProntos();
    }

    @Dado("clico no header Aluguel")
    public void clicoNoHeaderAluguel() {
        homeHeader.clicarAluguel();
    }

    @Dado("clico no header Anuncie seu imóvel")
    public void clicoNoHeaderAnuncieSeuImóvel() {
        homeHeader.clicarAnuncieImovel();
    }

    @Dado("clico no header Seja um franqueado")
    public void clicoNoHeaderSejaUmFranqueado() {
        homeHeader.clicarSejaFranqueado();
    }

    @Dado("clico no header Calculadora de Compra")
    public void clicoNoHeaderCalculadoraDeCompra() {
        homeHeader.clicarCalculadora();
    }

    @Dado("clico no header Fale conosco")
    public void clicoNoHeaderFaleConosco() {
        homeHeader.clicarFaleConosco();
    }

    @Dado("clico no header Favoritos")
    public void clicoNoHeaderFavoritos() {
        homeHeader.clicarFavoritos();
    }
}
