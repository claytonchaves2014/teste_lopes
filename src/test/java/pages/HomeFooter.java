package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

import java.util.ArrayList;

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
        driver.waitElementToBeClickable("//*[@id=\"linkpaginas/quem-somos\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkpaginas/quem-somos\"]/p", "xpath");
    }

    public void clicarAssessoriaImprensa() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkpaginas/assessoria-de-imprensa\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkpaginas/assessoria-de-imprensa\"]/p", "xpath");
    }

    public void clicarLinhaEtica() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkpaginas/linha-de-etica\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkpaginas/linha-de-etica\"]/p", "xpath");
    }

    public void clicarTrabalheConosco() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkpaginas/trabalhe-conosco\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkpaginas/trabalhe-conosco\"]/p", "xpath");
    }

    public void clicarRelacaoInvestidores() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://ri.lopes.com.br/\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://ri.lopes.com.br/\"]", "xpath");
    }

    public void clicarVendaImovel() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkpaginas/anuncie-seu-imovel\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkpaginas/anuncie-seu-imovel\"]/p", "xpath");
    }

    public void clicarAlugueImovel() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkpaginas/anuncie-seu-imovel\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkpaginas/anuncie-seu-imovel\"]/p", "xpath");
    }

    public void clicarCredipronto() throws InterruptedException {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.credipronto.com.br\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.credipronto.com.br\"]/p", "xpath");
    }

    public void clicarServFotografia() throws InterruptedException {
        String url = driver.getCurrentUrl();

        if(url.contains("qa")) {
            driver.waitElementToBeClickable("//*[@id=\"link/paginas/servicos-de-fotografia\"]/p", "xpath");
            driver.forceClick("//*[@id=\"link/paginas/servicos-de-fotografia\"]/p", "xpath");
        }
        else {
            System.out.println("Não aplicável em DEV");
        }
    }

    public void clicarFacebook() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.facebook.com/imobiliaria.lopes\"]/div/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.facebook.com/imobiliaria.lopes\"]/div/p", "xpath");
    }

    public void trocarJanela() {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchWin("2");
    }

    public void clicarTwitter() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.twitter.com/Lopes_Imoveis\"]/div/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.twitter.com/Lopes_Imoveis\"]/div/p", "xpath");
    }

    public void clicarInstagram() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.instagram.com/lopesimoveis/\"]/div/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.instagram.com/lopesimoveis/\"]/div/p", "xpath");
    }

    public void clicarLinkedin() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.linkedin.com/company/lopes-consultoria-de-imoveis\"]/div/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.linkedin.com/company/lopes-consultoria-de-imoveis\"]/div/p", "xpath");
    }

    public void clicarYoutube() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.youtube.com/user/lopesconsultoria\"]/div/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.youtube.com/user/lopesconsultoria\"]/div/p", "xpath");
    }

    public void clicarBlog() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://www.lopes.com.br/blog/\"]/div/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://www.lopes.com.br/blog/\"]/div/p", "xpath");
    }

    public void validarInstagram(String value) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("instagram.com"));
        Assert.assertTrue(currentURL.contains(value));
    }

    public void validarRodape(String value) {
        driver.waitElement("/html/body/lps-root/lps-home/div/nav-footer/div/div[3]/p", "xpath");
        WebElement rodape = driver.findElem("/html/body/lps-root/lps-home/div/nav-footer/div/div[3]/p", "xpath");
        Assert.assertEquals(value, rodape.getText());
    }

    public void clicarConsorcio() {
        driver.waitElementToBeClickable("//*[@id=\"linkhttps://consorcio.lopes.com.br/?utm_source=site&utm_medium=home&utm_campaign=lopes\"]/p", "xpath");
        driver.forceClick("//*[@id=\"linkhttps://consorcio.lopes.com.br/?utm_source=site&utm_medium=home&utm_campaign=lopes\"]/p", "xpath");

        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchWin("2");
    }

    public void validarConsorcio(String value) {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains(value));
    }

    public void validarFotografia(String value) {
        String currentURL = driver.getCurrentUrl();
        if(currentURL.contains("qa")) {
            Assert.assertTrue(currentURL.contains(value));
        }
        else {
            System.out.println("Não aplicável em DEV");
        }
    }
}
