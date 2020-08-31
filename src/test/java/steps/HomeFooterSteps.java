package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
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

    @Quando("clico em Assessoria de Comunicação")
    public void clicoEmAssessoriaDeComunicação() throws InterruptedException {
        homeFooter.clicarAssessoriaComunicacao();
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
    }

    @Quando("clico em Serviços de fotografia")
    public void clicoEmServiçosDeFotografia() throws InterruptedException {
        homeFooter.clicarServFotografia();
    }

    @Então("verifico que a URL de Relação com investores aberta é {string}")
    public void verificoQueAURLDeRelaçãoComInvestoresAbertaÉ(String value) {
        homeFooter.urlRelacaoInv(value);
    }

    @Então("verifico que a URL de Credipronto aberta é {string}")
    public void verificoQueAURLDeCrediprontoAbertaÉ(String value) {
        homeFooter.urlCredipronto(value);
    }
}
