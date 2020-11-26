package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Login;
import support.BaseSteps;

public class LoginSteps extends BaseSteps {

    private static Login login = new Login(driver);

    @Dado("clico em Minha conta")
    public void clicoEmMinhaConta() {
        login.clicarMinhaConta();
    }

    @Quando("insiro meu E-mail com {string}")
    public void insiroMeuEMailCom(String value) {
        login.inserirEmail(value);
    }

    @E("insiro minha Senha com {string}")
    public void insiroMinhaSenhaCom(String value) {
        login.inserirSenha(value);
    }

    @E("clico em Entrar")
    public void clicoEmEntrar() throws InterruptedException {
        login.clicarEntrar();
    }

    @Então("acesso a minha conta")
    public void acessoAMinhaConta() {
        login.verificarProfile();
    }

    @Então("vejo a mensagem de login inválido {string}")
    public void vejoAMensagemDeLoginInválido(String value) {
        login.validarLoginInvalido(value);
    }

    @Quando("clico em Esqueceu a senha")
    public void clicoEmEsqueceuASenha() {
        login.clicarEsqueceuSenha();
    }

    @E("insiro meu E-mail para recuperar senha com {string}")
    public void insiroMeuEMailParaRecuperarSenhaCom(String value) {
        login.inserirValidarEmail(value);
    }

    @E("clico em Enviar")
    public void clicoEmEnviar() {
        login.clicarEnviar();
    }

    @Então("vejo as instruções para recuperar a senha {string}")
    public void vejoAsInstruçõesParaRecuperarASenha(String value) {
        login.validarInstrucoes(value);
    }

    @Quando("clico em Corretor")
    public void clicoEmCorretor() {
        login.clicarCorretor();
    }

    @E("insiro meu CPF de corretor {string}")
    public void insiroMeuCPFDeCorretor(String value) {
        login.inserirCPFCorretor(value);
    }

    @E("insiro minha Senha de corretor {string}")
    public void insiroMinhaSenhaDeCorretor(String value) {
        login.inserirSenhaCorretor(value);
    }

    @io.cucumber.java.pt.Então("acesso a conta do Corretor")
    public void acessoAContaDoCorretor() {
        login.validarContaCorretor();
    }

    @Então("sou direcionado ao Portal do Corretor pela URL {string}")
    public void souDirecionadoAoPortalDoCorretorPelaURL(String value) {
        login.validarAcessoCorretor(value);
    }

    @Então("vejo o menu de aplicações")
    public void vejoOMenuDeAplicações() throws InterruptedException {
        login.validarAplicacoes();
    }

    @E("clico em Aplicações")
    public void clicoEmAplicações() {
        login.clicarAplicacoes();
    }

    @E("clico na aplicação CMS")
    public void clicoNaAplicaçãoCMS() {
        login.clicarCMS();
    }

    @E("clico na aplicação BI")
    public void clicoNaAplicaçãoBI() {
        login.clicarBI();
    }

    @E("vejo a aplicação {string}")
    public void vejoAAplicação(String value) {
        login.validarCRM(value);
    }

    @Então("clico em Aplicações do Agente")
    public void clicoEmAplicaçõesDoAgente() {
        login.clicarAplicacoesAgentes();
    }
}
