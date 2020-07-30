package PageObjects.portal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import stepDefinitions.Commons;

import static stepDefinitions.Commons.driver;

public class ResultadoBusca {


    public static void getFiltro() {
        WebElement btn_filtro1 = driver.findElement(By.className("mr-3 operation-btn ant-btn ant-dropdown-trigger ant-btn-default ant-btn-sm"));
        String tipoFiltro = btn_filtro1.getText();
    }

}