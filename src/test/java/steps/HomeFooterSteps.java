package steps;

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
    }

    @Quando("clico em Assessoria de Imprensa")
    public void clicoEmAssessoriaDeImprensa() throws InterruptedException {
        homeFooter.clicarAssessoriaImprensa();
    }

    @Quando("clico em Linha de ética")
    public void clicoEmLinhaDeÉtica() throws InterruptedException {
        homeFooter.clicarLinhaEtica();
    }

    @Quando("clico em Trabalhe conosco")
    public void clicoEmTrabalheConosco() throws InterruptedException {
        homeFooter.clicarTrabalheConosco();
    }

    @Quando("clico em Relação com investidores")
    public void clicoEmRelaçãoComInvestidores() throws InterruptedException {
        homeFooter.clicarRelacaoInvestidores();
        homeFooter.trocarJanela();
    }

    @Quando("clico em Venda seu imóvel")
    public void clicoEmVendaSeuImóvel() throws InterruptedException {
        homeFooter.clicarVendaImovel();
    }

    @Quando("clico em Alugue seu imóvel")
    public void clicoEmAlugueSeuImóvel() throws InterruptedException {
        homeFooter.clicarAlugueImovel();
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
}
