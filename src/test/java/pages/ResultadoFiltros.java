package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.List;

public class ResultadoFiltros {

    private Setup driver;

    public ResultadoFiltros(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarFiltros() {
        driver.waitElement("//*[@class='filter-btn ant-btn ant-dropdown-trigger nz-animate-disabled ng-star-inserted ant-btn-default ant-btn-sm']","xpath");
        driver.click("//*[@class='filter-btn ant-btn ant-dropdown-trigger nz-animate-disabled ng-star-inserted ant-btn-default ant-btn-sm']","xpath");
    }

    public void clicarAplicarFiltros() {
        driver.forceClick("//*[contains(text(), 'Aplicar os filtros selecionados')]", "xpath");
    }

    public void clicarTipoImovel() {
        driver.click("//*[@class='ant-collapse-header ng-tns-c80-6']", "xpath");
    }

    public void clicarCaracteristicasImovel() {
        driver.click("//*[@class='ant-collapse-header ng-tns-c80-7']", "xpath");
    }

    public void clicarArea() {
        driver.click("//*[@class='ant-collapse-header ng-tns-c80-8']", "xpath");
    }

    public void clicarValor() {
        driver.click("//*[@class='ant-collapse-header ng-tns-c80-9']", "xpath");
    }

    public void clicarOutrosFiltros() {
        driver.click("//*[@class='ant-collapse-header ng-tns-c80-10']", "xpath");
    }

    public void selecionarTipoCasa(String value) throws InterruptedException {
        driver.waitElement("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[1]/div/div[2]", "xpath");
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[1]/div/div[2]", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void selecionarTipoApartamento(String value) {
        driver.waitElement("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[2]/div/div[2]", "xpath");
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[2]/div/div[2]", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void selecionarTipoFlat(String value) {
        driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[3]/div/div[2]/div/label", "xpath");
        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[3]/div/div[2]/div/label", "xpath");
    }

    public void selecionarTipoGalpao(String value) {
        driver.waitElement("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[4]/div/div[2]", "xpath");
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[4]/div/div[2]", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void selecionarTipoHotel() {
        driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[5]/div/div[2]/div/label", "xpath");
        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[5]/div/div[2]/div/label", "xpath");
    }

    public void selecionarTipoLajesCorporativas() {
        driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[6]/div/div[2]/div/label", "xpath");
        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[6]/div/div[2]/div/label", "xpath");
    }

    public void selecionarTipoLoteamento() {
        driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[7]/div/div[2]/div/label", "xpath");
        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[7]/div/div[2]/div/label", "xpath");
    }

    public void selecionarTipoMall(String value) {
        driver.waitElement("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[8]/div/div[2]", "xpath");
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[8]/div/div[2]", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void selecionarTipoRural(String value) {
        driver.waitElement("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[9]/div/div[2]", "xpath");
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[9]/div/div[2]", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void selecionarTipoSalao() {
        driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[10]/div/div[2]/div/label", "xpath");
        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[10]/div/div[2]/div/label", "xpath");
    }

    public void selecionarTipoSalas(String value) {
        driver.waitElement("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[11]/div/div[2]", "xpath");
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[11]/div/div[2]", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }

    public void selecionarTipoTerreno() {
        driver.waitElementToBeClickable("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[12]/div/div[2]/div/label", "xpath");
        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[2]/div[2]/div/div/lps-property-type-filter/form/div/lps-checkbox-list[12]/div/div[2]/div/label", "xpath");
    }

    public void selecionarCaracteristicas(String qtd, String tipo) {
        switch (tipo) {
            case "Dormitórios":
                switch (qtd){
                    case "1":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[1]/div[2]/lib-multi-selection/div/button[1]/span", "xpath");
                        break;
                    case "2":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[1]/div[2]/lib-multi-selection/div/button[2]/span", "xpath");
                        break;
                    case "3":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[1]/div[2]/lib-multi-selection/div/button[3]/span", "xpath");
                        break;
                    case "4+":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[1]/div[2]/lib-multi-selection/div/button[4]/span", "xpath");
                        break;
                }
                break;

            case "Vagas":
                switch (qtd){
                    case "1":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[2]/div[2]/lib-multi-selection/div/button[1]/span", "xpath");
                        break;
                    case "2":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[2]/div[2]/lib-multi-selection/div/button[2]/span", "xpath");
                        break;
                    case "3":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[2]/div[2]/lib-multi-selection/div/button[3]/span", "xpath");
                        break;
                    case "4+":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[2]/div[2]/lib-multi-selection/div/button[4]/span", "xpath");
                        break;
                }
                break;
            case "Suítes":
                switch (qtd){
                    case "1":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[3]/div[2]/lib-multi-selection/div/button[1]/span", "xpath");
                        break;
                    case "2":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[3]/div[2]/lib-multi-selection/div/button[2]/span", "xpath");
                        break;
                    case "3":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[3]/div[2]/lib-multi-selection/div/button[3]/span", "xpath");
                        break;
                    case "4+":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[3]/div[2]/lib-multi-selection/div/button[4]/span", "xpath");
                        break;
                }
                break;
            case "Banheiros":
                switch (qtd){
                    case "1":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[4]/div[2]/lib-multi-selection/div/button[1]/span", "xpath");
                        break;
                    case "2":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[4]/div[2]/lib-multi-selection/div/button[2]/span", "xpath");
                        break;
                    case "3":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[4]/div[2]/lib-multi-selection/div/button[3]/span", "xpath");
                        break;
                    case "4+":
                        driver.click("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[3]/div[2]/div/div/lps-characteristics-type-filter/div/div[4]/div[2]/lib-multi-selection/div/button[4]/span", "xpath");
                        break;
                }
                break;
        }
    }

    public void inserirAreaMinima(String value) {
        driver.sendKeys(value, "minArea");
    }

    public void inserirAreaMaxima(String value) {
        driver.sendKeys(value, "maxArea");
        driver.click("minArea");
    }

    public void inserirValorMinimo(String value) {
        driver.sendKeys(value, "minValue");
    }

    public void inserirValorMaximo(String value) {
        driver.sendKeys(value, "maxValue");
        driver.click("minValue");
    }

    public void selecionarOutrosFiltros(String value) {
        WebElement select = driver.findElem("//*[@id=\"cdk-overlay-1\"]/div/div/div/lps-search-filter/div/div/div/nz-collapse/div/nz-collapse-panel[6]/div[2]/div/div/lps-more-type-filter/form/div", "xpath");

        List<WebElement> options = select.findElements(By.tagName("label"));
        for (WebElement option : options) {

            if(value.equals(option.getText())) {
                option.click();
            }
        }
    }
}
