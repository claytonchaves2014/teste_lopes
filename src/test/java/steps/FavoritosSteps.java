package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Favoritos;
import support.BaseSteps;

public class FavoritosSteps extends BaseSteps {
    
    private static Favoritos favoritos = new Favoritos(driver);

    @Então("vejo meus imóveis favoritos")
    public void vejoMeusImóveisFavoritos() {
        favoritos.verificarFavoritos();
    }

    @Quando("clico para favoritar um imóvel")
    public void clicoParaFavoritarUmImóvel() {
        favoritos.clicarFavoritar();
    }
}
