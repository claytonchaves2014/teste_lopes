package stepDefinitions;

import PageObjects.portal.ResultadoBusca;
import io.cucumber.java.pt.*;
import org.junit.Assert;

import static PageObjects.portal.Home.*;
import static PageObjects.portal.ResultadoBusca.*;

public class portal {

    @Quando("clico no {string} do header")
    public void clico_no_do_header(String link) throws InterruptedException {
        Thread.sleep(1000);
        clicarLinkHeader(link);
    }

    @Então("sou direcionado para {string} correspondente")
    public void sou_direcionado_para_correspondente(String urlEsperada) {
        String url = Commons.driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains(urlEsperada));
    }

    @Quando("clico no {string} do footer")
    public void clico_no_do_footer(String link) throws InterruptedException {
        clicarLinkFooter(link);
    }

    @Dado("que permita a geolocalização")
    public void que_permita_a_geolocalização() {

    }

    @Quando("eu clico no botão buscar")
    public void eu_clico_no_botão_buscar() {
        btn_buscar.click();
    }

    @Então("sou direcionado para a página de resultado da busca com o seguimento {string}")
    public void sou_direcionado_para_a_página_de_resultado_da_busca_com_o_seguimento(String filtro) {
        String tipoFiltro = getFiltro();
        Assert.assertEquals(filtro, tipoFiltro);
    }

    @Dado("que eu digite as iniciais {string} na barra de busca")
    public void que_eu_digite_as_iniciais_na_barra_de_busca(String busca) {
        imputBusca.sendKeys(busca);
    }

    @Dado("o sistema carregue o autocomplete trazendo sugestões para a busca")
    public void o_sistema_carregue_o_autocomplete_trazendo_sugestões_para_a_busca() {
        autoComplete.isDisplayed();
    }

    @Quando("seleciono uma das opções e clico em buscar")
    public void seleciono_uma_das_opções_e_clico_em_buscar() throws InterruptedException {
        autoComplete.click();
        Thread.sleep(1000);
        btn_buscar.click();
    }


}
