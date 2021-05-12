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
        driver.findElem("lps-root lps-home nav-footer .main-content", "css").isDisplayed();
        WebElement footer = driver.findElem("lps-root lps-home nav-footer .red-border", "css");
        driver.ScrollTo(footer);
        Thread.sleep(2000);
    }

    public void clicarQuemSomos() throws InterruptedException {
        driver.waitElementToBeClickable("linkpaginas/quem-somos");
        driver.forceClick("linkpaginas/quem-somos");
    }

    public void clicarFaleConosco() {
        driver.waitElementToBeClickable("linkpaginas/fale-conosco");
        driver.forceClick("linkpaginas/fale-conosco");
    }

    public void clicarAssessoriaImprensa() throws InterruptedException {
        driver.waitElementToBeClickable("linkpaginas/assessoria-de-imprensa");
        driver.forceClick("linkpaginas/assessoria-de-imprensa");
    }

    public void clicarLinhaEtica() throws InterruptedException {
        driver.waitElementToBeClickable("linkpaginas/linha-de-etica");
        driver.forceClick("linkpaginas/linha-de-etica");
    }

    public void clicarTrabalheConosco() throws InterruptedException {
        driver.waitElementToBeClickable("linkpaginas/trabalhe-conosco");
        driver.forceClick("linkpaginas/trabalhe-conosco");
    }

    public void clicarQueroSerCorretor() {
        driver.waitElementToBeClickable("linkhttps://www.lopes.com.br/campanha/quero-ser-corretor");
        driver.forceClick("linkhttps://www.lopes.com.br/campanha/quero-ser-corretor");
    }

    public void clicarRelacaoInvestidores() throws InterruptedException {
        driver.waitElementToBeClickable("linkhttps://ri.lopes.com.br/");
        driver.forceClick("linkhttps://ri.lopes.com.br/");
    }

    public void clicarMapaSite() {
        driver.waitElementToBeClickable("linkpaginas/mapa-do-site");
        driver.forceClick("linkpaginas/mapa-do-site");
    }

    public void clicarCondominiosEdificios() {
       driver.waitElementToBeClickable("linkpaginas/condominios/sp");
       driver.forceClick("linkpaginas/condominios/sp");
    }

    public void clicarVendaImovel() throws InterruptedException {
        driver.waitElementToBeClickable("linkpaginas/anuncie-seu-imovel");
        driver.forceClick("linkpaginas/anuncie-seu-imovel");
    }

    public void clicarAlugueImovel() throws InterruptedException {
        driver.waitElementToBeClickable("linkpaginas/anuncie-seu-imovel");
        driver.forceClick("linkpaginas/anuncie-seu-imovel");
    }

    public void clicarCredipronto() throws InterruptedException {
        driver.waitElementToBeClickable("linkhttps://www.credipronto.com.br");
        driver.forceClick("linkhttps://www.credipronto.com.br");
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
        String url = driver.getCurrentUrl();
        System.out.println("URL: " + url);
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
        driver.waitElementToBeClickable("linkhttps://consorcio.lopes.com.br/?utm_source=site&utm_medium=home&utm_campaign=lopes");
        driver.forceClick("linkhttps://consorcio.lopes.com.br/?utm_source=site&utm_medium=home&utm_campaign=lopes");

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
