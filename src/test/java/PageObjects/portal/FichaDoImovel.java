package PageObjects.portal;

import Ultilitarios.Uteis;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Commons.driver;

public class FichaDoImovel {


    public static void validaTituloDoImovel(String titulo) {
        WebElement imovel = driver.findElement(By.cssSelector("body > lps-root > lps-product-layout > nav-layout-default > lps-product > div.product > div.product__content > div.product__content-details > div.container > div.product__info > lps-h1 > h1"));
        String tituloImovel = imovel.getText();
        Uteis.assert_equals(tituloImovel, titulo);
    }

}

