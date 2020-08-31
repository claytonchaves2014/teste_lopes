package pages;

import org.junit.Assert;
import support.Setup;

public class HomeBusca {

    private Setup driver;

    public HomeBusca(Setup stepDriver) {
        driver = stepDriver;
    }

    public void checkComprarPlanta() {
        driver.click("//*[@text=\"Comprar na Planta\"]", "xpath");
    }

    public void checkComprarPronto() {
        driver.click("//*[@text=\"Comprar Pronto\"]", "xpath");
    }

    public void clicarBuscar() {
        driver.waitElementToBeClickable("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/div/div/div[2]/div/input", "xpath");
        driver.click("//*[@value='Buscar']", "xpath");
    }

    public void aguardarResultados() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div", "xpath").isDisplayed();
    }

    public void validarResultados(String value) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(value));
    }

    public void inserirBusca(String value) {
        driver.sendKeys(value,"search-input", "id");
    }

    public void selecionarBusca(String value) {
        driver.findElem("//*[text()='" + value + "']", "xpath").click();
    }

    public void clicarAlugar() {
        driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-tabs/div/div[2]/span", "xpath");
    }

    public void clicarCodigo() {
        driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[2]/lps-checkbox/div/label/span", "xpath");
    }

    public void msgEnderecoInvalido(String value) {
        driver.findElem("//*[text()='" + value + "']", "xpath").isDisplayed();
    }

    public void verificarCaixaBusca() {
        driver.findElem("//div[@class='search-input__dropdown-new search-input__dropdown']", "xpath").isDisplayed();
    }
}
