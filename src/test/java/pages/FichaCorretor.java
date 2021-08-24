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
    }

    public void alterarParametro(String value) {
        String url = driver.getCurrentUrl();



        driver.openURL(url + value);
        String parametro = driver.getCurrentUrl();
        Assert.assertTrue(parametro.contains(value));
    }

    public void validarCartaoCorretor() {
        WebElement select = driver.findElem("//div[@class='card ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.xpath("//div[@class='card__information__nickname']"));
        int count = options.size();
        if (count <= 1) {
            System.out.println("Existe essa qnt de corretor: " + count);
        }
        else {
            Assert.fail("Existem mais de 1 Cartão do Corretor");
        }
    }

    public void validarQntCartaoCorretor() {
        WebElement select = driver.findElem("//div[@class='card ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.xpath("//div[@class='card__information__nickname']"));
        int count = options.size();

        if (count <= 6) {
            System.out.println("Existe essa qnt de corretor: " + count);
        }
        else {
            Assert.fail("Existem mais de 6 Cartões do Corretor");
        }
    }

    public void validarNumCreci(String value) {
        WebElement elemento = driver.findElem("//div[@class='card__information__creci']", "xpath");
        String creci = elemento.getText();
        Assert.assertTrue(creci.contains(value));
    }

    public void validarNickName(String value) {
        WebElement card = driver.findElem("//span[@class='realtor__title-card']", "xpath");
        driver.ScrollTo(card);

        WebElement nickname = driver.findElem("//div[@class='card__information__nickname']", "xpath");
        Assert.assertEquals(value, nickname.getText());
    }

    public void validarParametro(String value) {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchWin("2");

        String parametro = driver.getCurrentUrl();
        System.out.println("URL" + parametro);
        Assert.assertTrue(parametro.contains(value));
    }

    public void verificarCartaoCorretor(String value) {
        WebElement cartao = driver.findElem("//span[@class='realtor__title-card']", "xpath");
        Assert.assertEquals(value, cartao.getText());
    }

    public void verificarApelido() {
        driver.findElem("//div[@class='card__information__nickname']", "xpath").isDisplayed();
    }

    public void verificarFoto() {
        driver.findElem("//img[@alt='imagem corretor']", "xpath").isDisplayed();
    }

    public void verificarLogo() {
        driver.findElem("//img[@alt='Logo parceira']", "xpath").isDisplayed();
    }

    public void verificarNomeCompleto() {
        driver.findElem("//div[@class='card__information__name']", "xpath").isDisplayed();
    }

    public void verificarCreci() {
        driver.findElem("//div[@class='card__information__creci']", "xpath").isDisplayed();
    }

    public void verificarFalarComCorretor() {
        driver.findElem("//a[@class='card__talk-realtor ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarFalarComCorretor() {
        driver.forceClick("//a[@class='card__talk-realtor ng-star-inserted']", "xpath");
    }

    public void verificarFocusInput() {
        driver.findElem("//input[@id='nome']", "xpath").isSelected();
    }

}
