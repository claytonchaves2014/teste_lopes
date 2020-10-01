package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.QuemSomos;
import support.BaseSteps;

public class QuemSomosSteps extends BaseSteps {

    private  static QuemSomos quemSomos = new QuemSomos(driver);

    @Então("vejo o banner do Quem Somos")
    public void vejoOBannerDoQuemSomos() {
        quemSomos.validarBanner();
    }

    @E("vejo o título com o texto {string}")
    public void vejoOTítuloComOTexto(String value) {
        quemSomos.validarTitulo(value);
    }

    @E("vejo o subtitulo com o texto {string}")
    public void vejoOSubtituloComOTexto(String value) {
        quemSomos.validarSubTitulo(value);
    }

    @E("vejo a primeira card de informações com o texto {string}")
    public void vejoAPrimeiraCardDeInformaçõesComOTexto(String value) {
        quemSomos.validarPrimeiraCard(value);
    }

    @E("vejo a segunda card de informações com o texto {string}")
    public void vejoASegundaCardDeInformaçõesComOTexto(String value) {
        quemSomos.validarSegundaCard(value);
    }

    @E("vejo a terceira card de informações com o texto {string}")
    public void vejoATerceiraCardDeInformaçõesComOTexto(String value) {
        quemSomos.validarTerceiraCard(value);
    }

    @E("vejo a quarta card de informações com o texto {string}")
    public void vejoAQuartaCardDeInformaçõesComOTexto(String value) {
        quemSomos.validarQuartaCard(value);
    }

    @E("vejo a quinta card de informações com o texto {string}")
    public void vejoAQuintaCardDeInformaçõesComOTexto(String value) {
        quemSomos.validarQuintaCard(value);
    }

    @E("clico em Quero investir")
    public void clicoEmQueroInvestir() {
        quemSomos.clicarQueroInvestir();
    }
}
