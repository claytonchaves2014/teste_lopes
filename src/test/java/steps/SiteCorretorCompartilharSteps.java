package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.HomeFooter;
import pages.SiteCorretorCompartilhar;
import support.BaseSteps;

public class SiteCorretorCompartilharSteps extends BaseSteps {

    private static SiteCorretorCompartilhar siteCorretorCompartilhar = new SiteCorretorCompartilhar(driver);
    private static HomeFooter homeFooter = new HomeFooter(driver);

    @Então("visualizo o link Cartão de visita")
    public void visualizoOLinkCartãoDeVisita() {
        siteCorretorCompartilhar.visualizarLinkCartaoVisita();
    }

    @E("clico no link Cartão de Visita")
    public void clicoNoLinkCartãoDeVisita() {
        siteCorretorCompartilhar.clicarCartaoVisita();

    }

    @Então("vejo o link de Compartilhar meu perfil")
    public void vejoOLinkDeCompartilharMeuPerfil() {
        siteCorretorCompartilhar.visualizarBtnCompartilhar();
    }

    @Então("vejo o texto {string}")
    public void vejoOTexto(String value) {
        siteCorretorCompartilhar.validarCRECiInvalido(value);
    }

    @E("clico em Compartilhar meu perfil")
    public void clicoEmCompartilharMeuPerfil() {
        siteCorretorCompartilhar.clicarBtnCompartilhar();
    }

    @E("seleciono WhatsApp")
    public void selecionoWhatsApp() {
        siteCorretorCompartilhar.selecionarWhatsApp();
    }

    @Então("o Whatsapp é aberto enviando o parâmetro do corretor {string}")
    public void oWhatsappÉAbertoEnviandoOParâmetroDoCorretor(String value) {
        homeFooter.trocarJanela();
        siteCorretorCompartilhar.validarWhatsApp(value);
    }

    @E("seleciono Facebook")
    public void selecionoFacebook() {
        siteCorretorCompartilhar.selecionarFacebook();
    }

    @Então("o Facebook é aberto enviando o parâmetro do corretor {string}")
    public void oFacebookÉAbertoEnviandoOParâmetroDoCorretor(String value) {
        homeFooter.trocarJanela();
        siteCorretorCompartilhar.validarFacebook(value);
    }

    @E("seleciono Linkedin")
    public void selecionoLinkedin() {
        siteCorretorCompartilhar.selecionarLinkedin();
    }

    @Então("o Linkedin é aberto enviando o parâmetro do corretor {string}")
    public void oLinkedinÉAbertoEnviandoOParâmetroDoCorretor(String value) {
        homeFooter.trocarJanela();
        siteCorretorCompartilhar.validarLinkedin(value);
    }

    @E("clico na URL")
    public void clicoNaURL() {
        siteCorretorCompartilhar.clicarURL();
    }

    @Então("é aberto do site do corretor com o parâmetro {string}")
    public void éAbertoDoSiteDoCorretorComOParâmetro(String value) {
        siteCorretorCompartilhar.validarURL(value);
    }
}
