package PageObjects.portal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home {
    //    HEADER
    public static @FindBy(how = How.CLASS_NAME, using = "header__button header__link")
    WebElement btn_logo;
    public static @FindBy(how = How.ID, using = "logo_menu_header-Lançamentos")
    WebElement btn_lancamentos;
    public static @FindBy(how = How.ID, using = "logo_menu_header-Prontos")
    WebElement btn_prontos;
    public static @FindBy(how = How.ID, using = "logo_menu_header-Aluguel")
    WebElement btn_aluguel;
    public static @FindBy(how = How.ID, using = "logo_menu_header-Anuncie seu Imóvel")
    WebElement btn_anuncieSeuImovel;
    public static @FindBy(how = How.ID, using = "logo_menu_header-Seja Franqueado")
    WebElement btn_sejaFranqueado;
    public static @FindBy(how = How.ID, using = "logo_menu_header-Calculadora de Compra")
    WebElement btn_calculadoraDeCompra;
    public static @FindBy(how = How.CLASS_NAME, using = "header__contact-us--text")
    WebElement btn_faleConosco;
    public static @FindBy(how = How.CLASS_NAME, using = "bookmark-counter-component")
    WebElement btn_favoritos;
    public static @FindBy(how = How.CLASS_NAME, using = "header__login__text")
    WebElement btn_minhaConta;

    //    ENCONTRE SEU LUGAR
    public static @FindBy(how = How.CLASS_NAME, using = "search-title ng-star-inserted")
    WebElement tituloHome;

    //    BUSCA
    public static @FindBy(how = How.XPATH, using = "//span[contains(text(),'Comprar')]")
    WebElement abaComprar;
    public static @FindBy(how = How.XPATH, using = "//span[contains(text(),'Alugar')]")
    WebElement abaAlugar;
    public static @FindBy(how = How.ID, using = "search-input")
    WebElement imputBusca;
    public static @FindBy(how = How.CLASS_NAME, using = "search_btn ant-btn ant-btn-primary")
    WebElement btn_buscar;
    public static @FindBy(how = How.CLASS_NAME, using = "filter_btn ant-btn ant-btn-link")
    WebElement btn_filtros;
    public static @FindBy(how = How.XPATH, using = "//label[@class='checkbox__label']//*[local-name()='svg']")
    WebElement check_buscarPeloCodigoDoImovel;

    //    MENSAGENS
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Milhares de opções para encontrar')]")
    WebElement titulo1;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'o imóvel que combina com você')]")
    WebElement decricao1;

    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Uma rede nacional com mais de')]")
    WebElement titulo2;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'9 mil consultores locais especializados')]")
    WebElement decricao2;

    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Inteligência de mercado para')]")
    WebElement titulo3;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'te ajudar a fazer o melhor negócio')]")
    WebElement decricao3;

//    SELEÇÂO
    public static @FindBy(how = How.CLASS_NAME, using = "card-imoveis-title ng-star-inserted")
    WebElement tituloSelecao;
    public static @FindBy(how = How.CLASS_NAME, using = "card-imoveis-subtitle")
    WebElement subTituloSelecao;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Lançamentos')]")
    WebElement topicoLancamentos;

    public static @FindBy(how = How.CSS, using = "lps-home.ng-star-inserted:nth-child(2) div.home_container.already_chat_open div.ng-star-inserted div.item-card-imoveis.cards-margin.ng-star-inserted:nth-child(3) section.card-section.card-section__new.ng-star-inserted:nth-child(2) div.cardlist-wrapper:nth-child(1) ul.cardlist.cardlist--home.ng-star-inserted li.cardlist__item.ng-star-inserted:nth-child(1) lps-card-product:nth-child(1) lps-link-product:nth-child(1) div.card.ng-star-inserted > a:nth-child(1))")
    WebElement cardLancamentos;
    


}
