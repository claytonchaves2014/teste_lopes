package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class HomeHeader {

    private Setup driver;

    public HomeHeader(Setup stepDriver) {
        driver = stepDriver;
    }

    String url = "https://qafrontportal.lpsbr.com/";

    public void abrirPortal() {
//        driver.openURL(System.getProperty("url"));
        driver.openURL(url);
    }

    public void clicarLogo() {
        driver.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/header/div[1]/a", "xpath");
    }

    public void verificarURL(String value) throws InterruptedException {
        String currentURL = driver.getCurrentUrl();
        System.out.println("A página aberta é: " + currentURL);
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
        driver.click("//a[@class='header__contact-us header__link']", "xpath");
    }

    public void clicarFavoritos() {
        driver.click("//*[@title=\"Meus Imóveis\"]", "xpath");
    }

    public void verificarHomePage() throws InterruptedException {
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        if (currentURL.contains("dev")) {
            Assert.assertEquals("https://devfrontportaltqi.lpsbr.com/", currentURL);
        }
        if (currentURL.contains("qa")) {
            Assert.assertEquals("https://qafrontportal.lpsbr.com/", currentURL);
        }
    }
}
