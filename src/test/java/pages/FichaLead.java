package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class FichaLead {

    private Setup driver;

    public FichaLead(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarFormulario() {
        driver.findElem("//*[@class='lead-box']", "xpath").isDisplayed();
    }

    public void clicarFalarChat() {
        driver.waitElementToBeClickable("//*[@id=\"web\"]/div[1]/div[2]/button[1]", "xpath");
        driver.forceClick("//*[@id=\"web\"]/div[1]/div[2]/button[1]", "xpath");
    }

    public void clicarFalarWhatsApp() {
        driver.forceClick("//*[@id=\"web\"]/div[1]/div[2]/button[2]", "xpath");
    }

    public void clicarFalarTelefoneEmail() {
        driver.forceClick("//*[@id=\"web\"]/div[1]/div[2]/button[3]", "xpath");
    }

    public void inserirNome(String value) {
        driver.sendKeys(value, "nome");
    }

    public void inserirEmail(String value) {
        driver.sendKeys(value, "e-mail");
    }

    public void inserirCelular(String value) {
        driver.sendKeys(value, "celular");
    }

    public void clicarFalarCorretor() {
        driver.forceClick("//*[@id=\"web\"]/div[1]/form/div/button", "xpath");
    }

    public void verificarEnvio(String value) {
        WebElement mensagem = driver.findElem("//*[@class='success-txt']", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }

    public void selecionarTelefone() {
        driver.forceClick("//*[@id=\"web\"]/div[1]/form/div/div[2]/nz-radio-group/label[1]/span[2]", "xpath");
    }

    public void selecionarEmail() {
        driver.forceClick("//*[@id=\"web\"]/div[1]/form/div/div[2]/nz-radio-group/label[2]/span[2]", "xpath");
    }

    public void clicarFalarEspecialista() {
        driver.forceClick("//*[@class='btn-item btn-tel_email mb-3 mt-3']", "xpath");
    }
}