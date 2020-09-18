package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.List;

public class ResultadoSEO {

    private Setup driver;

    public ResultadoSEO(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarDinamicas() {
        WebElement footer = driver.findElem("//*[@class='search-grid-about__title']", "xpath");
        driver.ScrollTo(footer);
    }

    public void verificarTextoLocal() {
        driver.findElem("//*[@class='product__about ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarVerMaisTexto() {
        driver.waitElementToBeClickable("//*[@class='mr-2 ant-btn ant-btn-link']", "xpath");
        driver.click("//*[@class='mr-2 ant-btn ant-btn-link']", "xpath");
    }

    public void verificarTextoCompleto() {
        WebElement verMenos = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/div/lps-search-grid-about/div/div[3]/button/span", "xpath");
        Assert.assertEquals("Ver menos", verMenos.getText());
    }

    public void verificarCidadesRelacionadas() {
        WebElement elemento = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[1]/h4", "xpath");
        String cidade = elemento.getText();
        Assert.assertTrue(cidade.contains("Cidades relacionadas"));
    }

    public void selecionarCidadesRelacionadas(String value) {
        WebElement select = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[1]/div", "xpath");

        List<WebElement> options = select.findElements(By.linkText(value));
        for (WebElement option : options) {
            option.click();
        }
    }

    public void verificarBairrosPopulares() {
        WebElement elemento = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[2]/h4", "xpath");
        String bairro = elemento.getText();
        Assert.assertTrue(bairro.contains("Bairros mais populares"));
    }

    public void selecionarBairrosPopulares(String value) {
        WebElement select = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[2]/div", "xpath");

        List<WebElement> options = select.findElements(By.linkText(value));
        for (WebElement option : options) {
            option.click();
        }
    }

    public void verificarLogradouros() {
        WebElement elemento = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[3]/h4", "xpath");
        String logradouro = elemento.getText();
        Assert.assertTrue(logradouro.contains("Logradouros mais populares"));
    }

    public void selecionarLogradouros(String value) {
        WebElement select = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[3]/div", "xpath");

        List<WebElement> options = select.findElements(By.linkText(value));
        for (WebElement option : options) {
            option.click();
        }
    }

    public void verificarVejaTambem() {
        WebElement elemento = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[4]/h4", "xpath");
        String vejatambem = elemento.getText();
        Assert.assertTrue(vejatambem.contains("Veja Também"));
    }

    public void selecionarVejaTambem(String value) {
        WebElement select = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/div[3]/lps-internal-link-widget/div/lps-internal-link-search[4]/div", "xpath");

        List<WebElement> options = select.findElements(By.linkText(value));
        for (WebElement option : options) {
            option.click();
        }
    }
}