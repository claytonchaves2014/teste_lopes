package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.Setup;

public class HomeFiltros {

    private Setup driver;

    public HomeFiltros(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarFiltros() throws InterruptedException {
        driver.click(".filter-btn", "css");

    }

    public void clicarFiltrarValorEmCompra() throws InterruptedException {
        driver.click(".ng-tns-c80-9 > .ant-collapse-header", "css");
        Thread.sleep(2000);
    }

    public void clicarFiltrarValorEmAluguel() throws InterruptedException {
        driver.click(".ng-tns-c80-8 > .ant-collapse-header", "css");
        Thread.sleep(2000);
    }

    public void clicarFiltrarValorEmLancamento() throws InterruptedException {
        driver.click(".anticon > .ng-tns-c80-8", "css");
        Thread.sleep(2000);
    }


    public void clicarFiltrarValor() throws InterruptedException {
        driver.click(".anticon > .ng-tns-c80-8", "css");
        Thread.sleep(2000);
    }

    public void clicoCheckBoxAluguel() throws InterruptedException {
        driver.click("//label[2]/span/input", "xpath");
        Thread.sleep(2000);
    }

    public void clicoBtnAplicar() throws InterruptedException {
        driver.click(".value-type-filter > .btn-extra", "css");
        Thread.sleep(2000);
    }

    public void clicoBtnOrdenar() throws InterruptedException {
        driver.click(".cdk-overlay-backdrop", "css");
        driver.click("//button[contains(.,'Ordenar')]", "xpath");
        Thread.sleep(2000);
    }

    public void inserirValorMin(String value) throws InterruptedException {
        driver.sendKeys(value, "minValue");
        Thread.sleep(3000);
    }

    public void inserirValorMax(String value) throws InterruptedException {
        driver.sendKeys(value, "maxValue");
        //     driver.click("minArea");
        Thread.sleep(3000);
    }

    public void inserirAreaMin(String value) {
        driver.sendKeys(value, "minArea");
    }

    public void inserirAreaMax(String value) {
        driver.sendKeys(value, "maxArea");
        driver.click("maxValue");
    }

    public void selecionarBanheiro(String value) {
        value = String.valueOf(Integer.valueOf(value) + 1);
        driver.click("lps-home lps-searchbox .searchbox__filtersrow > div:nth-child(3) button:nth-child(" + value + ") span", "css");
    }

    public void selecionarVaga(String value) {
        value = String.valueOf(Integer.valueOf(value) + 1);
        driver.click("lps-home lps-searchbox .searchbox__filtersrow > div:nth-child(4) button:nth-child(" + value + ") span", "css");
    }

    public void validarAlertaValor(String value) {
        driver.click("minArea");
        WebElement alerta = driver.findElem("//*[@class='text-danger']", "xpath");
        Assert.assertEquals(value, alerta.getText());
    }

    public void validarAlertaArea(String value) {
        driver.click("maxValue");
        WebElement alerta = driver.findElem("//*[@class='text-danger']", "xpath");
        Assert.assertEquals(value, alerta.getText());
    }


    public void clicarLimparFiltros() {
        driver.forceClick("//*[@class='searchbox__clearbtn']", "xpath");
    }

    public void ValorTotalSelecionado() {
        driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[5]/div[2]/div/lps-value-type-filter/div[2]/nz-radio-group/label[1]/span[1]", "xpath").isDisplayed();
        ;
    }

    public void vejoCheckBoxAluguel() {

        driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[5]/div[2]/div/lps-value-type-filter/div[2]/nz-radio-group/label[2]/span[2]", "xpath").isDisplayed();
    }

    public void vejoValorMinimo() {

        driver.findElem("//*[text()=' minValue  ']", "xpath").isDisplayed();
    }

    public void vejoValorMaximo() {

        driver.findElem("//*[text()=' maxValue  ']", "xpath").isDisplayed();
    }
}
