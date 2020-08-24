package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class ResultadosBusca {

    private Setup driver;

    public ResultadosBusca(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarSemResultado(String value) {
        WebElement resultado = driver.findElem("/html/body/lps-root/lps-search/div/div/div[1]/lps-search-grid/lps-search-content/div/perfect-scrollbar/div/div[1]/div[2]/lps-empty-search/div/div[1]/h2[2]", "xpath");
        Assert.assertEquals(value, resultado.getText());
    }
}
