package stepDefinitions;

import io.cucumber.java.pt.Então;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import stepDefinitions.Commons;

import static PageObjects.portal.FichaDoImovel.validaTituloDoImovel;
import static stepDefinitions.Commons.driver;

public class FichaDoImovel {

    @Então("sou direcionado para a página do empreendimento {string}")
    public void sou_direcionado_para_a_página_do_empreendimento(String titulo) {
        validaTituloDoImovel(titulo);
    }
}
