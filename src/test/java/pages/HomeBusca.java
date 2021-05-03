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

    public void clicarBuscar() throws InterruptedException {
        Thread.sleep(1000);
        driver.waitElementToBeClickable(".searchbox .search_btn", "css");
        driver.forceClick(".searchbox .search_btn", "css");
    }

public void aguardarResultados() throws InterruptedException {
        Thread.sleep(20000);
        driver.findElem("lps-search lps-search-content .search-content", "css").isDisplayed();
    }

    public void validarResultados(String value) {
        driver.waitURL(value);
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(value));
        System.out.println(currentURL);
    }

    public void inserirBusca(String value) {
        driver.sendKeys(value,"search-input", "id");
    }

    public void selecionarBusca(String value) {
        driver.waitElement("//*[@class='search-input__dropdown-new search-input__dropdown']", "xpath");
        driver.findElem("//*[text()='" + value + "']", "xpath").click();
    }

    public void clicarAlugar() {
        driver.click("/html/body/lps-root/lps-home/div/lps-home-main/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-tabs/div/div[2]/span", "xpath");
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
