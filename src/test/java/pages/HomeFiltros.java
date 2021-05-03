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

    public void clicarFiltros() {
        driver.click(".filter_btn", "css");
    }

    public void inserirValorMin(String value) {
        driver.sendKeys(value, "minValue");
    }

    public void inserirValorMax(String value) {
        driver.sendKeys(value, "maxValue");
        driver.click("minArea");
    }

    public void inserirAreaMin(String value) {
        driver.sendKeys(value,"minArea");
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
}
