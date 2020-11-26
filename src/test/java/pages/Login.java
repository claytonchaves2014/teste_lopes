package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class Login {

    private Setup driver;

    public Login(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarMinhaConta() {
        driver.click("//*[@class='header__login__text']", "xpath");
    }

    public void inserirEmail(String value) {
        driver.sendKeys(value, "username");
    }

    public void inserirSenha(String value) {
        driver.sendKeys(value, "password");
    }

    public void clicarEntrar() throws InterruptedException {
        driver.waitElement("//button[@class='button-submit button-submit__primary']", "xpath");
        driver.forceClick("//button[@class='button-submit button-submit__primary']", "xpath");
        driver.findElem("widget-container-sm").isDisplayed();
    }

    public void verificarProfile() {
        driver.findElem("user-menu-profile-no-pic", "id").isDisplayed();
    }

    public void validarLoginInvalido(String value) {
        WebElement mensagem = driver.findElem("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/nav-modal/div/div/div/nav-login-layout/div/div[1]/div[2]/nav-login-wrapper/div/nav-login-credentials/div/form/div[1]/span", "xpath");
        Assert.assertEquals(value, mensagem.getText());
    }

    public void clicarEsqueceuSenha() {
        driver.click("//*[@class='link--tertiary']", "xpath");
    }

    public void inserirValidarEmail(String value) {
        driver.sendKeys(value, "email");
    }

    public void clicarEnviar() {
        driver.click("//*[@class='button-submit button-submit__primary']", "xpath");
    }

    public void validarInstrucoes(String value) {
        WebElement instrucoes = driver.findElem("//*[@class='sub-title forgot-password__sub-title__text ng-star-inserted']", "xpath");
        Assert.assertEquals(value, instrucoes.getText());
    }

    public void clicarCorretor() {
        driver.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/nav-modal/div/div/div/nav-login-layout/div/div[1]/div[1]/nav-tabs/div/div[2]/span", "xpath");
    }

    public void inserirCPFCorretor(String value) {
        driver.sendKeys(value, "username");
    }

    public void inserirSenhaCorretor(String value) {
        driver.sendKeys(value, "password");
    }

    public void validarContaCorretor() {
        driver.findElem("widget-container-sm", "id").isDisplayed();
    }

    public void validarAcessoCorretor(String value) {
        driver.waitURL(value);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains(value));
    }

    public void validarAplicacoes() throws InterruptedException {
        driver.wait(3000);
//        driver.waitElement("//*[@class='main-welcome']", "xpath");
//        driver.findElem("menu-handler", "id").isDisplayed();
    }

    public void clicarAplicacoes() {
        driver.findElem("user-menu-profile-no-pic", "id").isDisplayed();
//        driver.waitElementToBeClickable("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/nav-sub-header/div/div/button","xpath");
        driver.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/nav-sub-header/div/div/button", "xpath");
    }

    public void clicarCMS() {
        driver.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/nav-sidemenu/nav/div[2]/div/div[1]", "xpath");
    }

    public void clicarBI() {
        driver.click("/html/body/lps-root/lps-home/div/lps-header-layout/nav-header/nav-sidemenu/nav/div[2]/div/div[2]", "xpath");
    }

    public void validarCRM(String value) {
        driver.waitElement("/html/body/app-root/div/nav-header/nav-sidemenu/nav/div[2]/div/div/h2", "xpath");
        WebElement crm = driver.findElem("/html/body/app-root/div/nav-header/nav-sidemenu/nav/div[2]/div/div/h2", "xpath");
        Assert.assertEquals(value, crm.getText());
    }

    public void clicarAplicacoesAgentes() {
        driver.findElem("user-menu-profile-no-pic", "id").isDisplayed();
        driver.click("/html/body/app-root/div/nav-header/nav-sub-header/div/div/button", "xpath");
    }
}
