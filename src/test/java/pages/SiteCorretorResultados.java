package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import support.Setup;

public class SiteCorretorResultados {

    private Setup driver;

    public SiteCorretorResultados(Setup stepDriver) {
        driver = stepDriver;
    }

    public void verificarResultados() {
        driver.findElem("//ul[@class='cardlist cardlist--broker ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarDescricao() {
        WebElement elemento = driver.findElem("//p[@class='has_content_header_description']", "xpath");
        String descricao = elemento.getText();
        Assert.assertTrue(descricao.contains("imóveis que possam te interessar."));
    }

    public void verificarBtnOrdenar() {
        driver.findElem("//button[@class='search-order ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default ant-btn-sm']", "xpath").isDisplayed();
    }

    public void verificarBtnFiltros() {
        driver.findElem("//button[@class='filter-btn ant-btn ant-dropdown-trigger nz-animate-disabled ng-star-inserted ant-btn-default ant-btn-sm']", "xpath").isDisplayed();
    }

    public void verificarListaCards() {
        driver.findElem("//*[@class='card-container']", "xpath").isDisplayed();
    }

    public void verificarPaginacao() {
        WebElement footer = driver.findElem("//ul[@class='ant-pagination mini ng-star-inserted']", "xpath");
        driver.ScrollTo(footer);
        footer.isDisplayed();
    }

    public void verificarFooter(String value) {
        WebElement footer = driver.findElem("/html/body/app-root/div/app-broker-profile/div/footer/p", "xpath");
        Assert.assertEquals(value, footer.getText());
    }

    public void verificarCard() {
        driver.findElem("//div[@class='card ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarFoto() {
        driver.findElem("//div[@class='card__imagebox ng-star-inserted']", "xpath").isDisplayed();
    }

    public void verificarTipoImovel() {
        driver.findElem("//p[@class='card__type']", "xpath").isDisplayed();
    }

    public void verificarEndereco() {
        driver.findElem("//p[@class='card__location']", "xpath").isDisplayed();
    }

    public void verificarAtributos() {
        driver.findElem("//div[@class='attributes']", "xpath").isDisplayed();
    }

    public void clicarOrdenar() {
        driver.click("//button[@class='search-order ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default ant-btn-sm']", "xpath");
    }

    public void selecionarOrdenacao(String value) throws InterruptedException {
        driver.click("//*[text()=' " + value + " ']", "xpath");
    }

    public void validarOrdenar(String value) {
        WebElement element = driver.findElem("//button[@class='search-order ant-btn ant-dropdown-trigger nz-animate-disabled ant-btn-default ant-btn-sm']", "xpath");
        Assert.assertEquals(value, element.getText());
    }

    public void clicarFiltros() {
        driver.click("//button[@class='filter-btn ant-btn ant-dropdown-trigger nz-animate-disabled ng-star-inserted ant-btn-default ant-btn-sm']", "xpath");
    }

    public void validarTipoTransação(String value) {
        WebElement transacao = driver.findElem("//*[@id=\"cdk-overlay-2\"]/div/div/div/lps-search-filter/div/div[1]/nz-collapse/div/nz-collapse-panel[1]/div[1]", "xpath");
        System.out.println("Teste: " + transacao.getText());
//        Assert.assertEquals(value, transacao.getText());
    }

    public void btnAvancarPagina() {
        driver.waitElement("//li[@class='ant-pagination-next ng-star-inserted']", "xpath");
        driver.click("//li[@class='ant-pagination-next ng-star-inserted']", "xpath");
    }

    public void validarProxPagina() {
        WebElement page = driver.findElem("//li[@class='ant-pagination-item ant-pagination-item-active ng-star-inserted']", "xpath");
        Assert.assertTrue(page.getAttribute("title").equals("2"));
    }

    public void selecionarTipoTransacaoAluguel() {
        driver.forceClick("//span[@text()='Aluguel']", "xpath");
    }

    public void btnTipoTransacao() {
        driver.forceClick("//*[@class='ng-tns-c45-9 ant-collapse-item ng-star-inserted']", "xpath");
    }
}
