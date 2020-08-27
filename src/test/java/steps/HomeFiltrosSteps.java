package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomeFiltros;
import support.BaseSteps;

public class HomeFiltrosSteps extends BaseSteps {

    private static HomeFiltros homeFiltros = new HomeFiltros(driver);

    @Dado("clico em Filtros na Home Page")
    public void clicoEmFiltrosNaHomePage() {
        homeFiltros.clicarFiltros();
    }

    @Quando("insiro um valor mínimo de {string}")
    public void insiroUmValorMínimoDe(String value) {
        homeFiltros.inserirValorMin(value);
    }

    @E("insiro um valor máximo de {string}")
    public void insiroUmValorMáximoDe(String value) {
        homeFiltros.inserirValorMax(value);
    }

    @Então("vejo o alerta para Valor {string}")
    public void vejoOAlertaParaValor(String value) {
        homeFiltros.validarAlertaValor(value);
    }

    @Quando("insiro uma área mínima de {string}")
    public void insiroUmaÁreaMínimaDe(String value) {
        homeFiltros.inserirAreaMin(value);
    }

    @E("insiro uma área máxima de {string}")
    public void insiroUmaÁreaMáximaDe(String value) {
        homeFiltros.inserirAreaMax(value);
    }

    @Então("vejo o alerta para Area {string}")
    public void vejoOAlertaParaArea(String value) {
        homeFiltros.validarAlertaArea(value);
    }

    @Quando("seleciono {string} como quantidade de Dormitórios")
    public void selecionoComoQuantidadeDeDormitórios(String value) {
        homeFiltros.selecionarBanheiro(value);
    }

    @Quando("seleciono {string} como quantidade de Vagas")
    public void selecionoComoQuantidadeDeVagas(String value) {
        homeFiltros.selecionarVaga(value);
    }

    @Então("clico em Limpar filtros na Home")
    public void clicoEmLimparFiltrosNaHome() throws InterruptedException {
        homeFiltros.clicarLimparFiltros();
    }
}
