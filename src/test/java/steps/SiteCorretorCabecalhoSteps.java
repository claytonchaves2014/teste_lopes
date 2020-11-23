package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.SiteCorretorCabecalho;
import support.BaseSteps;

public class SiteCorretorCabecalhoSteps extends BaseSteps {

    private static SiteCorretorCabecalho siteCorretorCabecalho = new SiteCorretorCabecalho(driver);

    @Quando("verifico o cabeçalho do Site do Corretor")
    public void verificoOCabeçalhoDoSiteDoCorretor() {
        siteCorretorCabecalho.verificarCabecalho();
    }

    @Então("vejo a Foto do Corretor no cabeçalho")
    public void vejoAFotoDoCorretorNoCabeçalho() {
        siteCorretorCabecalho.verificarFoto();
    }

    @E("vejo o Apelido do Corretor  como {string} no cabeçalho")
    public void vejoOApelidoDoCorretorComoNoCabeçalho(String value) {
        siteCorretorCabecalho.verificarApelido(value);
    }

    @E("vejo o Nome completo do Corretor como {string} no cabeçalho")
    public void vejoONomeCompletoDoCorretorComoNoCabeçalho(String value) {
        siteCorretorCabecalho.verificarNomeCompleto(value);
    }

    @E("vejo o Título do Corretor como {string} no cabeçalho")
    public void vejoOTítuloDoCorretorComoNoCabeçalho(String value) {
        siteCorretorCabecalho.verificarTitulo(value);
    }

    @E("vejo o CRECI do Corretor como {string} no cabeçalho")
    public void vejoOCRECIDoCorretorComoNoCabeçalho(String value) {
        siteCorretorCabecalho.verificarCRECI(value);
    }

    @E("vejo a descrição do Corretor como {string} no cabeçalho")
    public void vejoADescriçãoDoCorretorComoNoCabeçalho(String value) {
        siteCorretorCabecalho.verificarDescricao(value);
    }

    @E("vejo o botão Entrar em contato no cabeçalho")
    public void vejoOBotãoEntrarEmContatoNoCabeçalho() {
        siteCorretorCabecalho.verificarBtnEntrarContato();
    }

    @E("vejo o botão Whatsapp no cabeçalho")
    public void vejoOBotãoWhatsappNoCabeçalho() {
        siteCorretorCabecalho.verificarBtnWhatsApp();
    }

    @Quando("clico em Entrar em contato")
    public void clicoEmEntrarEmContato() {
        siteCorretorCabecalho.clicarBtnEntrarContato();
    }

    @E("insiro meu Telefone como {string}")
    public void insiroMeuTelefoneComo(String value) {
        siteCorretorCabecalho.inserirTelefone(value);
    }

    @E("seleciono minha forma de contato como {string}")
    public void selecionoMinhaFormaDeContatoComo(String value) {
        siteCorretorCabecalho.selecionarFormaContato(value);
    }

    @E("clico no botão Enviar")
    public void clicoNoBotãoEnviar() {
        siteCorretorCabecalho.clicarBtnEnviar();
    }

    @Quando("clico em Whatsapp")
    public void clicoEmWhatsapp() {
        siteCorretorCabecalho.clicarWhatsapp();
    }

    @E("deixo meu Nome em branco")
    public void deixoMeuNomeEmBranco() {
        siteCorretorCabecalho.inserirBrancoNome();
    }

    @E("deixo meu Email em branco")
    public void deixoMeuEmailEmBranco() {
        siteCorretorCabecalho.inserirBrancoEmail();
    }

    @E("deixo meu Telefone em branco")
    public void deixoMeuTelefoneEmBranco() {
        siteCorretorCabecalho.inserirBrancoTelefone();
    }

    @E("deixo a Forma de Contato em branco")
    public void deixoAFormaDeContatoEmBranco() throws InterruptedException {
        siteCorretorCabecalho.inserirBrancoFormaContato();
    }

    @Então("vejo a mensagem de validação {string} no campo Nome")
    public void vejoAMensagemDeValidaçãoNoCampoNome(String value) {
        siteCorretorCabecalho.validacaoNome(value);
    }

    @E("vejo a mensagem de validação {string} no campo Email")
    public void vejoAMensagemDeValidaçãoNoCampoEmail(String value) {
        siteCorretorCabecalho.validacaoEmail(value);
    }

    @E("vejo a mensagem de validação {string} no campo Telefone")
    public void vejoAMensagemDeValidaçãoNoCampoTelefone(String value) {
        siteCorretorCabecalho.validacaoTelefone(value);
    }

    @E("vejo a mensagem de validação {string} no campo Forma de Contato")
    public void vejoAMensagemDeValidaçãoNoCampoFormaDeContato(String value) {
        siteCorretorCabecalho.validacaoFormaContato(value);
    }

    @E("vejo a biografia do Corretor no cabeçalho")
    public void vejoABiografiaDoCorretorNoCabeçalho() {
        siteCorretorCabecalho.verificarBiografia();
    }
}
