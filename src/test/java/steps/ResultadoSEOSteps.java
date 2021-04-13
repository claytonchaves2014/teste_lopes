package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ResultadoSEO;
import support.BaseSteps;

public class ResultadoSEOSteps extends BaseSteps {

    private static ResultadoSEO resultadoSEO = new ResultadoSEO(driver);

    @Dado("que vejo os links das dinâmicas de SEO")
    public void verificarDinamicasSeoLinks() {
        resultadoSEO.verificarDinamicasLinks();
    }

    @Dado("que vejo as dinâmicas de SEO")
    public void queVejoAsDinâmicasDeSEO() {
        resultadoSEO.verificarDinamicas();
    }

    @Quando("visualizo o texto Sobre o local")
    public void visualizoOTextoSobreOLocal() {
        resultadoSEO.verificarTextoLocal();
    }

    @E("clico em Ver mais")
    public void clicoEmVerMais() {
        resultadoSEO.clicarVerMaisTexto();
    }

    @Então("vejo o texto completo sobre o local buscado")
    public void vejoOTextoCompletoSobreOLocalBuscado() {
        resultadoSEO.verificarTextoCompleto();
    }

    @Quando("visualizo os links internos de Cidades relacionadas")
    public void visualizoOsLinksInternosDeCidadesRelacionadas() {
        resultadoSEO.verificarCidadesRelacionadas();
    }

    @E("seleciono a opção {string} de Cidades relacionadas")
    public void selecionoAOpçãoDeCidadesRelacionadas(String value) {
        resultadoSEO.selecionarCidadesRelacionadas(value);
    }

    @Quando("visualizo os links internos de Bairros mais populares")
    public void visualizoOsLinksInternosDeBairrosMaisPopulares() {
        resultadoSEO.verificarBairrosPopulares();
    }

    @E("seleciono a opção {string} de Bairros mais populares")
    public void selecionoAOpçãoDeBairrosMaisPopulares(String value) {
        resultadoSEO.selecionarBairrosPopulares(value);
    }

    @Quando("visualizo os links internos de Logradouros mais populares")
    public void visualizoOsLinksInternosDeLogradourosMaisPopulares() {
        resultadoSEO.verificarLogradouros();
    }

    @E("seleciono a opção {string} de Logradouros mais populares")
    public void selecionoAOpçãoDeLogradourosMaisPopulares(String value) {
        resultadoSEO.selecionarLogradouros(value);
    }

    @Quando("visualizo os links internos de Veja também")
    public void visualizoOsLinksInternosDeVejaTambém() {
        resultadoSEO.verificarVejaTambem();
    }

    @E("seleciono a opção {string} de Veja Também")
    public void selecionoAOpçãoDeVejaTambém(String value) {
        resultadoSEO.selecionarVejaTambem(value);
    }
}
