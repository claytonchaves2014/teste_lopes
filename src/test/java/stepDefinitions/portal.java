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
        Thread.sleep(1000);
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
        Assert.assertArrayEquals(filtro, tipoFiltro);

    }

}
