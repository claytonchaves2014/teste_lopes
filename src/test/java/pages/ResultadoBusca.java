package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class ResultadoBusca {

    private Setup driver;

    public ResultadoBusca(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarSemResultado(String value) {
        WebElement resultado = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/lps-empty-search/div/div[1]/h2[2]", "xpath");
        Assert.assertEquals(value, resultado.getText());
    }

    public void verificarQntd() {
        driver.findElem("//*[@class='heading-tag--title-1-light align-left align-desktop-left ']", "xpath").isDisplayed();
    }

    public void verificarGrid() {
        driver.findElem("//*[@class='search-content__products ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarMapa() {
        driver.findElem("//div[@class='app-layout__content--child app-layout__content--right app-layout__content--right--deactivated ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarAvançarPag() {
        WebElement pagination = driver.findElem("lps-pagination", "css");
        driver.ScrollTo(pagination);
        driver.waitElement("//*[@aria-label='Próxima página']", "xpath");
        driver.forceClick("//*[@aria-label='Próxima página']", "xpath");
    }

    public void clicarVoltarPag() {
        WebElement pagination = driver.findElem("lps-pagination", "css");
        driver.ScrollTo(pagination);
        driver.waitElement("lps-pagination li[title='Página anterior'] a", "css");
        driver.forceClick("lps-pagination li[title='Página anterior'] a", "css");
    }

    public void verificarCard() {
        driver.findElem("//*[@class='card ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarTipoImovel() {
        driver.findElem("//*[@class='card__type']", "xpath").isDisplayed();
    }

    public void verificarValor() {
        driver.findElem("//*[@class='card__price ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarCondominio() {
        driver.findElem("//*[@class='card__subprice ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarEndereco() {
        driver.findElem("//*[@class='card__location']", "xpath").isDisplayed();
    }

    public void verificarCaracteristicas() {
        driver.findElem("//*[@class='attributes']", "xpath").isDisplayed();
    }

    public void verificarFavorito() {
        driver.findElem("//div[@title='Favoritar']", "xpath").isDisplayed();
    }

    public void clicarCard() {
        driver.forceClick("/html/body/lps-root/lps-search/div/div/div/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a", "xpath");
    }

    public void visualizarCardCalc() {
        driver.findElem("//section[@class='card-calculadora']", "xpath").isDisplayed();
    }

    public void naoVisualizarCardCal() {
        WebElement card = driver.findElem("//section[@class='card-calculadora']", "xpath");
        if (card.isDisplayed()) {
            Assert.fail();
        }
    }

    public void clicarCardCalc() {
        driver.click("//section[@class='card-calculadora']", "xpath");
    }
}
