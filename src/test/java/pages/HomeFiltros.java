package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class HomeFiltros {

    private Setup driver;

    public HomeFiltros(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarFiltros() {
        driver.click("//*[@class='filter_btn ant-btn ant-btn-link']", "xpath");
    }

    public void inserirValorMin(String value) {
        driver.sendKeys(value, "minValue");
    }

    public void inserirValorMax(String value) {
        driver.sendKeys(value, "maxValue");
    }

    public void inserirAreaMin(String value) {
        driver.sendKeys(value,"minArea");
    }

    public void inserirAreaMax(String value) {
        driver.sendKeys(value, "maxArea");
    }

    public void selecionarBanheiro(String value) {
        switch (value) {
            case "1":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[3]/lib-multi-selection/div/button[1]/span", "xpath");
                break;
            case "2":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[3]/lib-multi-selection/div/button[2]/span", "xpath");
                break;
            case "3":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[3]/lib-multi-selection/div/button[3]/span", "xpath");
                break;
            case "4+":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[3]/lib-multi-selection/div/button[4]/span", "xpath");
                break;
        }
    }

    public void selecionarVaga(String value) {
        switch (value) {
            case "1":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[4]/lib-multi-selection/div/button[1]/span", "xpath");
                break;
            case "2":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[4]/lib-multi-selection/div/button[2]/span", "xpath");
                break;
            case "3":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[4]/lib-multi-selection/div/button[3]/span", "xpath");
                break;
            case "4+":
                driver.click("/html/body/lps-root/lps-home/div/lps-info-home/div[1]/div[1]/lps-searchbox/lps-search/div[1]/lib-accordion/div/div[1]/div[4]/lib-multi-selection/div/button[4]/span", "xpath");
                break;
        }
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
