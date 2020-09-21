package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.HomeFooter;
import pages.HomeServicos;
import support.BaseSteps;

public class HomeServicosSteps extends BaseSteps {

    private static HomeServicos homeServicos = new HomeServicos(driver);
    private static HomeFooter homeFooter = new HomeFooter(driver);

    @Dado("vejo Encontre a solução para você com nossos serviços")
    public void vejoEncontreASoluçãoParaVocêComNossosServiços() throws InterruptedException {
        homeServicos.validarComponente();
    }

    @Quando("clico no serviço de Anuncie seu imóvel")
    public void clicoNoServiçoDeAnuncieSeuImóvel() throws InterruptedException {
        homeServicos.clicarAnuncieImovel();
    }

    @Quando("clico no serviço de Financiamento")
    public void clicoNoServiçoDeFinanciamento() {
        homeServicos.clicarFinanciamento();
        homeFooter.trocarJanela();
    }

    @Quando("clico no serviço de Seja um franqueado")
    public void clicoNoServiçoDeSejaUmFranqueado() {
        homeServicos.clicarSejaFranqueado();
    }

    @Quando("clico no serviço de Serviços de fotografia")
    public void clicoNoServiçoDeServiçosDeFotografia() {
        homeServicos.clicarServFotografia();
    }

    @io.cucumber.java.pt.Quando("clico no serviço de Consórcio Lopes")
    public void clicoNoServiçoDeConsórcioLopes() {
        homeServicos.clicarConsorcio();
//        homeFooter.trocarJanela();
    }

}
