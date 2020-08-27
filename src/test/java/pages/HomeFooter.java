package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class HomeFooter {

    private Setup driver;

    public HomeFooter(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarFooter() throws InterruptedException {
        driver.findElem("/html/body/lps-root/lps-home/div/nav-footer/div/div[2]", "xpath").isDisplayed();
        WebElement footer = driver.findElem("/html/body/lps-root/lps-home/div/nav-footer/div/div[3]", "xpath");
        driver.ScrollTo(footer);
        Thread.sleep(2000);
    }

    public void clicarQuemSomos() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/quem-somos\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/quem-somos\"]/p", "xpath");
    }

    public void clicarAssessoriaComunicacao() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/assessoria-de-comunicacao\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/assessoria-de-comunicacao\"]/p", "xpath");
    }

    public void clicarLinhaEtica() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/linha-de-etica\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/linha-de-etica\"]/p", "xpath");
    }

    public void clicarTrabalheConosco() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/trabalhe-conosco\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/trabalhe-conosco\"]/p", "xpath");
    }

    public void clicarRelacaoInvestidores() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://ri.lopes.com.br/\"]/p", "xpath");
        driver.click("//*[@id=\"linkhttps://ri.lopes.com.br/\"]", "xpath");
    }

    public void clicarVendaImovel() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/anuncie-seu-imovel\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/anuncie-seu-imovel\"]/p", "xpath");
    }

    public void clicarAlugueImovel() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/anuncie-seu-imovel\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/anuncie-seu-imovel\"]/p", "xpath");
    }

    public void clicarCredipronto() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.credipronto.com.br\"]/p", "xpath");
        driver.click("//*[@id=\"linkhttps://www.credipronto.com.br\"]/p", "xpath");
    }

    public void clicarServFotografia() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"link/paginas/servicos-de-fotografia\"]/p", "xpath");
        driver.click("//*[@id=\"link/paginas/servicos-de-fotografia\"]/p", "xpath");
    }

    public void urlRelacaoInv(String value) {
        String href  = driver.getHref("//*[@id=\"linkhttps://ri.lopes.com.br/\"]", "xpath");
        Assert.assertEquals(value, href);
    }

    public void urlCredipronto(String value) {
        String href  = driver.getHref("//*[@id=\"linkhttps://www.credipronto.com.br\"]", "xpath");
        Assert.assertEquals(value, href);
    }
}
