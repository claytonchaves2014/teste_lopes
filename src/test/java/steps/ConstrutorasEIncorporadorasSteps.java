package steps;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ConstrutorasEIncorporadoras;
import pages.HomeFooter;
import support.BaseSteps;


public class ConstrutorasEIncorporadorasSteps extends BaseSteps {


 private static ConstrutorasEIncorporadoras construtorasEIncorporadoras = new ConstrutorasEIncorporadoras(driver);

        @E("visualizo a lista de Construtoras e Incorporadoras em ordem alfabética")
        public void vejoPaginaConstrutorasIncorporadoras() {
            construtorasEIncorporadoras.vejoPageConstruturaseIncorporadoras();
    }
        @Quando("clico sobre uma incorporadora exibida na tela")
        public void clicoPaginaConstrutorasIncorporadoras() throws InterruptedException {
        construtorasEIncorporadoras.clicoPageConstruturaseIncorporadoras();
    }
       @Entao("é exibido informações sobre a Incorporadora")
        public void exibeInfoConstrutorasIncorporadoras() throws InterruptedException {
        construtorasEIncorporadoras.exibirInfoConstrutorasIncorporadoras();
    }


}









