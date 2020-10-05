package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.ArrayList;
import java.util.List;

public class FichaCorretor {

    private Setup driver;

    public FichaCorretor(Setup stepDriver) {
        driver = stepDriver;
    }

    public void acessarFicha(String value) {
        String url = driver.getCurrentUrl();
        driver.openURL(url + "/imovel/" + value);
    }

    public void inserirParametro(String value) {
        String url = driver.getCurrentUrl();
        driver.openURL(url + value);
        String parametro = driver.getCurrentUrl();
        Assert.assertTrue(parametro.contains(value));
    }

    public void alterarParametro(String value) {
        String url = driver.getCurrentUrl();



        driver.openURL(url + value);
        String parametro = driver.getCurrentUrl();
        Assert.assertTrue(parametro.contains(value));
    }

    public void validarCartaoCorretor() {
        WebElement select = driver.findElem("//div[@class='card ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.xpath("//div[@class='card__nickname']"));
        int count = options.size();
        System.out.println("Existe essa qnt de corretor: " + count);
    }

    public void validarQntCartaoCorretor() {
        WebElement select = driver.findElem("//div[@class='card ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.xpath("//div[@class='card__nickname']"));
        int count = options.size();

        if (count <= 5) {
            System.out.println("Existe essa qnt de corretor: " + count);
        }
        else {
            Assert.fail("Existem mais de 5 Cartões do Corretor");
        }
    }

    public void validarNumCreci(String value) {
        WebElement elemento = driver.findElem("//div[@class='card__creci']", "xpath");
        String creci = elemento.getText();
        Assert.assertTrue(creci.contains(value));
    }

    public void validarNickName(String value) {
        WebElement card = driver.findElem("//span[@class='realtor__title-card']", "xpath");
        driver.ScrollTo(card);

        WebElement nickname = driver.findElem("//div[@class='card__nickname']", "xpath");
        Assert.assertEquals(value, nickname.getText());
    }

    public void validarParametro(String value) {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchWin("2");

        String parametro = driver.getCurrentUrl();
        Assert.assertTrue(parametro.contains(value));
    }

    public void clicarVerTelefone() {
        WebElement lead = driver.findElem("//div[@class='show-phone ng-star-inserted']", "xpath");
        driver.ScrollTo(lead);

        driver.forceClick("//div[@class='show-phone ng-star-inserted']", "xpath");
    }

    public void validarCelularLead(String value) {
        WebElement celular = driver.findElem("//*[@id=\"web\"]/div[2]/div[1]/span", "xpath");
        Assert.assertEquals(value, celular.getText());
    }

    public void verificarCartaoCorretor(String value) {
        WebElement cartao = driver.findElem("//span[@class='realtor__title-card']", "xpath");
        Assert.assertEquals(value, cartao.getText());
    }

    public void verificarApelido() {
        driver.findElem("//div[@class='card__nickname']", "xpath").isDisplayed();
    }

    public void verificarFoto() {
        driver.findElem("//img[@class='card__picture ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarLogo() {
        driver.findElem("//img[@class='card__logo-lopes ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarNomeCompleto() {
        driver.findElem("//div[@class='card__name']", "xpath").isDisplayed();
    }

    public void verificarCreci() {
        driver.findElem("//div[@class='card__creci']", "xpath").isDisplayed();
    }

    public void verificarFalarComCorretor() {
        driver.findElem("//a[@class='card__talk-realtor ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarFalarComCorretor() {
        driver.forceClick("//a[@class='card__talk-realtor ng-star-inserted']", "xpath");
    }

    public void verificarPopup(String value) {
        driver.waitElement("//p[@class='modal-realtor__title ng-star-inserted']", "xpath");
        WebElement popup = driver.findElem("//p[@class='modal-realtor__title ng-star-inserted']", "xpath");
        Assert.assertEquals(value, popup.getText());
    }

    public void verificarTxtPopup(String value) {
        WebElement popup = driver.findElem("//p[@class='modal-realtor__description ng-star-inserted']", "xpath");
        Assert.assertEquals(value, popup.getText());
    }

    public void verificarNumeroPopup() {
        driver.findElem("//p[@class='modal-realtor__description__number ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarFecharPopup() {
        driver.findElem("//a[@class='modal-realtor__close ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarFecharPopup() {
        driver.forceClick("//a[@class='modal-realtor__close ng-star-inserted']", "xpath");
    }
}
