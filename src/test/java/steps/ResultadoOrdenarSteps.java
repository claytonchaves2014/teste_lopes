package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ResultadoOrdenar;
import support.BaseSteps;

public class ResultadoOrdenarSteps extends BaseSteps {

    private static ResultadoOrdenar resultadoOrdenar = new ResultadoOrdenar(driver);

    @Dado("que clico em Ordenar")
    public void queClicoEmOrdenar() {
        resultadoOrdenar.clicarOrdenar();
    }

    @Quando("seleciono ordenar por Relevância")
    public void selecionoOrdenarPorRelevância() {
        resultadoOrdenar.clicarRelevancia();
    }

    @Então("verifico que os resultados são ordenados por {string}")
    public void verificoQueOsResultadosSãoOrdenadosPor(String value) {
        resultadoOrdenar.verificarOrdem(value);
    }

    @E("seleciono ordenar por Menor valor")
    public void selecionoOrdenarPorMenorValor() {
        resultadoOrdenar.clicarMenorValor();
    }

    @E("seleciono ordenar por Maior valor")
    public void selecionoOrdenarPorMaiorValor() {
        resultadoOrdenar.clicarMaiorValor();
    }

    @E("seleciono ordenar por Data de atualização")
    public void selecionoOrdenarPorDataDeAtualização() {
        resultadoOrdenar.clicarDataAtualizacao();
    }

    @E("seleciono ordenar por Área do imóvel")
    public void selecionoOrdenarPorÁreaDoImóvel() {
        resultadoOrdenar.clicarAreaImovel();
    }
}
