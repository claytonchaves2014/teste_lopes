package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.ResultadoMapa;
import support.BaseSteps;

public class ResultadoMapaSteps extends BaseSteps {
    
    private static ResultadoMapa resultadoMapa = new ResultadoMapa(driver);
    
    @Então("vejo os ícones de Coração no Mapa")
    public void vejoOsÍconesDeCoraçãoNoMapa() throws InterruptedException {
        resultadoMapa.verificarCoracao();
    }

    @E("vejo os ícones de Prontos no Mapa")
    public void vejoOsÍconesDeProntosNoMapa() {
        resultadoMapa.verificarProntos();
    }

    @Então("clico em Aumentar o Zoom")
    public void clicoEmAumentarOZoom() {
        resultadoMapa.clicarAumentarZoom();
    }

}
