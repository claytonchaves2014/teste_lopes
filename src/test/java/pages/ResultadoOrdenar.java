package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class ResultadoOrdenar {

    private Setup driver;

    public ResultadoOrdenar(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarOrdenar() throws InterruptedException {
        driver.waitElement("//*[@class='search-content__summary']", "xpath");
        driver.click("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/lps-search-order/button", "xpath");
        Thread.sleep(2000);
        // driver.click(".cdk-overlay-backdrop","css");
     //   driver.click("//button[contains(.,'Ordenar')]","css");
    }

    public void verificarOrdem(String value) {
        WebElement elemento = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[1]/div/lps-search-order/button/span[1]", "xpath");
        String ordem = elemento.getText();
        Assert.assertEquals(value, ordem);
    }

    public void clicarRelevancia() throws InterruptedException {
        driver.click("//*[text()=' Relevância ']", "xpath");
        Thread.sleep(1000);
    }

    public void clicarMenorValor() throws InterruptedException {
     //   driver.click("//*[text()=' Menor valor ']", "xpath");
          driver.click("//span[contains(.,' Menor valor')]", "xpath");
        Thread.sleep(1000);
    }

    public void clicarMaiorValor() throws InterruptedException {
       // driver.click("//*[text()=' Maior valor ']", "xpath");
        driver.click("//span[contains(.,' Maior valor')]", "xpath");
        Thread.sleep(1000);
    }

    public void clicarDataAtualizacao() throws InterruptedException {
        driver.click("//*[text()=' Data de atualização ']", "xpath");
        Thread.sleep(1000);
    }



    public void clicarAreaImovel() throws InterruptedException {
        driver.forceClick("//*[text()=' Área do imóvel ']", "xpath");
        Thread.sleep(1000);
    }

    //public void vejoRelevancia() {driver.findElem("//*[text()=' Relevância ']", "xpath").isDisplayed();
    //}

    public void vejoMenorValor() throws InterruptedException {
        driver.findElem("//*[@id=\"cdk-overlay-2\"]/div/div/div/nz-radio-group/label[2]/span[2]", "xpath").isDisplayed();
        Thread.sleep(1000);


    }

    public void vejoMaiorValor() throws InterruptedException {
        driver.findElem("#cdk-overlay-2 > div > div > div > nz-radio-group > label.ant-radio-wrapper.ant-dropdown-menu-item.ng-star-inserted.ant-radio-wrapper-checked > span:nth-child(2)", "xpath").isDisplayed();
        Thread.sleep(1000);
    }

    public void vejoDataAtualizacao() throws InterruptedException {
        driver.findElem("//*[@id=\"cdk-overlay-2\"]/div/div/div/nz-radio-group/label[4]/span[2]", "xpath").isDisplayed();
        Thread.sleep(1000);
    }

    public void vejoAreaImovel() throws InterruptedException {
        driver.findElem("//*[@id=\"cdk-overlay-2\"]/div/div/div/nz-radio-group/label[5]/span[2]","css").isDisplayed();
        Thread.sleep(1000);
    }
}
