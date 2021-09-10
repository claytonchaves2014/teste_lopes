package steps;

import io.cucumber.java.pt.*;
import pages.HomeFiltros;
import support.BaseSteps;

public class HomeFiltrosSteps extends BaseSteps {

    private static HomeFiltros homeFiltros = new HomeFiltros(driver);

    @Dado("clico em Filtros na Home Page")
    public void clicoEmFiltrosNaHomePage() throws InterruptedException {
        homeFiltros.clicarFiltros();
    }

    @Quando("clico em filtrar por Valor")
    public void clicoEmFiltrosPorValor() throws InterruptedException {
        homeFiltros.clicarFiltrarValor();
    }
    @E("clico no checkbox Aluguel")
    public void clicoCheckAluguel() throws InterruptedException {
        homeFiltros.clicoCheckBoxAluguel();
    }
    @E("clico no botão Aplicar")
    public void clicoBotaoAplicar() throws InterruptedException {
        homeFiltros.clicoBtnAplicar();
    }
    @E("clico em Ordenar")
    public void clicoBotaoOrdenar() throws InterruptedException {
        homeFiltros.clicoBtnOrdenar();
    }
    @Então("vejo o checkbox Valor Total selecionado")
    public void vejoValorTotalSelecionado() {
        homeFiltros.ValorTotalSelecionado();
    }

    @E("vejo o checkbox Aluguel")
    public void vejoCheckBAluguel() {
        homeFiltros.vejoCheckBoxAluguel();
    }

    @Entao("vejo o filtro de valor com Valor mínimo")
    public void vejoVlMinimo() {
        homeFiltros.vejoValorMinimo();
    }

    @E("vejo o filtro de valor com Valor máximo")
    public void vejoVlMaximo() {
        homeFiltros.vejoValorMaximo();
    }

    @Quando("insiro um valor mínimo de {string}")
    public void insiroUmValorMínimoDe(String value) throws InterruptedException {
        homeFiltros.inserirValorMin(value);
    }

    @E("insiro um valor máximo de {string}")
    public void insiroUmValorMáximoDe(String value) throws InterruptedException {
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
    public void selecionoComoQuantidadeDeDormitórios(String value) throws InterruptedException {
        homeFiltros.selecionarBanheiro(value);
    }

    @Quando("seleciono {string} como quantidade de Vagas")
    public void selecionoComoQuantidadeDeVagas(String value) throws InterruptedException {
        homeFiltros.selecionarVaga(value);
    }

    @Então("clico em Limpar filtros na Home")
    public void clicoEmLimparFiltrosNaHome() throws InterruptedException {
        homeFiltros.clicarLimparFiltros();
    }
}
