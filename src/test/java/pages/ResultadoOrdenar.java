package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class ResultadoOrdenar {

    private Setup driver;

    public ResultadoOrdenar(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarOrdenar() {
        driver.waitElement("//*[@class='search-content__summary']", "xpath");
        driver.click("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/lps-search-order/button", "xpath");
    }

    public void verificarOrdem(String value) {
        WebElement elemento = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/lps-search-order/button/span[1]", "xpath");
        String ordem = elemento.getText();
        Assert.assertEquals(value, ordem);
    }

    public void clicarRelevancia() {
        driver.click("//*[text()=' Relevância ']", "xpath");
    }

    public void clicarMenorValor() {
        driver.click("//*[text()=' Menor valor ']", "xpath");
    }

    public void clicarMaiorValor() {
        driver.click("//*[text()=' Maior valor ']", "xpath");
    }

    public void clicarDataAtualizacao() {
        driver.click("//*[text()=' Data de atualização ']", "xpath");
    }

    public void clicarAreaImovel() {
        driver.click("//*[text()=' Área do imóvel ']", "xpath");
    }
}
