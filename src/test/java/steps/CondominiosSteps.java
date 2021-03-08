package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Condominios;
import pages.HomeFooter;
import support.BaseSteps;

public class CondominiosSteps extends BaseSteps {

    private static Condominios condominios = new Condominios(driver);
    private static HomeFooter footer = new HomeFooter(driver);

    @Quando("vejo o título {string} da página de Condomínios")
    public void vejoOTítuloDaPáginaDeCondomínios(String value) {
        condominios.validarTitulo(value);
    }

    @Quando("clico no link {string} da página de Condomínios")
    public void clicoNoLinkDaPáginaDeCondomínios(String value) throws InterruptedException {
        condominios.clicarLink(value);
    }

    @E("vejo a lista com no máximo {string} links")
    public void vejoAListaComNoMáximoLinks(String value) {
        condominios.contarLinksCidades(value);
    }

    @E("vejo a paginação da lista de condomínios")
    public void vejoAPaginaçãoDaListaDeCondomínios() {
        condominios.validarPaginacao();
    }

    @Quando("clico seleciono um condomínio")
    public void clicoSelecionoUmCondomínio() {
        condominios.selecionarCondominio();
    }

    @E("vejo o botão Ver Imóveis")
    public void vejoOBotãoVerImóveis() {
        condominios.verificarVerImoveis();
    }

    @E("clico em Ver Imóveis")
    public void clicoEmVerImóveis() {
        condominios.clicarVerImoveis();
        footer.trocarJanela();
    }

    @Entao("vejo a imagem default do Condomínio")
    public void vejoAImagemDefaultDoCondomínio() {
        condominios.verificarImagem();
    }

    @E("vejo o nome do condomínio")
    public void vejoONomeDoCondomínio() {
        condominios.verificarNomeCondominio();
    }

    @E("vejo o endereço do condomínio")
    public void vejoOEndereçoDoCondomínio() {
        condominios.verificarEndereco();
    }

    @E("vejo os atributos do condomínio")
    public void vejoOsAtributosDoCondomínio() {
        condominios.verificarAtributos();
    }

    @E("vejo as instalações do condomínio")
    public void vejoAsInstalaçõesDoCondomínio() {
        condominios.verificarInstalacoes();
    }

    @E("vejo o texto {string} em Ver Imóveis")
    public void vejoOTextoEmVerImóveis(String value) {
        condominios.verificarTextVerImoveis(value);
    }

    @E("vejo o link {string} em Ver Imóveis")
    public void vejoOLinkEmVerImóveis(String value) {
        condominios.verificarLinkVerImoveis(value);
    }

    @E("vejo o breadcrumb na página do Condomínio")
    public void vejoOBreadcrumbNaPáginaDoCondomínio() {
        condominios.verificarBreadcrump();
    }

    @E("clico em Entre em contato com a Lopes")
    public void clicoEmEntreEmContatoComALopes() {
        condominios.clicarEntrarContato();
        footer.trocarJanela();
    }

    @E("clico em Ver mais do Veja também")
    public void clicoEmVerMaisDoVejaTambém() {
        condominios.clicarVerMaisVejaTambem();
    }

    @Então("vejo o link {string}")
    public void vejoOLink(String value) {
        condominios.verificarCondominioVejaTambem(value);
    }

    @E("clico no link {string}")
    public void clicoNoLink(String value) {
        condominios.clicarCondominioVejaTambem(value);
    }
}
