package steps;

import cucumber.api.java.pt.Então;
import pages.FichaImovel;
import pages.HomeBusca;
import support.BaseSteps;

public class FichaImovelSteps extends BaseSteps {

    private static FichaImovel fichaImovel = new FichaImovel(driver);

    @Então("vejo a Ficha do Imóvel com a url {string}")
    public void vejoAFichaDoImóvelComAUrl(String value) {
        fichaImovel.aguardarFicha();
        fichaImovel.verificarFicha(value);
    }
}
