package steps;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.AnuncieSeuImovel;
import support.BaseSteps;


public class AnuncieSeuImovelSteps extends BaseSteps {


    private static AnuncieSeuImovel anuncieSeuImovel = new AnuncieSeuImovel(driver);


    @E("clico no header Anuncie Seu Imovel")
    public void clicoAnuncieSeuImovel() { anuncieSeuImovel.clicarAnuncieSeuImovel(); }

    @E("informo o nome {string} do Anunciante")
    public void preenchoNomeDoAnunciante(String value) {
        anuncieSeuImovel.informarNome(value);
    }

    @E("preencho o Email {string} do Anunciante")
    public void preenchoEmailDoAnunciante(String value) { anuncieSeuImovel.informarEmail(value); }

    @E("preencho o Telefone {string} do Anunciante")
    public void preenchoTelefoneAnunciante(String value) {
        anuncieSeuImovel.informarTelefone(value);
    }

    @E("clico na opção {string}")
    public void clicoNaOpcao(String value){
        anuncieSeuImovel.clicarOpcao(value); }

   @E("seleciono o tipo de imovel {string}")
   public void selecionoTipoImovel(String value) throws InterruptedException {
        anuncieSeuImovel.selecionarImovel(value);
    }

    @E("informo o CEP {string}")
    public void preenchoCep(String value) throws InterruptedException {
        anuncieSeuImovel.informarCEP(value);
    }

    @E("informo o endereco {string}")
    public void digitoEndereco(String value) {
        anuncieSeuImovel.informarEndereco(value);
    }

    @E("informo o numero do endereco {string}")
    public void preenchoNumEndereco(String value) {
        anuncieSeuImovel.informarNumEndereco(value);
    }
    @E("informo o cpf{string}")
    public void preenchocpf(String value) {
        anuncieSeuImovel.informarcpf(value);
    }

    @Quando("informo o Bairro {string}")
    public void informoBairro(String value) {
        anuncieSeuImovel.informarBairro(value);
    }

    @E("clico no botao Enviar")
    public void clicoBtnEnviar() {
        anuncieSeuImovel.clicarBtnEnviar();
    }

    @Então("vejo a mensagem {string}")
    public void vejoAMensagemFormularioEnviado(String value) {
        anuncieSeuImovel.verificarEnvioFormulario(value);
    }
    @Então("vejo a mensagem para preencher seu nome {string}")
    public void vejoAMensagemVerificarNome(String value) {

        anuncieSeuImovel.verificarNomeInvalido(value);
    }
    @Então("vejo a mensagem para preencher seu email {string}")
    public void vejoAMensagemVerificarEmail(String value) {

        anuncieSeuImovel.verificarEmailInvalido(value);
    }
    @Então("vejo a mensagem para preencher seu telefone {string}")
    public void vejoAMensagemVerificarTelefone(String value) {

        anuncieSeuImovel.verificarTelefoneInvalido(value);
    }
    @Então("vejo a mensagem para selecionar uma opção de imovel {string}")
    public void vejoAMensagemVerificarOpcaoImovel (String value) {
        anuncieSeuImovel.verificarOpcaoSemPreenchimento(value);
    }
    @Então("vejo a mensagem para selecionar o tipo de Imovel {string}")
    public void vejoAMensagemVerificarTipoImovel (String value) {
        anuncieSeuImovel.verificarOpcaoSemTipoImovel(value);
    }

}









