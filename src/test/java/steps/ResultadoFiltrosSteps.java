package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import pages.ResultadoFiltros;
import support.BaseSteps;

public class ResultadoFiltrosSteps extends BaseSteps {

    private static ResultadoFiltros resultadoFiltros = new ResultadoFiltros(driver);

    @Dado("clico no botão Filtros")
    public void clicoNoBotãoFiltros() {
        resultadoFiltros.clicarFiltros();
    }

    @Quando("clico em Tipo do Imóvel")
    public void clicoEmTipoDoImóvel() {
        resultadoFiltros.clicarTipoImovel();
    }

    @E("seleciono o subtipo {string} do tipo Casa")
    public void selecionoOSubtipoDoTipoCasa(String value) {
        resultadoFiltros.selecionarTipoCasa(value);
    }

    @E("clico em Aplicas os filtros selecionados")
    public void clicoEmAplicasOsFiltrosSelecionados() {
        resultadoFiltros.clicarAplicarFiltros();
    }

    @E("seleciono o subtipo {string} do tipo Apartamento")
    public void selecionoOSubtipoDoTipoApartamento(String value) {
        resultadoFiltros.selecionarTipoApartamento(value);
    }

    @E("seleciono o subtipo {string} do tipo Flat")
    public void selecionoOSubtipoDoTipoFlat(String value) {
        resultadoFiltros.selecionarTipoFlat(value);
    }

    @E("seleciono o subtipo {string} do tipo Galpão")
    public void selecionoOSubtipoDoTipoGalpão(String value) {
        resultadoFiltros.selecionarTipoGalpao(value);
    }

    @E("seleciono o subtipo {string} do tipo Hotel")
    public void selecionoOSubtipoDoTipoHotel(String value) {
        resultadoFiltros.selecionarTipoHotel(value);
    }

    @E("seleciono o subtipo {string} do tipo Lajes corporativas")
    public void selecionoOSubtipoDoTipoLajesCorporativas(String value) {
        resultadoFiltros.selecionarTipoLajesCorporativas(value);
    }

    @E("seleciono o subtipo {string} do tipo Loteamento")
    public void selecionoOSubtipoDoTipoLoteamento(String value) {
        resultadoFiltros.selecionarTipoLoteamento(value);
    }

    @E("seleciono o subtipo {string} do tipo Mall")
    public void selecionoOSubtipoDoTipoMall(String value) {
        resultadoFiltros.selecionarTipoMall(value);
    }

    @E("seleciono o subtipo {string} do tipo Rural")
    public void selecionoOSubtipoDoTipoRural(String value) {
        resultadoFiltros.selecionarTipoRural(value);
    }

    @E("seleciono o subtipo {string} do tipo Salão")
    public void selecionoOSubtipoDoTipoSalão(String value) {
        resultadoFiltros.selecionarTipoSalao(value);
    }

    @E("seleciono o subtipo {string} do tipo Salas")
    public void selecionoOSubtipoDoTipoSalas(String value) {
        resultadoFiltros.selecionarTipoSalas(value);
    }

    @E("seleciono o subtipo {string} do tipo Terreno")
    public void selecionoOSubtipoDoTipoTerreno(String value) {
        resultadoFiltros.selecionarTipoTerreno(value);
    }

    @Quando("clico em Características do Imóvel")
    public void clicoEmCaracterísticasDoImóvel() {
        resultadoFiltros.clicarCaracteristicasImovel();
    }

    @E("seleciono {string} em {string}")
    public void selecionoEm(String qtd, String tipo) {
        resultadoFiltros.selecionarCaracteristicas(qtd, tipo);
    }

    @Quando("clico em Área")
    public void clicoEmÁrea() {
        resultadoFiltros.clicarArea();
    }

    @E("insiro {string} como área mínima")
    public void insiroComoÁreaMínima(String value) {
        resultadoFiltros.inserirAreaMinima(value);
    }

    @E("insiro {string} como área máxima")
    public void insiroComoÁreaMáxima(String value) {
        resultadoFiltros.inserirAreaMaxima(value);
    }

    @Quando("clico em Valor")
    public void clicoEmValor() {
        resultadoFiltros.clicarValor();
    }

    @E("insiro {string} como valor mínimo")
    public void insiroComoValorMínimo(String value) {
        resultadoFiltros.inserirValorMinimo(value);
    }

    @E("insiro {string} como valor máximo")
    public void insiroComoValorMáximo(String value) {
        resultadoFiltros.inserirValorMaximo(value);
    }

    @Quando("clico em Outros filtros")
    public void clicoEmOutrosFiltros() {
        resultadoFiltros.clicarOutrosFiltros();
    }

    @E("seleciono {string} como Outros Filtros")
    public void selecionoComoOutrosFiltros(String value) {
        resultadoFiltros.selecionarOutrosFiltros(value);
    }
}
