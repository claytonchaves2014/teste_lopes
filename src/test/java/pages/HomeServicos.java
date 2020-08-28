package pages;

import org.openqa.selenium.WebElement;
import support.Setup;

public class HomeServicos {

    private Setup driver;

    public HomeServicos(Setup stepDriver) {
        driver = stepDriver;
    }

    public void validarComponente() throws InterruptedException {
        WebElement servicos = driver.findElem("//*[@class='item-card-service']", "xpath");
        driver.ScrollTo(servicos);
        servicos.isDisplayed();
        Thread.sleep(2000);
    }

    public void clicarAnuncieImovel() throws InterruptedException {
        driver.findElem("//*[text()='Anuncie seu imóvel']", "xpath").click();
    }

    public void clicarFinanciamento() {
        driver.findElem("//*[text()='Financiamento']", "xpath").click();
    }

    public void clicarSejaFranqueado() {
        driver.findElem("//*[text()='Seja um franqueado']", "xpath").click();
    }

    public void clicarServFotografia() {
        driver.findElem("//*[text()='Serviços de fotografia']", "xpath").click();
    }
}
