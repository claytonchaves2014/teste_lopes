package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import support.Setup;

public class ResultadoMapa {

    private Setup driver;

    public ResultadoMapa(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarZoom() {
        WebElement zoom = driver.findElem("//*[@class='agm-map-container-inner sebm-google-map-container-inner']", "xpath");
        ((JavascriptExecutor) driver).executeScript("arguments[0].getZoom();", zoom);
    }

    public void clicarAumentarZoom() {
        driver.click("//*[@title='Aumentar o zoom']", "xpath");
    }

    public void verificarCoracao() throws InterruptedException {
        driver.findElem("//img[@src='/assets/svgs/pin_heart_red.svg']", "xpath").isDisplayed();
    }

    public void verificarProntos() {
        driver.findElem("//img[@src='/assets/svgs/pin_circle_gray.svg']", "xpath").isDisplayed();
    }
}
