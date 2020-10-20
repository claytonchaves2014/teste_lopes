package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.List;

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
        driver.forceClick("//*[contains(text(), 'Falar por Chat')]", "xpath");
    }

    public void clicarFalarWhatsApp() {
        driver.forceClick("//*[contains(text(), 'Falar por WhatsApp')]", "xpath");
    }

    public void clicarFalarTelefoneEmail() {
        driver.forceClick("//*[contains(text(), 'Telefone ou e-mail')]", "xpath");
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
        driver.forceClick("//button[@class='button-submit']", "xpath");
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

    public void verificarFalarChat() {
        driver.findElem("//*[contains(text(), 'Falar por Chat')]", "xpath").isDisplayed();
    }

    public void verificarNaoFalarChat() {
        WebElement chat = driver.findElem("//*[contains(text(), 'Falar por Chat')]", "xpath");
        Assert.assertNull(chat);
    }

    public void verificarWhatsApp() {
        driver.findElem("//*[contains(text(), 'Falar por WhatsApp')]", "xpath").isDisplayed();
    }

    public void verificarTelefoneEmail() {
        driver.findElem("//*[contains(text(), 'Telefone ou e-mail')]", "xpath").isDisplayed();
    }

    public void clicarFormaContato() {
        driver.waitElementToBeClickable("//button[@class='dropdown-button ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default']", "xpath");
        driver.forceClick("//button[@class='dropdown-button ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default']", "xpath");
    }

    public void validarFormaContato(String value) {
        WebElement select = driver.findElem("//li[@class='ant-dropdown-menu-item ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.tagName("span"));
        for (WebElement option : options) {
            if (value.equals(option.getText())) {
                option.isDisplayed();
            }
        }
    }

    public void verificarOpcaoChat(String value) {
        WebElement select = driver.findElem("//li[@class='ant-dropdown-menu-item ng-star-inserted']", "xpath");

        List<WebElement> options = select.findElements(By.tagName("span"));
        for (WebElement option : options) {
            if (value.equals(option.getText())) {
                Assert.assertNull(option);
            }
        }
    }

    public void selecionarOpcaoContatoProntos(String value) {
        switch (value) {
            case "Telefone":
                driver.forceClick("//*[@id=\"cdk-overlay-4\"]/div/div/ul/li[1]/span", "xpath");
                break;
            case "Email":
                driver.forceClick("//*[@id=\"cdk-overlay-4\"]/div/div/ul/li[2]/span", "xpath");
                break;
            case "Whatsapp":
                driver.forceClick("//*[@id=\"cdk-overlay-4\"]/div/div/ul/li[3]/span", "xpath");
                break;
        }
    }

    public void selecionarOpcaoContatoAluguel(String value) {
        String url = driver.getCurrentUrl();
        switch (value) {
            case "Telefone":
                if (url.contains("dev")) {
                    driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[1]/span", "xpath");
                }
                if (url.contains("qa")) {
                    driver.forceClick("//*[@id=\"cdk-overlay-4\"]/div/div/ul/li[1]/span", "xpath");
                }
                break;
            case "Email":
                if (url.contains("dev")) {
                    driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[2]/span", "xpath");
                }
                if (url.contains("qa")) {
                    driver.forceClick("//*[@id=\"cdk-overlay-4\"]/div/div/ul/li[2]/span", "xpath");
                }
                break;
            case "Whatsapp":
                if (url.contains("dev")) {
                    driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[3]/span", "xpath");
                }
                if (url.contains("qa")) {
                    driver.forceClick("//*[@id=\"cdk-overlay-4\"]/div/div/ul/li[3]/span", "xpath");
                }
                break;
        }
    }

    public void selecionarOpcaoContatoLancamentos(String value) {
        switch (value) {
            case "Telefone":
                driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[1]/span", "xpath");
                break;
            case "Email":
                driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[2]/span", "xpath");
                break;
            case "Whatsapp":
                driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[3]/span", "xpath");
                break;
            case "Chat":
                driver.forceClick("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[4]/span", "xpath");
                break;
        }
    }
}
