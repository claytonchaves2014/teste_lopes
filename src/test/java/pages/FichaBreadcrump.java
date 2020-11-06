package pages;

import org.junit.Assert;
import support.Setup;

public class FichaBreadcrump {

    private Setup driver;

    public FichaBreadcrump(Setup stepDriver) {
        driver = stepDriver;
    }

    public void clicarBreadcrump() {
        driver.forceClick("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[2]/button", "xpath");
    }

    public void verificarDetalhes() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[6]", "xpath").isDisplayed();
    }

    public void verificarRua() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[5]", "xpath").isDisplayed();
    }

    public void verificarBairro() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[4]", "xpath").isDisplayed();
    }

    public void verificarTipo() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[3]", "xpath").isDisplayed();
    }

    public void verificarHome() {
        driver.findElem("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[1]", "xpath").isDisplayed();
    }

    public void clicarRua() {
        driver.forceClick("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[5]/a", "xpath");
    }

    public void clicarBairro() {
        driver.forceClick("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[4]/a", "xpath");
    }

    public void clicarTipo() {
        driver.forceClick("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[3]/a", "xpath");
    }

    public void clicarHome() {
        driver.forceClick("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[2]/lps-breadcrumb/div/ul/li[1]/a", "xpath");
    }

    public void validarRua(String value) {
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("/rua-")) {
            Assert.assertTrue(currentUrl.contains("/rua-"));
        }
        if (currentUrl.contains("/alameda-")) {
            Assert.assertTrue(currentUrl.contains("/alameda-"));
        }
        if (currentUrl.contains("/avenida-")) {
            Assert.assertTrue(currentUrl.contains("/avenida-"));
        }
        else {
            Assert.fail();
        }
    }
}
