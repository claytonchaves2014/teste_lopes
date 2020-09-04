package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class HomeDestaques {

    private Setup driver;

    public HomeDestaques(Setup stepDriver) {
        driver = stepDriver;
    }

    public void validarTitulo(String value) {
        WebElement titulo = driver.findElem("//*[@class='heading-tag--title-2-light align-center align-desktop-center']", "xpath");
        Assert.assertEquals(value, titulo.getText());
    }

    public void validarSubtitulo(String value) {
        WebElement subtitulo = driver.findElem("//*[@class='card-imoveis-subtitle']", "xpath");
        Assert.assertEquals(value, subtitulo.getText());
    }

    public void validarLancExclusivos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]", "xpath").isDisplayed();
    }

    public void validarTipoLancExclusivos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[1]", "xpath").isDisplayed();
    }

    public void validarNomeLanExclusivos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[2]", "xpath").isDisplayed();
    }

    public void validarEnderecoLanExclusivos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[3]", "xpath").isDisplayed();
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[4]", "xpath").isDisplayed();
    }

    public void validarAreaLanExclusivos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[1]/span", "xpath").isDisplayed();
    }

    public void validarObraLanExclusivos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[2]/span", "xpath").isDisplayed();
    }

    public void validarDormitorios() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[3]", "xpath").isDisplayed();
    }

    public void validarBanheiros() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[4]", "xpath").isDisplayed();
    }

    public void validarVagas() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[5]", "xpath").isDisplayed();
    }

    public void validarProxLancamentos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]", "xpath").isDisplayed();
    }

    public void validarTipoProxLanc() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[1]", "xpath").isDisplayed();
    }

    public void validarNomeProxLanc() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[2]", "xpath").isDisplayed();
    }

    public void validarEnderecoProxLanc() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[3]", "xpath").isDisplayed();
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/div/p[4]", "xpath").isDisplayed();
    }

    public void validarAreaProxLanc() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[1]", "xpath").isDisplayed();
    }

    public void validarObraProxLanc() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div/div[2]", "xpath").isDisplayed();
    }

    public void validarAtributos() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[1]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div", "xpath").isDisplayed();
    }

    public void validarAtributosProxLan() {
        driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[3]/section[2]/lps-card-grid/div[1]/ul/li[1]/lps-card-product/lps-link-product/div/a/article/lps-attributes/div", "xpath").isDisplayed();
    }
}
