package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.HomeServicos;
import support.BaseSteps;

public class HomeServicosSteps extends BaseSteps {

    private static HomeServicos homeServicos = new HomeServicos(driver);

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
    }

    @Quando("clico no serviço de Seja um franqueado")
    public void clicoNoServiçoDeSejaUmFranqueado() {
        homeServicos.clicarSejaFranqueado();
    }

    @Quando("clico no serviço de Serviços de fotografia")
    public void clicoNoServiçoDeServiçosDeFotografia() {
        homeServicos.clicarServFotografia();
    }
}
