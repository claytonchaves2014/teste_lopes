package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FichaSEO;
import support.BaseSteps;

public class FichaSEOSteps extends BaseSteps {

    private static FichaSEO fichaSEO = new FichaSEO(driver);

    @Quando("verifico que a Ficha do Imóvel possui Title")
    public void verificoQueAFichaDoImóvelPossuiTitle() {
        fichaSEO.verificarTitle();
    }

    @E("verifico que a Ficha do Imóvel possui Description")
    public void verificoQueAFichaDoImóvelPossuiDescription() {
        fichaSEO.verificarMetaDescription();
    }

    @E("verifico que a Ficha do Imóvel possui Canonical")
    public void verificoQueAFichaDoImóvelPossuiCanonical() {
        fichaSEO.verificarCanonical();
    }

    @Então("vejo os links internos")
    public void vejoOsLinksInternos() {
        fichaSEO.verificarLinksInternos();
    }
}
