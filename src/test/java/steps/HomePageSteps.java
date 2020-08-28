package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomePage;
import support.BaseSteps;

public class HomePageSteps extends BaseSteps {

    private static HomePage homePage = new HomePage(driver);

    @Dado("visualizo o componente de informações")
    public void visualizoOComponenteDeInformações() {
        homePage.verificarComponente();
    }

    @Quando("vejo a primeira informação como {string} e descrição {string}")
    public void vejoAPrimeiraInformaçãoComoEDescrição(String titulo, String descricao) {
        homePage.primeiroTitulo(titulo);
        homePage.primeiroDescricao(descricao);
    }

    @E("vejo a segunda informação como {string} e descrição {string}")
    public void vejoASegundaInformaçãoComoEDescrição(String titulo, String descricao) {
        homePage.segundoTitulo(titulo);
        homePage.segundoDescricao(descricao);
    }

    @Então("vejo a terceira informação como {string} e descrição {string}")
    public void vejoATerceiraInformaçãoComoEDescrição(String titulo, String descricao) {
        homePage.terceiroTitulo(titulo);
        homePage.terceiroDescricao(descricao);
    }
}
