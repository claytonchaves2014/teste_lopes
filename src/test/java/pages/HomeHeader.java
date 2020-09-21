package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class HomeHeader {

    private Setup driver;

    public HomeHeader(Setup stepDriver) {
        driver = stepDriver;
    }

    public void abrirPortal() {
        driver.openURL(System.getProperty("url"));
    }

    public void clicarLogo() {
        driver.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/header/div[1]/a", "xpath");
    }

    public void verificarURL(String value) throws InterruptedException {
        System.out.println(value);

        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);

        Assert.assertTrue(currentURL.contains(value));
    }

    public void clicarCookies() {
        WebElement cookies = driver.findElem("//*[@class='cookiemodal_btn ant-btn ant-btn-primary']", "xpath");

        if (cookies.isDisplayed()) {
            cookies.click();
        }
    }

    public void clicarLancamentos() {
        driver.click("logo_menu_header-Lançamentos", "id");
    }

    public void clicarProntos() {
        driver.click("logo_menu_header-Prontos", "id");
    }

    public void clicarAluguel() {
        driver.click("logo_menu_header-Aluguel", "id");
    }

    public void clicarAnuncieImovel() {
        driver.click("logo_menu_header-Anuncie seu Imóvel", "id");
    }

    public void clicarSejaFranqueado() {
        driver.click("logo_menu_header-Seja Franqueado", "id");
    }

    public void clicarCalculadora() {
        driver.click("logo_menu_header-Calculadora de Compra", "id");
    }

    public void clicarFaleConosco() {
        driver.click("//*[@class=\"header__contact-us header__link\"]", "xpath");
    }

    public void clicarFavoritos() {
        driver.click("//*[@title=\"Meus Imóveis\"]", "xpath");
    }
}
