package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class SiteCorretorCompartilhar {

    private Setup driver;

    public SiteCorretorCompartilhar(Setup stepDriver) {
        driver = stepDriver;
    }

    public void visualizarLinkCartaoVisita() {
        driver.findElem("btn-business-card").isDisplayed();
    }

    public void clicarCartaoVisita() {
        driver.click("btn-business-card");
    }

    public void visualizarBtnCompartilhar() {
        driver.findElem("mdl-cptl").isDisplayed();
    }

    public void validarCRECiInvalido(String value) {
        WebElement creci = driver.findElem("//p[@class='msg-compt']", "xpath");
        Assert.assertEquals(value, creci.getText());
    }

    public void clicarBtnCompartilhar() {
        driver.click("mdl-cptl");
    }

    public void selecionarWhatsApp() {
        driver.click("profile-share-whatsapp");
    }

    public void selecionarFacebook() {
        driver.click("profile-share-facebook");
    }

    public void selecionarLinkedin() {
        driver.click("profile-share-linkedin");
    }

    public void validarWhatsApp(String value) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(value));
        Assert.assertTrue(url.contains("api.whatsapp.com"));
    }

    public void validarFacebook(String value) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(value));
        Assert.assertTrue(url.contains("facebook.com"));
    }

    public void validarLinkedin(String value) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(value));
        Assert.assertTrue(url.contains("linkedin.com"));
    }

    public void clicarURL() {
        driver.click("mdl-item-st");
    }

    public void validarURL(String value) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(value));
    }
}
