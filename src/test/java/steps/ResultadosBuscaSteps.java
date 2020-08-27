package steps;

import cucumber.api.java.pt.Então;
import pages.ResultadosBusca;
import support.BaseSteps;

public class ResultadosBuscaSteps extends BaseSteps {

    private static ResultadosBusca resultadosBusca = new ResultadosBusca(driver);

    @Então("vejo a mensagem {string} de resultados não encontrados")
    public void vejoAMensagemDeResultadosNãoEncontrados(String value) {
        resultadosBusca.verificarSemResultado(value);
    }
}
