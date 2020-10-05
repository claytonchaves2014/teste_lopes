package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FichaCorretor;
import support.BaseSteps;

public class FichaCorretorSteps extends BaseSteps {

    private static FichaCorretor fichaCorretor = new FichaCorretor(driver);

    @Dado("acesso a Ficha do Imóvel {string}")
    public void acessoAFichaDoImóvel(String value) {
        fichaCorretor.acessarFicha(value);
    }

    @Quando("insiro o parâmetro do Corretor {string}")
    public void insiroOParâmetroDoCorretor(String value) {
        fichaCorretor.inserirParametro(value);
    }

    @Então("visualizo apenas um Cartão do Corretor")
    public void visualizoApenasUmCartãoDoCorretor() {
        fichaCorretor.validarCartaoCorretor();
    }

    @E("o Cartão do Corretor pertence ao {string}")
    public void oCartãoDoCorretorPertenceAo(String value) {
        fichaCorretor.validarNickName(value);
    }

    @Então("visualizo que o parâmetro do Corretor continua como {string}")
    public void visualizoQueOParâmetroDoCorretorContinuaComo(String value) {
        fichaCorretor.validarParametro(value);
    }

    @E("clico em Ver telefone no Lead")
    public void clicoEmVerTelefoneNoLead() {
        fichaCorretor.clicarVerTelefone();
    }

    @Então("visualizo o celular do Corretor no Lead como {string}")
    public void visualizoOCelularDoCorretorNoLeadComo(String value) {
        fichaCorretor.validarCelularLead(value);
    }

    @Quando("altero o parâmetro do Corretor {string}")
    public void alteroOParâmetroDoCorretor(String value) {
    }
}
