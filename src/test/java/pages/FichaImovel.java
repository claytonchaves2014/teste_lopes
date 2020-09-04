package pages;

import org.junit.Assert;
import support.Setup;

public class FichaImovel {

    private Setup driver;

    public FichaImovel(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarFicha(String value) {
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains(value));
    }

    public void aguardarFicha() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[1]/div[1]/div[1]", "xpath").isDisplayed();
    }

    public void verificarFichaAberta() {
        driver.findElem("//*[@class='product__content']", "xpath").isDisplayed();
    }

    public void verificarCarrossel() {
        driver.findElem("//*[@class='carousel-fluid']", "xpath").isDisplayed();
    }

    public void verificarBtnGaleria() {
        driver.findElem("//*[@class='gallery-controller__left-container']", "xpath").isDisplayed();
    }

    public void verificarInformacoes() {
        driver.findElem("//*[@class='product__info']", "xpath").isDisplayed();
    }

    public void verificarValor() {
        driver.findElem("//*[@class='product__price']", "xpath").isDisplayed();
    }

    public void verificarAtributos() {
        driver.findElem("//*[@class='product-attributes']", "xpath").isDisplayed();
    }

    public void verificarSobreImovel() {
        driver.findElem("//*[@class='product-about']", "xpath").isDisplayed();
    }

    public void verificarCompartilhar() {
        driver.findElem("//*[@class='btn-compartilhar ant-btn ant-btn-link']", "xpath").isDisplayed();
    }

    public void verificarFavoritar() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[1]/lps-product-gallery/div/div[2]/div[2]/lps-bookmark/div/div", "xpath").isDisplayed();
    }
}
