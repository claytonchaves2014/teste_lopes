package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import pages.SiteCorretorEditar;
import support.BaseSteps;

public class SiteCorretorEditarSteps extends BaseSteps {

    private static SiteCorretorEditar siteCorretorEditar = new SiteCorretorEditar(driver);

    @Então("visualizo o botão Editar")
    public void visualizoOBotãoEditar() {
        siteCorretorEditar.visualizarBtnEditar();
    }

    @E("clico no botão Editar")
    public void clicoNoBotãoEditar() {
        siteCorretorEditar.clicarBtnEditar();
    }

    @Então("visualizo o campo Telefone Principal")
    public void visualizoOCampoTelefonePrincipal() {
        siteCorretorEditar.visualizarTelPrincipal();
    }

    @E("visualizo o campo Telefone Alternativo")
    public void visualizoOCampoTelefoneAlternativo() {
        siteCorretorEditar.visualizarTelAlternativo();
    }

    @E("visualizo o texto abaixo dos telefones {string}")
    public void visualizoOTextoAbaixoDosTelefones(String value) {
        siteCorretorEditar.visualizarTxtWhatsApp(value);
    }

    @E("visualizo o campo E-mail")
    public void visualizoOCampoEMail() {
        siteCorretorEditar.visualizarEmail();
    }

    @E("visualizo o campo Biografia")
    public void visualizoOCampoBiografia() {
        siteCorretorEditar.visualizarBiografia();
    }

    @E("visualizo o botão Cancelar")
    public void visualizoOBotãoCancelar() {
        siteCorretorEditar.visualizarBtnCancelar();
    }

    @E("visualizo o botão Salvar")
    public void visualizoOBotãoSalvar() {
        siteCorretorEditar.visualizarBtnSalvar();
    }

    @E("clico no botão Cancelar")
    public void clicoNoBotãoCancelar() {
        siteCorretorEditar.clicarBtnCancelar();
    }

    @Então("o modal do Editar é fechado")
    public void oModalDoEditarÉFechado() {
        siteCorretorEditar.validarModalFechado();
    }

    @Então("não visualizo o botão Editar")
    public void nãoVisualizoOBotãoEditar() {
        siteCorretorEditar.validarPerfilPublico();
    }

    @E("insiro o número {string} no campo Telefone Principal")
    public void insiroONúmeroNoCampoTelefonePrincipal(String value) {
        siteCorretorEditar.inserirTelefonePrincipal(value);
    }

    @Então("clico em Salvar")
    public void clicoEmSalvar() {
        siteCorretorEditar.clicarBtnSalvar();
    }

    @E("insiro o número {string} no campo Telefone Alternativo")
    public void insiroONúmeroNoCampoTelefoneAlternativo(String value) {
        siteCorretorEditar.inserirTelefoneAlternativo(value);
    }

    @E("deixo o Telefone Principal em branco")
    public void deixoOTelefonePrincipalEmBranco() {
        siteCorretorEditar.inserirTelPrincipalBranco();
    }

    @Então("vejo a mensagem de validação {string} no Telefone Principal")
    public void vejoAMensagemDeValidaçãoNoTelefonePrincipal(String value) {
        siteCorretorEditar.msgValidacaoTelPrincipal(value);
    }

    @Então("vejo a mensagem de validação {string} no Telefone Alternativo")
    public void vejoAMensagemDeValidaçãoNoTelefoneAlternativo(String value) {
        siteCorretorEditar.msgValidacaoTelAlternativo(value);
    }

    @E("deixo o Telefone Alternativo em branco")
    public void deixoOTelefoneAlternativoEmBranco() {
        siteCorretorEditar.inserirTelAlternativoBranco();
    }

    @E("clico do dropdown para trocar o país do Telefone Principal")
    public void clicoDoDropdownParaTrocarOPaísDoTelefonePrincipal() {
        siteCorretorEditar.dropdownTelPrincipal();
    }

    @E("seleciono o país {string} para Telefone Principal")
    public void selecionoOPaísParaTelefonePrincipal(String value) {
        siteCorretorEditar.selecionarPaisTelPrincipal(value);
    }

    @E("clico do dropdown para trocar o país do Telefone Alternativo")
    public void clicoDoDropdownParaTrocarOPaísDoTelefoneAlternativo() {
        siteCorretorEditar.dropdownTelAlternativo();

    }

    @E("seleciono o país {string} para Telefone Alternativo")
    public void selecionoOPaísParaTelefoneAlternativo(String value) {
        siteCorretorEditar.selecionarPaisTelAlternativo(value);
    }

    @E("insiro {string} na Biografia do Corretor")
    public void insiroNaBiografiaDoCorretor(String value) {
        siteCorretorEditar.inserirBiografia(value);
    }

    @Então("vejo o máximo de caracteres da Biografia é de {string}")
    public void vejoOMáximoDeCaracteresDaBiografiaÉDe(String value) {
        siteCorretorEditar.validarBiografia(value);
    }
}
