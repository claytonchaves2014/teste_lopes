package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Favoritos;
import support.BaseSteps;

public class FavoritosSteps extends BaseSteps {
    
    private static Favoritos favoritos = new Favoritos(driver);

    @Quando("favorito um imóvel")
    public void favoritoUmImóvel() {
        favoritos.selecionarFavorito();
    }

    @Então("vejo meus imóveis favoritos")
    public void vejoMeusImóveisFavoritos() {
        favoritos.verificarFavoritos();
    }
}
