package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.List;

public class SiteCorretorCabecalho {

    private Setup driver;

    public SiteCorretorCabecalho(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarCabecalho() {
        driver.waitElement("//div[@class='broker_header']", "xpath");
        driver.findElem("//div[@class='broker_header']", "xpath").isDisplayed();
    }

    public void verificarFoto() {
        driver.findElem("//img[@class='pfl-img']", "xpath").isDisplayed();
    }

    public void verificarApelido(String value) {
        WebElement apelido = driver.findElem("//h3[@class='title-section']", "xpath");
        Assert.assertEquals(value, apelido.getText());
    }

    public void verificarNomeCompleto(String value) {
        WebElement nome = driver.findElem("//h5[@class='subtitle-section']", "xpath");
        Assert.assertEquals(value, nome.getText());
    }

    public void verificarTitulo(String value) {
        WebElement titulo = driver.findElem("//div[@class='broker_job']", "xpath");
        Assert.assertEquals(value, titulo.getText());
    }

    public void verificarCRECI(String value) {
        WebElement elemento = driver.findElem("//div[@class='broker_creci ng-star-inserted']", "xpath");
        String creci = elemento.getText();
        Assert.assertTrue(creci.contains(value));
    }

    public void verificarDescricao(String value) {
        WebElement descricao = driver.findElem("//p[@class='broker_bio']", "xpath");
        Assert.assertEquals(value, descricao.getText());
    }

    public void verificarBtnEntrarContato() {
        driver.findElem("//button[@class='btn-base btn-outline-lopes']", "xpath").isDisplayed();
    }

    public void verificarBtnWhatsApp() {
        driver.findElem("//button[@class='btn-base btn-lopes']", "xpath").isDisplayed();
    }

    public void clicarBtnEntrarContato() {
        driver.click("//button[@class='btn-base btn-outline-lopes']", "xpath");
    }

    public void inserirTelefone(String value) {
        driver.sendKeys(value, "telefone", "id");
        driver.findElem("telefone", "id").sendKeys(Keys.TAB);
    }

    public void selecionarFormaContato(String value) {
        WebElement select = driver.findElem("//ul[@class='ant-dropdown-menu ant-dropdown-menu-root ant-dropdown-menu-light ant-dropdown-menu-vertical']", "xpath");
        List<WebElement> options = select.findElements(By.tagName("li"));

        for (WebElement option : options) {
            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void clicarBtnEnviar() {
        driver.forceClick("//button[@class='btn-base btn-lopes ng-star-inserted']", "xpath");
    }

    public void clicarWhatsapp() {
        driver.click("//button[@class='btn-base btn-lopes']", "xpath");
    }

    public void inserirBrancoNome() {
        driver.findElem("nome").sendKeys(Keys.TAB);
    }

    public void inserirBrancoEmail() {
        driver.findElem("e-mail").sendKeys(Keys.TAB);
    }

    public void inserirBrancoTelefone() {
        driver.findElem("telefone").sendKeys(Keys.TAB);
    }

    public void inserirBrancoFormaContato() throws InterruptedException {
        driver.forceClick("//button[@class='dropdown-button ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default']", "xpath");
        driver.click("nome", "id");
    }

    public void validacaoNome(String value) {
        WebElement nome = driver.findElem("/html/body/app-root/div/app-broker-profile/div/app-broker-header/div[2]/div/app-lead-form/form/div[2]/app-input-text/div/app-valid-msg/div", "xpath");
        Assert.assertEquals(value, nome.getText());
    }

    public void validacaoEmail(String value) {
        WebElement nome = driver.findElem("/html/body/app-root/div/app-broker-profile/div/app-broker-header/div[2]/div/app-lead-form/form/div[2]/div/app-input-text[1]/div/app-valid-msg/div", "xpath");
        Assert.assertEquals(value, nome.getText());
    }

    public void validacaoTelefone(String value) {
        WebElement nome = driver.findElem("/html/body/app-root/div/app-broker-profile/div/app-broker-header/div[2]/div/app-lead-form/form/div[2]/div/app-input-text[2]/div/app-valid-msg/div", "xpath");
        Assert.assertEquals(value, nome.getText());
    }

    public void validacaoFormaContato(String value) {
        WebElement nome = driver.findElem("/html/body/app-root/div/app-broker-profile/div/app-broker-header/div[2]/div/app-lead-form/form/div[2]/app-dropdown-select/div/app-valid-msg/div", "xpath");
        Assert.assertEquals(value, nome.getText());
    }
}
