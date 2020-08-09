package PageObjects.portal;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import stepDefinitions.Commons;

import static stepDefinitions.Commons.driver;

public class Home {
    //    HEADER
    public static @FindBy(how = How.CLASS_NAME, using = "header__button header__link")
    WebElement btn_logo;
    public static @FindBy(how = How.XPATH, using = "//a[@id='logo_menu_header-Lançamentos']")
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

    public static @FindBy(how = How.CLASS_NAME, using = "chat_trigger ng-star-inserted")
    WebElement btn_chat;

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
    public static @FindBy(how = How.XPATH, using = "//input[@class='search_btn ant-btn ant-btn-primary']")
    WebElement btn_buscar;
    public static @FindBy(how = How.CLASS_NAME, using = "filter_btn ant-btn ant-btn-link")
    WebElement btn_filtros;
    public static @FindBy(how = How.XPATH, using = "//label[@class='checkbox__label']//*[local-name()='svg']")
    WebElement check_buscarPeloCodigoDoImovel;
    public static @FindBy(how = How.XPATH, using = "//div[@class='search-input__dropdown-new search-input__dropdown']")
    WebElement autoComplete;

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

    //    LANÇAMENTOS EXCLUSIVOS
    public static @FindBy(how = How.XPATH, using = "//section[@class='card-section card-section__new ng-star-inserted']//li[1]")
    WebElement cardLancamentosExclusivos1;
    public static @FindBy(how = How.XPATH, using = "//section[@class='card-section card-section__new ng-star-inserted']//li[1]//lps-card-product[1]//lps-link-product[1]//div[1]//a[1]//div[1]//img[1]")
    WebElement imagemLancamentosExclusivos1;
    public static @FindBy(how = How.XPATH, using = "//section[@class='card-section card-section__new ng-star-inserted']//li[1]//lps-card-product[1]//lps-link-product[1]//div[1]//a[1]//article[1]//div[1]//p[1]")
    WebElement typeLancamentosExclusivos1;
    public static @FindBy(how = How.CSS, using = "lps-home.ng-star-inserted:nth-child(2) div.home_container.already_chat_open div.ng-star-inserted div.item-card-imoveis.cards-margin.ng-star-inserted:nth-child(3) section.card-section.card-section__new.ng-star-inserted:nth-child(2) div.cardlist-wrapper:nth-child(1) ul.cardlist.cardlist--home.ng-star-inserted li.cardlist__item.ng-star-inserted:nth-child(1) div.card.ng-star-inserted a:nth-child(1) article.card__textbox.ng-star-inserted div.card__textbox_container > p.card__name:nth-child(3)")
    WebElement nomeLancamentosExclusivos1;
    public static @FindBy(how = How.CSS, using = "lps-home.ng-star-inserted:nth-child(2) div.home_container.already_chat_open div.ng-star-inserted div.item-card-imoveis.cards-margin.ng-star-inserted:nth-child(3) section.card-section.card-section__new.ng-star-inserted:nth-child(2) div.cardlist-wrapper:nth-child(1) ul.cardlist.cardlist--home.ng-star-inserted li.cardlist__item.ng-star-inserted:nth-child(1) div.card.ng-star-inserted a:nth-child(1) article.card__textbox.ng-star-inserted div.card__textbox_container > p.card__location:nth-child(4)")
    WebElement enderecoLancamentosExclusivos1;
    public static @FindBy(how = How.CSS, using = "lps-home.ng-star-inserted:nth-child(2) div.home_container.already_chat_open div.ng-star-inserted div.item-card-imoveis.cards-margin.ng-star-inserted:nth-child(3) section.card-section.card-section__new.ng-star-inserted:nth-child(2) div.cardlist-wrapper:nth-child(1) ul.cardlist.cardlist--home.ng-star-inserted li.cardlist__item.ng-star-inserted:nth-child(1) div.card.ng-star-inserted a:nth-child(1) article.card__textbox.ng-star-inserted div.card__textbox_container > p.card__location:nth-child(5)")
    WebElement enderecoComplementoLancamentosExclusivos1;
    public static @FindBy(how = How.CSS, using = "lps-home.ng-star-inserted:nth-child(2) div.home_container.already_chat_open div.ng-star-inserted div.item-card-imoveis.cards-margin.ng-star-inserted:nth-child(3) section.card-section.card-section__new.ng-star-inserted:nth-child(2) div.cardlist-wrapper:nth-child(1) ul.cardlist.cardlist--home.ng-star-inserted li.cardlist__item.ng-star-inserted:nth-child(1) div.card.ng-star-inserted a:nth-child(1) article.card__textbox.ng-star-inserted lps-attributes.card__attributes > div.attributes")
    WebElement atributosLancamentosExclusivos1;
    public static @FindBy(how = How.XPATH, using = "//section[@class='card-section card-section__new ng-star-inserted']//li[1]//lps-card-product[1]//lps-link-product[1]//div[1]//a[1]//article[1]//div[1]//div[1]//lps-bookmark[1]//div[1]//div[1]//*[local-name()='svg']")
    WebElement iconeFavoritoLancamentosExclusivos1;

