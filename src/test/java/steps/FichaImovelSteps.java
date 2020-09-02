package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.FichaImovel;
import pages.HomeFooter;
import support.BaseSteps;

public class FichaImovelSteps extends BaseSteps {

    private static FichaImovel fichaImovel = new FichaImovel(driver);
    private static HomeFooter homeFooter = new HomeFooter(driver);

    @Então("vejo a Ficha do Imóvel com a url {string}")
    public void vejoAFichaDoImóvelComAUrl(String value) {
        fichaImovel.aguardarFicha();
        fichaImovel.verificarFicha(value);
    }

    @Então("vejo a Ficha do Imóvel")
    public void vejoAFichaDoImóvel() {
        homeFooter.trocarJanela();
        fichaImovel.verificarFichaAberta();
    }

    @Então("vejo o carrossel de fotos")
    public void vejoOCarrosselDeFotos() {
        fichaImovel.verificarCarrossel();
    }

    @E("vejo os botões da Galeria")
    public void vejoOsBotõesDaGaleria() {
        fichaImovel.verificarBtnGaleria();
    }

    @E("vejo as informações do imóvel")
    public void vejoAsInformaçõesDoImóvel() {
        fichaImovel.verificarInformacoes();
    }

    @E("vejo os valores do imóvel")
    public void vejoOsValoresDoImóvel() {
        fichaImovel.verificarValor();
    }

    @E("vejo os atributos do imóvel")
    public void vejoOsAtributosDoImóvel() {
        fichaImovel.verificarAtributos();
    }

    @E("vejo sobre o imóvel")
    public void vejoSobreOImóvel() {
        fichaImovel.verificarSobreImovel();
    }

    @E("vejo o botão Compartilhar")
    public void vejoOBotãoCompartilhar() {
        fichaImovel.verificarCompartilhar();
    }

    @E("vejo o botão Favoritar")
    public void vejoOBotãoFavoritar() {
        fichaImovel.verificarFavoritar();
    }
}
