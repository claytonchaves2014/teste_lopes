package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.HomeFooter;
import support.BaseSteps;

public class HomeFooterSteps extends BaseSteps {
    
    private static HomeFooter homeFooter = new HomeFooter(driver);
    
    @Dado("verifico o Footer da página")
    public void verificoOFooterDaPágina() throws InterruptedException {
        homeFooter.verificarFooter();
    }

    @Quando("clico em Quem Somos")
    public void clicoEmQuemSomos() throws InterruptedException {
        homeFooter.clicarQuemSomos();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Assessoria de Imprensa")
    public void clicoEmAssessoriaDeImprensa() throws InterruptedException {
        homeFooter.clicarAssessoriaImprensa();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Linha de ética")
    public void clicoEmLinhaDeÉtica() throws InterruptedException {
        homeFooter.clicarLinhaEtica();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Trabalhe conosco")
    public void clicoEmTrabalheConosco() throws InterruptedException {
        homeFooter.clicarTrabalheConosco();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Relação com investidores")
    public void clicoEmRelaçãoComInvestidores() throws InterruptedException {
        homeFooter.clicarRelacaoInvestidores();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Venda seu imóvel")
    public void clicoEmVendaSeuImóvel() throws InterruptedException {
        homeFooter.clicarVendaImovel();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Alugue seu imóvel")
    public void clicoEmAlugueSeuImóvel() throws InterruptedException {
        homeFooter.clicarAlugueImovel();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Credipronto")
    public void clicoEmCredipronto() throws InterruptedException {
        homeFooter.clicarCredipronto();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Serviços de fotografia")
    public void clicoEmServiçosDeFotografia() throws InterruptedException {
        homeFooter.clicarServFotografia();
    }

    @Quando("clico em Facebook")
    public void clicoEmFacebook() throws InterruptedException {
        homeFooter.clicarFacebook();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Twitter")
    public void clicoEmTwitter() throws InterruptedException {
        homeFooter.clicarTwitter();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Instagram")
    public void clicoEmInstagram() throws InterruptedException {
        homeFooter.clicarInstagram();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Linkedin")
    public void clicoEmLinkedin() throws InterruptedException {
        homeFooter.clicarLinkedin();
        homeFooter.trocarJanela();
    }

    @Quando("clico em YouTube")
    public void clicoEmYouTube() throws InterruptedException {
        homeFooter.clicarYoutube();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Blog")
    public void clicoEmBlog() throws InterruptedException {
        homeFooter.clicarBlog();
        homeFooter.trocarJanela();
    }

    @Então("verifico que a URL do Instagram é aberta {string}")
    public void verificoQueAURLDoInstagramÉAberta(String value) {
        homeFooter.validarInstagram(value);
    }

    @Então("vejo o rodapé com o texto {string}")
    public void vejoORodapéComOTexto(String value) {
        homeFooter.validarRodape(value);
    }

    @Quando("clico em Consórcio Lopes")
    public void clicoEmConsórcioLopes() {
        homeFooter.clicarConsorcio();
    }

    @Então("verifico que a URL do Consórcio Lopes é aberta {string}")
    public void verificoQueAURLDoConsórcioLopesÉAberta(String value) {
        homeFooter.validarConsorcio(value);
    }

    @Então("verifico que a URL de Serviços de Fotografia é aberta {string}")
    public void verificoQueAURLDeServiçosDeFotografiaÉAberta(String value) {
        homeFooter.validarFotografia(value);
    }

    @Quando("clico em Fale Conosco")
    public void clicoEmFaleConosco() {
        homeFooter.clicarFaleConosco();
//        homeFooter.trocarJanela();
    }

    @Quando("clico em Seja um corretor associado")
    public void clicoEmSejaUmCorretorAssociado() {
        homeFooter.clicarQueroSerCorretor();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Mapa do site")
    public void clicoEmMapaDoSite() {
        homeFooter.clicarMapaSite();
//        homeFooter.trocarJanela();
    }

    @E("vejo a nova aba aberta")
    public void vejoANovaAbaAberta() {
        homeFooter.trocarJanela();
    }

    @Quando("clico em Condomínios e edifícios")
    public void clicoEmCondomíniosEEdifícios() {
        homeFooter.clicarCondominiosEdificios();
    }

    @Quando("clico no footer da página Construtoras e Incorporadoras")
    public void cliqueFooterConstrutoraEImpreendimentos() throws InterruptedException {
        homeFooter.clicarFooterConstrutoraEImpreendimentos();

    }
}
