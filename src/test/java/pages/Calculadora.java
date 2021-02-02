package pages;

import support.Setup;

public class Calculadora {

    private Setup driver;

    public Calculadora(Setup stepDriver) {
        driver = stepDriver;
    }

    public void addRendaFamiliar(String value) {
        driver.sendKeys(value, "moneyAmount");
    }

    public void addEntrada(String value) {
        driver.sendKeys(value, "downPayment");
    }

    public void addFGTS(String value) {
        driver.sendKeys(value, "fgts");
    }

    public void clicarCalcular() {
        driver.forceClick("//button[@class='submit-button__primary submit-button']", "xpath");
    }

    public void clicarImoveisProntos() {
        driver.forceClick("//div[@class='tab-switcher__tab ng-star-inserted']", "xpath");
    }

    public void verificarFormulario() {
        driver.findElem("//div[@class='concierge-lead']", "xpath").isDisplayed();
    }

    public void inserirNome(String value) {
        driver.sendKeys(value, "name");
    }

    public void inserirEstado(String value) throws InterruptedException {
        driver.forceClick("state");
//        WebElement select = driver.findElem("//ul[@class='ant-select-dropdown-menu ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']", "xpath");
//
//        List<WebElement> options = select.findElements(By.tagName("li"));
//
//       for (WebElement option : options) {
//            if (value.equals(option.getText())) {
//                option.click();
//                driver.forceClick("state");
//            }
//        }

//        driver.sendKeys(value, "state");
        driver.forceClick("//*[@id=\"cdk-overlay-1\"]/div/div/ul/li[1]", "xpath");
    }

    public void inserirCidade(String value) {
        driver.forceClick("city");
        driver.forceClick("//*[@id=\"cdk-overlay-2\"]/div/div/ul/li[22]", "xpath");
    }

    public void inserirTelefone(String value) {
        driver.sendKeys(value, "phone");
    }

    public void inserirEmail(String value) {
        driver.sendKeys(value, "email");
    }

    public void selecionarContato(String value) {
        switch (value) {
            case "Whatsapp":
                driver.forceClick("/html/body/lps-root/lps-calculator/lps-application-layout/nav-layout-default/div/div[2]/div/div[2]/div/lps-secondary-market-lead-form/lps-concierge-lead-form/div/form/nz-radio-group/label[1]", "xpath");
                break;
            case "E-mail":
                driver.forceClick("/html/body/lps-root/lps-calculator/lps-application-layout/nav-layout-default/div/div[2]/div/div[2]/div/lps-secondary-market-lead-form/lps-concierge-lead-form/div/form/nz-radio-group/label[2]", "xpath");
                break;
        }
    }

    public void clicarReceberSugestao() {
        driver.forceClick("//button[@class='submit-button__secondary submit-button']", "xpath");
    }

    public void verificarMensagem(String value) {
        driver.findElem("//p[@class='product-search__dropdown__title']", "xpath").isDisplayed();
    }

    public void clicarProcurarImoveis() {
        driver.forceClick("//*[@id=\"product-search\"]/div/form/div[3]/lps-submit-button/button", "xpath");
    }

    public void clicarCalcularParcelas() {
        driver.forceClick("/html/body/lps-root/lps-calculator/lps-application-layout/nav-layout-default/div/div[2]/form/lps-radio-card-group/div/div[2]/label/div[2]/div", "xpath");
    }
}
