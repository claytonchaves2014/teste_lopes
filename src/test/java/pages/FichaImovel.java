package pages;

import org.junit.Assert;
import support.Setup;

public class FichaImovel {

    private Setup driver;

    public FichaImovel(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarFicha(String value) {
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains(value));
    }

    public void aguardarFicha() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[1]/div[1]/div[1]", "xpath").isDisplayed();
    }
}
