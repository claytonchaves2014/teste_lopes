package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.List;

public class ResultadoMapa {

    private Setup driver;

    public ResultadoMapa(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarZoom() {
        WebElement zoom = driver.findElem("//*[@class='agm-map-container-inner sebm-google-map-container-inner']", "xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].getZoom();", zoom);
    }

    public void clicarAumentarZoom() {
        driver.click("//*[@title='Aumentar o zoom']", "xpath");
    }

    public void verificarCoracao() throws InterruptedException {
        driver.findElem("//img[@src='/assets/svgs/pin_heart_red.svg']", "xpath").isDisplayed();
    }

    public void verificarProntos() {
        driver.findElem("//img[@src='/assets/svgs/pin_circle_gray.svg']", "xpath").isDisplayed();
    }

    public void verificarResultados() {
        driver.findElem("//div[@class='search-content__summary']", "xpath").isDisplayed();
    }

    public void clicarVerMapa() {
        driver.click("/html/body/lps-root/lps-search/div/div/div/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/button", "xpath");
    }

    public void validarHeader() {
        driver.findElem("//header[@class='header']", "xpath").isDisplayed();
    }

    public void validarTipoTransacao() {
        driver.findElem("//button[@class='mr-3 operation-btn ant-btn ant-dropdown-trigger ant-btn-default ant-btn-sm']", "xpath").isDisplayed();
    }

    public void validarFiltros() {
        driver.findElem("//div[@class='search-bar filter-opened ant-row-flex ant-row-flex-middle ant-row-flex-space-between']", "xpath").isDisplayed();
    }

    public void validarCampoBusca() {
        driver.findElem("search-input").isDisplayed();
    }

    public void validarQtdBusca() {
        driver.findElem("//h1[@class='heading-tag--title-1-light align-left align-desktop-left ']", "xpath").isDisplayed();
    }

    public void validarOrdenacao() {
        driver.findElem("//button[@class='mr-3 search-order ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default ant-btn-sm']", "xpath").isDisplayed();
    }

    public void validarOcultarMapa() {
        driver.findElem("//button[@class='ng-star-inserted']", "xpath").isDisplayed();
    }

    public void validarCards(String value) {

        WebElement select = driver.findElem("//ul[@class='cardlist ng-star-inserted cardlist--search']", "xpath");

        List<WebElement> options = select.findElements(By.tagName("li"));
        int count = options.size();

        if (count <= 24) {
            System.out.println("Existe essa qnt de links: " + count);
        }
        else {
            Assert.fail("Os links ultrapassaram os limites");
        }

    }

    public void validarMapa() {
        driver.findElem("//div[@class='agm-map-container-inner sebm-google-map-container-inner']", "xpath").isDisplayed();
    }

    public void validarPaginacao() {
        driver.findElem("//div[@class='search-content__pagination ng-star-inserted']", "xpath").isDisplayed();
    }

    public void validarFooter() {
        driver.findElem("//div[@class='main-content']", "xpath").isDisplayed();
    }

    public void clicarOcultarMapa() {
        driver.click("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/button", "xpath");
    }

    public void validarVerMapa() {
        driver.findElem("/html/body/lps-root/lps-search/div/div/div/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/button", "xpath").isDisplayed();
    }
}
