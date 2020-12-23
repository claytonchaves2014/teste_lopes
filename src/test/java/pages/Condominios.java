package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.List;

public class Condominios {

    private Setup driver;

    public Condominios(Setup stepDriver) {
        driver = stepDriver;
    }

    public void validarTitulo(String value) {
        WebElement element = driver.findElem("//h1[@class='heading-tag--title-1-bold align-left align-desktop-left no-margin']", "xpath");
        Assert.assertEquals(value, element.getText());
    }

    public void contarLinksCidades(String value) {
        WebElement select = driver.findElem("//div[@class='condominium-map__links ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.tagName("a"));
        int count = options.size();

        if (count <= 100) {
            System.out.println("Existe essa qnt de links: " + count);
        }
        else {
            Assert.fail("Os links ultrapassaram os limites");
        }
    }

    public void clicarLink(String value) {
        driver.forceClick("//a[text()='"+ value +"']", "xpath");
    }

    public void validarPaginacao() {
        driver.findElem("//div[@class='condominium-map__pagination ng-star-inserted']", "xpath").isDisplayed();
    }

    public void selecionarCondominio() {
        driver.click("//a[@class='ng-star-inserted']", "xpath");
    }

    public void verificarVerImoveis() {
        driver.findElem("//a[@class='floating-card__button ant-btn ant-btn-primary ant-btn-background-ghost']", "xpath");
    }

    public void clicarVerImoveis() {
        driver.click("//a[@class='floating-card__button ant-btn ant-btn-primary ant-btn-background-ghost']", "xpath");
    }

    public void verificarImagem() {
        driver.findElem("//div[@class='condominium__image']", "xpath").isDisplayed();
    }

    public void verificarNomeCondominio() {
        driver.findElem("//h1[@class='heading-tag--title-1-bold align-left align-desktop-left no-margin']", "xpath").isDisplayed();
    }

    public void verificarEndereco() {
        driver.findElem("//p[@class='condominium__info-address ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarAtributos() {
        driver.findElem("//div[@class='attributes attributes--with-label']", "xpath").isDisplayed();
    }

    public void verificarInstalacoes() {
        driver.findElem("//div[@class='features__content']", "xpath");
    }

    public void verificarTextVerImoveis(String value) {
        WebElement element = driver.findElem("//p[@class='floating-card__text']", "xpath");
        Assert.assertEquals(value, element.getText());
    }

    public void verificarLinkVerImoveis(String value) {
        WebElement element = driver.findElem("//a[@class='floating-card__link']", "xpath");
        Assert.assertEquals(value, element.getText());
    }

    public void verificarBreadcrump() {
        driver.findElem("//div[@class='breadcrumb ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarEntrarContato() {
        driver.click("//a[@class='floating-card__link']", "xpath");
    }
}
