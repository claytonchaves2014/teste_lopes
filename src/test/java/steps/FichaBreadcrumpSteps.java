package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FichaBreadcrump;
import support.BaseSteps;

public class FichaBreadcrumpSteps extends BaseSteps {

    private static FichaBreadcrump fichaBreadcrump = new FichaBreadcrump(driver);

    @Quando("clico para abrir o Breadcrump")
    public void clicoParaAbrirOBreadcrump() {
        fichaBreadcrump.clicarBreadcrump();
    }

    @Então("vejo o breadcrump Detalhes do imóvel")
    public void vejoOBreadcrumpDetalhesDoImóvel() {
        fichaBreadcrump.verificarDetalhes();
    }

    @E("vejo o breadcrump Rua do imóvel")
    public void vejoOBreadcrumpRuaDoImóvel() {
        fichaBreadcrump.verificarRua();
    }

    @E("vejo o breadcrump Bairro do imóvel")
    public void vejoOBreadcrumpBairroDoImóvel() {
        fichaBreadcrump.verificarBairro();
    }

    @E("vejo o breadcrump Tipo do imóvel")
    public void vejoOBreadcrumpTipoDoImóvel() {
        fichaBreadcrump.verificarTipo();
    }

    @E("vejo o breadcrump Home")
    public void vejoOBreadcrumpHome() {
        fichaBreadcrump.verificarHome();
    }

    @E("clico no breacrump Rua")
    public void clicoNoBreacrumpRua() {
        fichaBreadcrump.clicarRua();
    }

    @E("clico no breacrump Bairro")
    public void clicoNoBreacrumpBairro() {
        fichaBreadcrump.clicarBairro();
    }

    @E("clico no breacrump Tipo do Imóvel")
    public void clicoNoBreacrumpTipoDoImóvel() {
        fichaBreadcrump.clicarTipo();
    }

    @E("clico no breacrump Home")
    public void clicoNoBreacrumpHome() {
        fichaBreadcrump.clicarHome();
    }
}
