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
        WebElement footer = driver.findElem("//*[@class='ant-pagination mini ng-star-inserted']", "xpath");
        driver.ScrollTo(footer);
        driver.waitElement("//*[@title='Próxima página']", "xpath");
        driver.forceClick("//*[@title='Próxima página']", "xpath");
    }

    public void clicarVoltarPag() {
        WebElement footer = driver.findElem("//div[@class='search-content__pagination ng-star-inserted']", "xpath");
        driver.ScrollTo(footer);
        driver.waitElement("//li[@class='ant-pagination-next ng-star-inserted']", "xpath");
        driver.forceClick("//li[@title='Página anterior']", "xpath");
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
        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);
        driver.waitElement("//*[@class='search-content__summary']", "xpath");
        driver.forceClick("//*[@class='card ng-star-inserted']", "xpath");
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
