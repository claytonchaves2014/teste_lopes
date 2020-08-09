package PageObjects.portal;

import Ultilitarios.Uteis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Commons.driver;

public class FichaDoImovel {


    public static void validaTituloDoImovel(String titulo) {
        WebElement imovel = driver.findElement(By.xpath("/html/body/lps-root/lps-product-layout/nav-layout-default/lps-product/div[1]/div[1]/div[1]/div[1]/div[1]/div/lps-h1/h1"));
        String tituloImovel = imovel.getText();
        Uteis.assert_equals(tituloImovel, titulo);
    }

}

