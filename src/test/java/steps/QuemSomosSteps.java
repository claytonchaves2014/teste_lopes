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
    }
}
