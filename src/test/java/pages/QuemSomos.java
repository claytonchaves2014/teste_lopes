package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class QuemSomos {

    private Setup driver;

    public QuemSomos(Setup stepDriver) {
        driver = stepDriver;
    }

    public void validarBanner() {
        String banner = driver.getSrc("//*[@class='about-us__main-banner-image']", "xpath");
        Assert.assertTrue(banner.contains("assets/imgs/about-us-page/about-us-people.png"));
    }

    public void validarTitulo(String value) {
        WebElement titulo = driver.findElem("//*[@class='heading-tag--display-4 align-center align-desktop-left ']", "xpath");
        Assert.assertEquals(value, titulo.getText());
    }

    public void validarSubTitulo(String value) {
        WebElement subtitulo = driver.findElem("//p[@class='about-us__main-banner-text']", "xpath");
        Assert.assertEquals(value, subtitulo.getText());
    }

    public void validarPrimeiraCard(String value) {
        WebElement card = driver.findElem("/html/body/lps-root/lps-landing/lps-application-layout/nav-layout-default/lps-about-us/div[2]/div/lps-card-features[1]/div/div[2]/div/span", "xpath");
        Assert.assertEquals(value, card.getText());
    }

    public void validarSegundaCard(String value) {
        WebElement card = driver.findElem("/html/body/lps-root/lps-landing/lps-application-layout/nav-layout-default/lps-about-us/div[2]/div/lps-card-features[2]/div/div[2]/div/span", "xpath");
        Assert.assertEquals(value, card.getText());
    }

    public void validarTerceiraCard(String value) {
        WebElement card = driver.findElem("/html/body/lps-root/lps-landing/lps-application-layout/nav-layout-default/lps-about-us/div[2]/div/lps-card-features[3]/div/div[2]/div/span", "xpath");
        Assert.assertEquals(value, card.getText());
    }

    public void validarQuartaCard(String value) {
        WebElement card = driver.findElem("/html/body/lps-root/lps-landing/lps-application-layout/nav-layout-default/lps-about-us/div[2]/div/lps-card-features[4]/div/div[2]/div/span", "xpath");
        Assert.assertEquals(value, card.getText());
    }

    public void validarQuintaCard(String value) {
        WebElement card = driver.findElem("/html/body/lps-root/lps-landing/lps-application-layout/nav-layout-default/lps-about-us/div[2]/div/lps-card-features[5]/div/div[2]/div/span", "xpath");
        Assert.assertEquals(value, card.getText());
    }

    public void clicarQueroInvestir() {
        WebElement footer = driver.findElem("//div[@class='red-border']", "xpath");
        driver.ScrollTo(footer);
        driver.forceClick("//a[@class='link--primary about-us__investment__info__link']", "xpath");
    }
}
