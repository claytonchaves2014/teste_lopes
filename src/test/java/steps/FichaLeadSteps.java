package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FichaLead;
import support.BaseSteps;

public class FichaLeadSteps extends BaseSteps {

    private static FichaLead fichaLead = new FichaLead(driver);

    @Quando("vejo o formulário do Lead")
    public void vejoOFormulárioDoLead() {
        fichaLead.verificarFormulario();
    }

    @E("clico em Falar por Chat")
    public void clicoEmFalarPorChat() {
        fichaLead.clicarFalarChat();
    }

    @E("insiro meu Nome como {string}")
    public void insiroMeuNomeComo(String value) {
        fichaLead.inserirNome(value);
    }

    @E("insiro meu E-mail como {string}")
    public void insiroMeuEMailComo(String value) {
        fichaLead.inserirEmail(value);
    }

    @E("insiro meu Celular como {string}")
    public void insiroMeuCelularComo(String value) {
        fichaLead.inserirCelular(value);
    }

    @E("clico em Fale com o corretor")
    public void clicoEmFaleComOCorretor() {
        fichaLead.clicarFalarCorretor();
    }

    @Então("vejo a mensagem de lead enviado {string}")
    public void vejoAMensagemDeLeadEnviado(String value) {
        fichaLead.verificarEnvio(value);
    }

    @E("clico em Falar por WhatsApp")
    public void clicoEmFalarPorWhatsApp() {
        fichaLead.clicarFalarWhatsApp();
    }

    @E("clico em Falar por Telefone ou e-mail")
    public void clicoEmFalarPorTelefoneOuEMail() {
        fichaLead.clicarFalarTelefoneEmail();
    }

    @E("seleciono a opção por Telefone")
    public void selecionoAOpçãoPorTelefone() {
        fichaLead.selecionarTelefone();
    }

    @E("clico em Fale com especialista")
    public void clicoEmFaleComEspecialista() {
        fichaLead.clicarFalarEspecialista();
    }

    @E("seleciono a opção por E-mail")
    public void selecionoAOpçãoPorEMail() {
        fichaLead.selecionarEmail();
    }

    @Então("vejo o botão Falar por Chat")
    public void vejoOBotãoFalarPorChat() {
        fichaLead.verificarFalarChat();
    }

    @E("vejo o botão Falar por WhatsApp")
    public void vejoOBotãoFalarPorWhatsApp() {
        fichaLead.verificarWhatsApp();
    }

    @E("vejo o botão Telefone ou e-mail")
    public void vejoOBotãoTelefoneOuEMail() {
        fichaLead.verificarTelefoneEmail();
    }

    @Então("não vejo o botão Falar por Chat")
    public void nãoVejoOBotãoFalarPorChat() {
        fichaLead.verificarNaoFalarChat();
    }
}
