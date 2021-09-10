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
    public void queClicoEmOrdenar() throws InterruptedException {
        resultadoOrdenar.clicarOrdenar();

    }

    @Quando("seleciono ordenar por Relevância")
    public void selecionoOrdenarPorRelevância() throws InterruptedException {
        resultadoOrdenar.clicarRelevancia();

    }

    @Então("verifico que os resultados são ordenados por {string}")
    public void verificoQueOsResultadosSãoOrdenadosPor(String value) throws InterruptedException {
        resultadoOrdenar.verificarOrdem(value);

    }

    @E("seleciono ordenar por Menor valor")
    public void selecionoOrdenarPorMenorValor() throws InterruptedException {
        resultadoOrdenar.clicarMenorValor();
    }

    @E("vejo ordenar por Menor valor")
    public void vejoOrdenarPorMenorValor() throws InterruptedException {
        resultadoOrdenar.vejoMenorValor();
    }

    @E("seleciono ordenar por Maior valor")
    public void selecionoOrdenarPorMaiorValor() throws InterruptedException {
        resultadoOrdenar.clicarMaiorValor();}

    @E("vejo ordenar por Maior valor")
    public void vejoOrdenarPorMaiorValor() throws InterruptedException {
        resultadoOrdenar.vejoMaiorValor();
    }

    @E("seleciono ordenar por Data de atualização")
    public void selecionoOrdenarPorDataDeAtualização() throws InterruptedException {
        resultadoOrdenar.clicarDataAtualizacao();
    }

    @E("vejo ordenar por Data de atualização")
    public void vejoOrdenarPorDataDeAtualização() throws InterruptedException {
        resultadoOrdenar.vejoDataAtualizacao();
    }

    @E("seleciono ordenar por Área do imóvel")
    public void selecionoOrdenarPorÁreaDoImóvel() throws InterruptedException {
        resultadoOrdenar.clicarAreaImovel();}

    @E("vejo ordenar por Área do imóvel")
    public void vejoOrdenarPorÁreaDoImóvel() throws InterruptedException {
        resultadoOrdenar.vejoAreaImovel();
    }
}