    //    PROXIMOS LANÇAMENTOS
    public static @FindBy(how = How.XPATH, using = "//section[@class='card-section card-section__ready ng-star-inserted']//li[1]")
    WebElement cardProximosLancamentos1;

    public static @FindBy(how = How.CLASS_NAME, using = "ant-btn ant-btn-primary ant-btn-background-ghost")
    WebElement btn_verMaisDetalhes;

    public static @FindBy(how = How.CLASS_NAME, using = "credipronto")
    WebElement bannerCredPronto;

    //    EXPLORE COM A LOPES

    //    REGIÕES
    public static @FindBy(how = How.CLASS_NAME, using = "lps-button-base lps-button-secondary")
    WebElement btn_verTodasAsRegiões;

    //    SOLUÇÕES
    public static @FindBy(how = How.ID, using = "card-service-Anuncie seu imóvel")
    WebElement card_anuncieSeuImovel;
    public static @FindBy(how = How.ID, using = "card-service-Financiamento")
    WebElement card_financiamento;
    public static @FindBy(how = How.ID, using = "card-service-Seja um franqueado")
    WebElement card_sejaFranquado;
    public static @FindBy(how = How.ID, using = "card-service-Serviços de fotografia")
    WebElement card_servicosDeFotografia;


    //    FOOTER

    //    A LOPES
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Quem Somos')]")
    WebElement quemSomos;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Assessoria de Comunicação')]")
    WebElement assessoriaDeComunicacao;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Linha de ética')]")
    WebElement linhaDeEtica;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Trabalhe conosco')]")
    WebElement trabalheConosco;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Relação com investidores')]")
    WebElement relacaoComInvestidores;

    //    SERVIÇOS
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Venda seu imóvel')]")
    WebElement vendaSeuImovel;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Alugue seu imóvel')]")
    WebElement alugueSeuImovel;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Credipronto')]")
    WebElement credipronto;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Serviços de fotografia')]")
    WebElement servicosDeFotografia;

    //    REDES SOCIAIS
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Facebook')]")
    WebElement facebook;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Twitter')]")
    WebElement twitter;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Instagram')]")
    WebElement instagram;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'LinkedIn')]")
    WebElement linkedin;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'YouTube')]")
    WebElement youtube;
    public static @FindBy(how = How.XPATH, using = "//p[contains(text(),'Blog')]")
    WebElement blog;

//    FUNÇÕES

    public static void clicarLinkHeader(String link) {
        WebElement linkHeader = driver.findElement(By.xpath("//a[@id='logo_menu_header-" + link + "']"));
        linkHeader.click();

    }

    public static void clicarLinkFooter(String link) throws InterruptedException {
        Thread.sleep(1000);
        WebElement footer = driver.findElement(By.className("under-text"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", footer);
        Thread.sleep(1000);

        WebElement quemSomos = driver.findElement(By.xpath("//p[contains(text(),'" + link + "')]"));
        quemSomos.click();
    }

    public static void realizarBusca(String busca) {
        imputBusca.sendKeys(busca);
        btn_buscar.click();
    }

    public static void aceitaCookie() {
        WebElement btn_aceitarCookie = driver.findElement(By.xpath("//button[@class='cookiemodal_btn ant-btn ant-btn-primary']"));

        if (btn_aceitarCookie.isDisplayed()) {
            btn_aceitarCookie.click();
        }
    }


}
