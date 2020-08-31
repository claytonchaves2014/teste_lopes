package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class FaleConosco {

    private Setup driver;

    public FaleConosco(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarTitulo(String value) {
        driver.waitElement("//*[@class='heading-tag--display-4 align-center align-desktop-center ']", "xpath");
        WebElement titulo = driver.findElem("//*[@class='heading-tag--display-4 align-center align-desktop-center ']", "xpath");
        Assert.assertEquals(value, titulo.getText());
    }

    public void verificarBanner() {
        driver.waitElement("//*[@class='contact-us__banner__img']", "xpath");
        String banner = driver.getSrc("//*[@class='contact-us__banner__img']", "xpath");
        Assert.assertTrue(banner.contains("assets/imgs/contact-us-page/new-banner.svg"));
    }

    public void componenteFormulario() {
        driver.findElem("//*[@class='contact-us__form']", "xpath").isDisplayed();
    }

    public void clicarAssunto() throws InterruptedException {
        Thread.sleep(2000);
        driver.waitElementToBeClickable("//*[@class='dropdown-button ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default']", "xpath");
        driver.click("//*[@class='dropdown-button ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default']", "xpath");
    }

    public void selecionarAssunto(String value) {
        driver.findElem("//*[text()='" + value + "']", "xpath").click();
    }

    public void inserirNome(String value) {
        driver.sendKeys(value, "name");
    }

    public void inserirEmail(String value) {
        driver.sendKeys(value, "email");
    }

    public void inserirTelefone(String value) {
        driver.sendKeys(value, "phone");
    }

    public void clickContato() throws InterruptedException {
        driver.waitElementToBeClickable("/html/body/lps-root/lps-landing/lps-application-layout/nav-layout-default/lps-contact-us/section/div/div[2]/form/lps-dropdown[2]/div/button", "xpath");
        driver.forceClick("//*[text()='Selecione a forma de contato']", "xpath");
    }

    public void selecionarContato(String value) throws InterruptedException {
        switch (value) {
            case "E-mail":
                driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[1]", "xpath");
                driver.click("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[1]", "xpath");
                break;
            case "Telefone":
                driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[2]", "xpath");
                driver.click("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[2]", "xpath");
                break;
            case "Indiferente":
                driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[3]", "xpath");
                driver.click("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[3]", "xpath");
                break;
        }
    }

    public void inserirMensagem(String value) {
        driver.sendKeys(value, "//*[@class='ng-untouched ng-pristine ng-invalid']", "xpath");
    }

    public void clicarEnviar() {
        driver.waitElementToBeClickable("//*[@class='submit-button__primary submit-button']", "xpath");
        driver.forceClick("//*[@class='submit-button__primary submit-button']", "xpath");
    }
}