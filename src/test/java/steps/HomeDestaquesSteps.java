package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.HomeDestaques;
import support.BaseSteps;

public class HomeDestaquesSteps extends BaseSteps {

    private static HomeDestaques homeDestaques = new HomeDestaques(driver);

    @Dado("vejo o titulo dos destaques {string}")
    public void vejoOTituloDosDestaques(String value) {
        homeDestaques.validarTitulo(value);
    }

    @E("vejo o subtitulo dos destaques {string}")
    public void vejoOSubtituloDosDestaques(String value) {
        homeDestaques.validarSubtitulo(value);
    }

    @Quando("vejo os destaques de Lançamentos exclusivos")
    public void vejoOsDestaquesDeLançamentosExclusivos() {
        homeDestaques.validarLancExclusivos();
    }

    @Então("vejo o tipo do imóvel")
    public void vejoOTipoDoImóvel() {
        homeDestaques.validarTipoLancExclusivos();
    }

    @E("vejo o nome do empreendimento")
    public void vejoONomeDoEmpreendimento() {
        homeDestaques.validarNomeLanExclusivos();
    }

    @E("vejo o endereço do empreendimento")
    public void vejoOEndereçoDoEmpreendimento() {
        homeDestaques.validarEnderecoLanExclusivos();
    }

    @E("vejo a área do empreendimento")
    public void vejoAÁreaDoEmpreendimento() {
        homeDestaques.validarAreaLanExclusivos();
    }

    @E("vejo o estado da obra do empreendimento")
    public void vejoOEstadoDaObraDoEmpreendimento() {
        homeDestaques.validarObraLanExclusivos();
    }

    @E("vejo a quantidade de dormitórios do empreendimento")
    public void vejoAQuantidadeDeDormitóriosDoEmpreendimento() {
        homeDestaques.validarDormitorios();
    }

    @E("vejo a quantidade de chuveiros do empreendimento")
    public void vejoAQuantidadeDeChuveirosDoEmpreendimento() {
        homeDestaques.validarBanheiros();
    }

    @E("vejo a quantidade de vagas do empreendimento")
    public void vejoAQuantidadeDeVagasDoEmpreendimento() {
        homeDestaques.validarVagas();
    }

    @Quando("vejo os destaques de Próximos Lançamentos")
    public void vejoOsDestaquesDePróximosLançamentos() {
        homeDestaques.validarProxLancamentos();
    }

    @Então("vejo o tipo do imóvel de Próximos Lançamentos")
    public void vejoOTipoDoImóvelDePróximosLançamentos() {
        homeDestaques.validarTipoProxLanc();
    }

    @E("vejo o nome do empreendimento de Próximos Lançamentos")
    public void vejoONomeDoEmpreendimentoDePróximosLançamentos() {
        homeDestaques.validarNomeProxLanc();
    }

    @E("vejo o endereço do empreendimento de Próximos Lançamentos")
    public void vejoOEndereçoDoEmpreendimentoDePróximosLançamentos() {
        homeDestaques.validarEnderecoProxLanc();
    }

    @E("vejo a área do empreendimento de Próximos Lançamentos")
    public void vejoAÁreaDoEmpreendimentoDePróximosLançamentos() {
        homeDestaques.validarAreaProxLanc();
    }

    @E("vejo o estado da obra do empreendimento de Próximos Lançamentos")
    public void vejoOEstadoDaObraDoEmpreendimentoDePróximosLançamentos() {
        homeDestaques.validarObraProxLanc();
    }
}
