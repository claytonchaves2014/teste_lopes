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
        WebElement subtitulo = driver.findElem("", "xpath");
        Assert.assertEquals(value, subtitulo.getText());
    }
}
