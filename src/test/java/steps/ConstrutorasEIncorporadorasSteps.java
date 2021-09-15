package steps;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.ConstrutorasEIncorporadoras;
import pages.HomeFooter;
import support.BaseSteps;


public class ConstrutorasEIncorporadorasSteps extends BaseSteps {


 private static ConstrutorasEIncorporadoras construtorasEIncorporadoras = new ConstrutorasEIncorporadoras(driver);

        @Então("visualizo a lista de Construtoras e Incorporadoras em ordem alfabética")
        public void vejoPaginaConstrutorasIncorporadoras() {
            construtorasEIncorporadoras.vejoPageConstruturaseIncorporadoras();
    }

}









