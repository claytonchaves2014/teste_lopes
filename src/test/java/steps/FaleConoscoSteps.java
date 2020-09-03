package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FaleConosco;
import support.BaseSteps;

public class FaleConoscoSteps extends BaseSteps {

    private static FaleConosco faleConosco = new FaleConosco(driver);

    @Quando("vejo o titulo de Fale conosco como {string}")
    public void vejoOTituloDeFaleConoscoComo(String value) {
        faleConosco.verificarTitulo(value);
    }

    @E("vejo o banner do Fale conosco")
    public void vejoOBannerDoFaleConosco() {
        faleConosco.verificarBanner();
    }

    @Então("vejo o formulário para entrar em contato")
    public void vejoOFormulárioParaEntrarEmContato() {
        faleConosco.componenteFormulario();
    }

    @Quando("clico em Assunto do Fale conosco")
    public void clicoEmAssuntoDoFaleConosco() throws InterruptedException {
        faleConosco.clicarAssunto();
    }

    @E("seleciono a opção {string} de contato")
    public void selecionoAOpçãoDeContato(String value) {
        faleConosco.selecionarAssunto(value);
    }

    @E("preencho meu Nome {string} em Fale conosco")
    public void preenchoMeuNomeEmFaleConosco(String value) {
        faleConosco.inserirNome(value);
    }

    @E("preencho meu Email {string} em Fale conosco")
    public void preenchoMeuEmailEmFaleConosco(String value) {
        faleConosco.inserirEmail(value);
    }

    @E("preencho meu Telefone {string} em Fale conosco")
    public void preenchoMeuTelefoneEmFaleConosco(String value) {
        faleConosco.inserirTelefone(value);
    }

    @E("clico em Prefiro ser contatado por")
    public void clicoEmPrefiroSerContatadoPor() throws InterruptedException {
        faleConosco.clickContato();
    }

    @E("preencho minha Forma de Contato {string} em Fale conosco")
    public void preenchoMinhaFormaDeContatoEmFaleConosco(String value) throws InterruptedException {
        faleConosco.selecionarContato(value);
    }

    @E("preencho minha Mensagem {string} em Fale conosco")
    public void preenchoMinhaMensagemEmFaleConosco(String value) {
        faleConosco.inserirMensagem(value);
    }

    @E("clico em Enviar contato")
    public void clicoEmEnviarContato() {
        faleConosco.clicarEnviar();
    }
}
