package PageObjects.portal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import stepDefinitions.Commons;

import static stepDefinitions.Commons.driver;

public class ResultadoBusca {


    public static String getFiltro() {
        WebElement btn_filtro1 = driver.findElement(By.xpath("//body//lps-search-bar//button[1]"));
        String tipoFiltro = btn_filtro1.getText();
        return tipoFiltro;
    }

}