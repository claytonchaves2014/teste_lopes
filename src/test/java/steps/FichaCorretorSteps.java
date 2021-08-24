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

//    @E("clico em Ver telefone no Lead")
//    public void clicoEmVerTelefoneNoLead() {
//        fichaCorretor.clicarVerTelefone();
//    }

//    @Então("visualizo o celular do Corretor no Lead como {string}")
//    public void visualizoOCelularDoCorretorNoLeadComo(String value) {
//        fichaCorretor.validarCelularLead(value);
//    }

    @Quando("verifico o Cartão do Corretor em {string}")
    public void verificoOCartãoDoCorretorEm(String value) {
        fichaCorretor.verificarCartaoCorretor(value);
    }

    @Então("vejo o Apelido do Corretor")
    public void vejoOApelidoDoCorretor() {
        fichaCorretor.verificarApelido();
    }

    @E("vejo a foto do Corretor")
    public void vejoAFotoDoCorretor() {
        fichaCorretor.verificarFoto();
    }

    @E("vejo o logo do Corretor")
    public void vejoOLogoDoCorretor() {
        fichaCorretor.verificarLogo();
    }

    @E("vejo o Nome completo do Corretor")
    public void vejoONomeCompletoDoCorretor() {
        fichaCorretor.verificarNomeCompleto();
    }

    @E("vejo o Creci do Corretor")
    public void vejoOCreciDoCorretor() {
        fichaCorretor.verificarCreci();
    }

//    @E("vejo o botão Falar com o corretor")
//    public void vejoOBotãoFalarComOCorretor() {
//        fichaCorretor.verificarFalarComCorretor();
//    }

//    @Quando("clico no botão Falar com o corretor")
//    public void clicoNoBotãoFalarComOCorretor() {
//        fichaCorretor.clicarFalarComCorretor();
//    }



    // focus





//    @Então("vejo o popup {string}")
//    public void vejoOPopup(String value) {
//        fichaCorretor.verificarPopup(value);
//    }
//
//    @E("vejo o texto do popup {string}")
//    public void vejoOTextoDoPopup(String value) {
//        fichaCorretor.verificarTxtPopup(value);
//    }
//
//    @E("vejo o número do Corretor no popup")
//    public void vejoONúmeroDoCorretorNoPopup() {
//        fichaCorretor.verificarNumeroPopup();
//    }
//
//    @E("vejo o botão Fechar popup")
//    public void vejoOBotãoFecharPopup() {
//        fichaCorretor.verificarFecharPopup();
//    }
//
//    @Então("clico no botão Fechar popup")
//    public void clicoNoBotãoFecharPopup() {
//        fichaCorretor.clicarFecharPopup();
//    }

    @Então("vejo que o número CRECI possui {string} no final")
    public void vejoQueONúmeroCRECIPossuiNoFinal(String value) {
        fichaCorretor.validarNumCreci(value);
    }

    @Então("vejo que há no máximo seis corretores listados")
    public void vejoQueHáNoMáximoSeisCorretoresListados() {
        fichaCorretor.validarQntCartaoCorretor();
    }
}
