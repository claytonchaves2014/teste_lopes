package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Calculadora;
import support.BaseSteps;

public class CalculadoraSteps extends BaseSteps {

    private static Calculadora calculadora = new Calculadora(driver);

    @Dado("insiro {string} como Renda Familiar Mensal")
    public void insiroComoRendaFamiliarMensal(String value) {
        calculadora.addRendaFamiliar(value);
    }

    @E("insiro {string} como Entrada")
    public void insiroComoEntrada(String value) {
        calculadora.addEntrada(value);
    }

    @E("insiro {string} como FGTS")
    public void insiroComoFGTS(String value) {
        calculadora.addFGTS(value);
    }

    @E("clico no botão Calcular")
    public void clicoNoBotãoCalcular() {
        calculadora.clicarCalcular();
    }

    @Quando("clico em Imóveis Prontos")
    public void clicoEmImóveisProntos() {
        calculadora.clicarImoveisProntos();
    }

    @Então("visualizo o formulário do lead")
    public void visualizoOFormulárioDoLead() {
        calculadora.verificarFormulario();
    }

    @E("insiro meu nome {string}")
    public void insiroMeuNome(String value) {
        calculadora.inserirNome(value);
    }

    @E("seleciono meu estado {string}")
    public void selecionoMeuEstado(String value) throws InterruptedException {
        calculadora.inserirEstado(value);
    }

    @E("seleciono minha cidade {string}")
    public void selecionoMinhaCidade(String value) throws InterruptedException {
        calculadora.inserirCidade(value);
    }

    @E("insiro meu Telefone {string}")
    public void insiroMeuTelefone(String value) {
        calculadora.inserirTelefone(value);
    }

    @E("insiro meu E-mail {string}")
    public void insiroMeuEMail(String value) {
        calculadora.inserirEmail(value);
    }

    @E("seleciono minha preferencia de contato {string}")
    public void selecionoMinhaPreferenciaDeContato(String value) {
        calculadora.selecionarContato(value);
    }

    @E("clico em Receber sugestões")
    public void clicoEmReceberSugestões() {
        calculadora.clicarReceberSugestao();
    }

    @Então("visualizo a mensagem {string}")
    public void visualizoAMensagem(String value) {
        calculadora.verificarMensagem(value);
    }

    @Quando("clico em Procurar imóveis prontos")
    public void clicoEmProcurarImóveisProntos() {
        calculadora.clicarProcurarImoveis();
    }

    @Dado("clico em Calcular com base em parcelas")
    public void clicoEmCalcularComBaseEmParcelas() {
        calculadora.clicarCalcularParcelas();
    }
}
