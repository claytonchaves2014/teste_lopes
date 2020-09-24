package pages;

import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.ArrayList;

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
        String url = driver.getCurrentUrl();

        if (url.contains("qa")) {
            driver.findElem("//*[text()='Serviços de fotografia']", "xpath").click();
        }

        else {
            System.out.println("Não aplicável em DEV");
        }
    }

    public void clicarConsorcio() {
        driver.findElem("//*[text()='Consórcio Lopes']", "xpath").click();
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchWin("2");
    }
}
