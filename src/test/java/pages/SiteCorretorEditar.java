package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class SiteCorretorEditar {

    private Setup driver;

    public SiteCorretorEditar(Setup stepDriver) {
        driver = stepDriver;
    }

    public void visualizarBtnEditar() {
        driver.findElem("//a[@class='broker_edit ng-star-inserted']", "xpath").isDisplayed();
    }

    public void clicarBtnEditar() {
        driver.click("//a[@class='broker_edit ng-star-inserted']", "xpath");
    }

    public void visualizarTelPrincipal() {
        driver.findElem("telefone_principal").isDisplayed();
    }

    public void visualizarTelAlternativo() {
        driver.findElem("telefone_alternativo").isDisplayed();
    }

    public  void visualizarTxtWhatsApp(String value) {
        WebElement text = driver.findElem("//p[@class='info_whatsapp']", "xpath");
        Assert.assertEquals(value, text.getText());
    }

    public void visualizarEmail() {
        driver.findElem("email").isDisplayed();
    }

    public void visualizarBiografia() {
        driver.findElem("biografia").isDisplayed();
    }

    public void visualizarBtnCancelar() {
        driver.findElem("//button[@class='btn-cancel']", "xpath").isDisplayed();
    }

    public void visualizarBtnSalvar() {
        driver.findElem("//button[@class='btn-save']", "xpath").isDisplayed();
    }

    public void clicarBtnCancelar() {
        driver.click("//button[@class='btn-cancel']", "xpath");
    }

    public void validarModalFechado() {
        WebElement editar = driver.findElem("//form[@class='edit_form ng-untouched ng-pristine ng-valid']", "xpath");
        Assert.assertNull(editar);
    }

    public void validarPerfilPublico() {
        WebElement editar = driver.findElem("//a[@class='broker_edit ng-star-inserted']", "xpath");
        Assert.assertNull(editar);
    }

    public void inserirTelefonePrincipal(String value) {
        driver.sendKeys(value, "telefone_principal");
    }

    public void clicarBtnSalvar() {
        driver.click("//*[@class='btn-save']", "xpath");
        driver.findElem("//*[@class='btn-save spinner spinner-white']", "xpath").isDisplayed();
    }

    public void inserirTelefoneAlternativo(String value) {
        driver.sendKeys(value, "telefone_alternativo");
    }

    public void msgValidacaoTelPrincipal(String value) {
        WebElement validacao = driver.findElem("//*[@id=\"main_phone\"]/div/app-valid-msg/div", "xpath");
        Assert.assertEquals(value, validacao.getText());
    }

    public void inserirTelPrincipalBranco() {
        driver.click("telefone_principal");
        driver.clearText("telefone_principal");

        driver.click("telefone_alternativo");
    }

    public void msgValidacaoTelAlternativo(String value) {
        WebElement validacao = driver.findElem("//*[@id=\"alternative_phone\"]/div/app-valid-msg/div", "xpath");
        Assert.assertEquals(value, validacao.getText());
    }

    public void inserirTelAlternativoBranco() {
        driver.clearText("telefone_alternativo");
        driver.click("telefone_principal");
    }

    public void dropdownTelPrincipal() {
        driver.click("//*[@id=\"main_phone\"]/div/div/button", "xpath");
    }

    public void selecionarPaisTelPrincipal(String value) {
        switch (value) {
            case "Brasil":
                driver.click("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[1]", "xpath");
                break;
            case "Estados Unidos":
                driver.click("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[2]", "xpath");
                break;
            case "Portugual":
                driver.click("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[3]", "xpath");
                break;
        }
    }

    public void dropdownTelAlternativo() {
        driver.click("//*[@id=\"alternative_phone\"]/div/div/button", "xpath");
    }

    public void selecionarPaisTelAlternativo(String value) {
        switch (value) {
            case "Brasil":
                driver.click("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[1]", "xpath");
                break;
            case "Estados Unidos":
                driver.click("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[2]", "xpath");
                break;
            case "Portugual":
                driver.click("//*[@id=\"cdk-overlay-3\"]/div/div/ul/li[3]", "xpath");
                break;
        }
    }

    public void inserirBiografia(String value) {
        driver.sendKeys(value, "biografia");
    }

    public void validarBiografia(String value) {
        driver.findElem("biografia").getAttribute("maxlength").equals(value);
    }
}
