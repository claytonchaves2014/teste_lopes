package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class HomePage {

    private Setup driver;

    public HomePage(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarComponente() {
        driver.findElem("//*[@class='list-information']", "xpath").isDisplayed();
    }

    public void primeiroTitulo(String titulo) {
        WebElement title = driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[2]/div/lps-information-lopes/div/ul/li[1]/div/div[2]/p[1]", "xpath");
        Assert.assertEquals(titulo, title.getText());
    }

    public void primeiroDescricao(String descricao) {
        WebElement desc = driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[2]/div/lps-information-lopes/div/ul/li[1]/div/div[2]/p[2]", "xpath");
        Assert.assertEquals(descricao, desc.getText());
    }

    public void segundoTitulo(String titulo) {
        WebElement title = driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[2]/div/lps-information-lopes/div/ul/li[2]/div/div[2]/p[1]", "xpath");
        Assert.assertEquals(titulo, title.getText());
    }

    public void segundoDescricao(String descricao) {
        WebElement desc = driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[2]/div/lps-information-lopes/div/ul/li[2]/div/div[2]/p[2]", "xpath");
        Assert.assertEquals(descricao, desc.getText());
    }

    public void terceiroTitulo(String titulo) {
        WebElement title = driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[2]/div/lps-information-lopes/div/ul/li[3]/div/div[2]/p[1]", "xpath");
        Assert.assertEquals(titulo, title.getText());
    }

    public void terceiroDescricao(String descricao) {
        WebElement desc = driver.findElem("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[2]/div/lps-information-lopes/div/ul/li[3]/div/div[2]/p[2]", "xpath");
        Assert.assertEquals(descricao, desc.getText());
    }

    public void verificarHomePage() {
        driver.findElem("//*[@class='search-container']", "xpath").isDisplayed();
    }
}
