package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class SiteCorretorHeader {

    private Setup driver;

    public SiteCorretorHeader(Setup stepDriver) {
        driver = stepDriver;
    }

    public void acessarSiteCorretor(String value) {
        String url = driver.getCurrentUrl();

        if (url.contains("dev")) {
            driver.openURL("https://devfrontcrm.lpsbr.com/associado/" + value);
        }
        if (url.contains("qa")) {
            driver.openURL("https://qafrontcrm.lpsbr.com/associado/" + value);
        }
    }

    public void verificarHeader() {
        driver.findElem("//div[@class='broker_header']", "xpath").isDisplayed();
    }

    public void verificarLogo() {
        driver.findElem("//div[@class='header__logo']", "xpath").isDisplayed();
    }

    public void validarLinkLancamento() {
        WebElement menu = driver.findElem("logo_menu_header-Lançamentos", "id");
        Assert.assertNull(menu);
    }

    public void validarLinkProntos() {
        WebElement menu = driver.findElem("logo_menu_header-Prontos", "id");
        Assert.assertNull(menu);
    }

    public void validarLinkAluguel() {
        WebElement menu = driver.findElem("logo_menu_header-Aluguel", "id");
        Assert.assertNull(menu);
    }

    public void validarLinkAnuncieSeuImovel() {
        WebElement menu = driver.findElem("logo_menu_header-Anuncie seu Imóvel", "id");
        Assert.assertNull(menu);
    }

    public void validarLinkSejaFranqueado() {
        WebElement menu = driver.findElem("logo_menu_header-Seja Franqueado", "id");
        Assert.assertNull(menu);
    }

    public void validarLinkCalculadoraCompra() {
        WebElement menu = driver.findElem("logo_menu_header-Calculadora de Compra", "id");
        Assert.assertNull(menu);
    }

    public void validarLinkFaleConosco() {
        WebElement menu = driver.findElem("//a[@class='header__contact-us header__link']", "xpath");
        Assert.assertNull(menu);
    }

    public void validarLinkFavoritos() {
        WebElement menu = driver.findElem("//a[@title='Meus Imóveis']", "xpath");
        Assert.assertNull(menu);
    }

    public void validarLinkLogin() {
        WebElement menu = driver.findElem("//a[@title='Minha conta']", "xpath");
        Assert.assertNull(menu);
    }

    public void clicarLogo() {
        driver.forceClick("//a[@class='header__button header__link']", "xpath");
    }
}
