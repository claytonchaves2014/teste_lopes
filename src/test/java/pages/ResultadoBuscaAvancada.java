package pages;

import support.Setup;

public class ResultadoBuscaAvancada {

    private Setup driver;

    public ResultadoBuscaAvancada(Setup stepDriver) {
        driver = stepDriver;
    }

    public void inserirBusca(String value) {
        driver.waitElement("//*[@class='search-content__summary']", "xpath");
        driver.sendKeys(value, "search-input");
    }

    public void selecionarBusca(String value) {
      //  driver.waitElement("//*[@class='search-input__dropdown']", "xpath");
        driver.waitElement("search-input", "id");
        driver.findElem("//*[text()='" + value + "']", "xpath").click();
    }
}
