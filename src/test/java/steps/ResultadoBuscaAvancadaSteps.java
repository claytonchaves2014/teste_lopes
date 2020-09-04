package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import pages.ResultadoBuscaAvancada;
import support.BaseSteps;

public class ResultadoBuscaAvancadaSteps extends BaseSteps {

    private static ResultadoBuscaAvancada resultadoBuscaAvancada = new ResultadoBuscaAvancada(driver);

    @Dado("que insiro {string} na busca avançada")
    public void queInsiroNaBuscaAvançada(String value) {
        resultadoBuscaAvancada.inserirBusca(value);
    }

    @E("seleciono {string} na busca avançada")
    public void selecionoNaBuscaAvançada(String value) {
        resultadoBuscaAvancada.selecionarBusca(value);
    }
}
