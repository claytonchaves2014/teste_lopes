package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.FichaGaleria;
import support.BaseSteps;

public class FichaGaleriaSteps extends BaseSteps {

    private static FichaGaleria fichaGaleria = new FichaGaleria(driver);

    @E("clico na imagem do imóvel")
    public void clicoNaImagemDoImóvel() {
        fichaGaleria.clicarAbrirGaleria();
    }

    @Então("a Galeria de Imagens é aberta")
    public void aGaleriaDeImagensÉAberta() {
        fichaGaleria.verificarGaleria();
    }

    @E("vejo o submenu da galeria")
    public void vejoOSubmenuDaGaleria() {
        fichaGaleria.verificarSubMenuGaleria();
    }

    @E("vejo o botão Fechar")
    public void vejoOBotãoFechar() {
        fichaGaleria.verificarBtnFechar();
    }

    @E("vejo a lista de imagens")
    public void vejoAListaDeImagens() {
        fichaGaleria.verificarListaImg();
    }
}
