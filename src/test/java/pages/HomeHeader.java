package pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import support.Setup;

public class HomeHeader {

    private Setup setup;

    public HomeHeader(Setup stepDriver) {
        setup = stepDriver;
    }

    String url = "https://qafrontportal.lpsbr.com";

    public void abrirPortal() {
        setup.openURL(url);
    }

    public void clicarLogo() {
        setup.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/header/div[1]/a", "xpath");
    }

    public void verificarURL(String value) throws InterruptedException {
        String currentURL = setup.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(value));
    }

    public void clicarCookies() {
        setup.click("//*[@class=\"cookiemodal_btn ant-btn ant-btn-primary\"]", "xpath");
    }

    public void clicarLancamentos() {
        setup.click("logo_menu_header-Lançamentos", "id");
    }

    public void clicarProntos() {
        setup.click("logo_menu_header-Prontos", "id");
    }

    public void clicarAluguel() {
        setup.click("logo_menu_header-Aluguel", "id");
    }

    public void clicarAnuncieImovel() {
        setup.click("logo_menu_header-Anuncie seu Imóvel", "id");
    }

    public void clicarSejaFranqueado() {
        setup.click("logo_menu_header-Seja Franqueado", "id");
    }

    public void clicarCalculadora() {
        setup.click("logo_menu_header-Calculadora de Compra", "id");
    }

    public void clicarFaleConosco() {
        setup.click("//*[@class=\"header__contact-us header__link\"]", "xpath");
    }

    public void clicarFavoritos() {
        setup.click("//*[@title=\"Meus Imóveis\"]", "xpath");
    }
}
