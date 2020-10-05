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
}
