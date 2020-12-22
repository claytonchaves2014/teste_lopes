#language: pt

@REGRESSAO
@Condominios

Funcionalidade: [Growth-102] Condomínios | Validar as  páginas de Condomínio no Portal

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [102] Condomínios | Acessar as páginas de condomínio
    Dado verifico o Footer da página
    Quando clico em Condomínios e edifícios
    Então verifico que a URL é aberta "/paginas/condominios"

  Cenário: [102] Condomínios | Validar a lista de Cidades
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    Quando vejo o título "Condomínios e Edifícios Lopes" da página de Condomínios
    Então vejo a lista com no máximo "100" links

  Cenário: [102] Condomínios | Validar a lista de Bairros
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    Quando clico no link "São Paulo" da página de Condomínios
    Então verifico que a URL é aberta "/paginas/condominios/sp/sao-paulo"
    E vejo o título "Condomínios e Edifícios em São Paulo - SP" da página de Condomínios
    E vejo a lista com no máximo "100" links
    E vejo a paginação da lista de condomínios

  Cenário: [102] Condomínios | Validar a lista de Condomínios
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    E clico no link "São Paulo" da página de Condomínios
    Quando clico no link "Barra Funda" da página de Condomínios
    Então verifico que a URL é aberta "/paginas/condominios/sp/sao-paulo/barra-funda"
    E vejo o título "Condomínios e Edifícios em Barra Funda, São Paulo" da página de Condomínios
    E vejo a lista com no máximo "100" links

  Cenário: [102] Condomínios | Selecionar um Condomínio
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    E clico no link "São Paulo" da página de Condomínios
    E clico no link "Barra Funda" da página de Condomínios
    Quando clico seleciono um condomínio
    Então verifico que a URL é aberta "/condominios/sp/sao-paulo/barra-funda/"
    E vejo o botão Ver Imóveis

  Cenário: [102] Condomínios | Clicar em Ver Imóveis
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    E clico no link "São Paulo" da página de Condomínios
    E clico no link "Barra Funda" da página de Condomínios
    Quando clico seleciono um condomínio
    E clico em Ver Imóveis
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo/barra-funda/tipo/"

  Cenário: [102] Condomínios | Clicar em Ver Imóveis
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    E clico no link "São Paulo" da página de Condomínios
    E clico no link "Barra Funda" da página de Condomínios
    Quando clico seleciono um condomínio
    Entao vejo a imagem default do Condomínio
    E vejo o nome do condomínio
    E vejo o endereço do condomínio
    E vejo os atributos do condomínio
    E vejo as instalações do condomínio
    E vejo o botão Ver Imóveis
    E vejo o texto "Precisa de ajuda para encontrar o seu imóvel?" em Ver Imóveis
    E vejo o link "Entrar em contato com a Lopes" em Ver Imóveis
    E vejo o breadcrumb na página do Condomínio

  Cenário: [102] Condomínios | Clicar em Entrar em contato
    Dado verifico o Footer da página
    E clico em Condomínios e edifícios
    E clico no link "São Paulo" da página de Condomínios
    E clico no link "Barra Funda" da página de Condomínios
    Quando clico seleciono um condomínio
    E clico em Entre em contato com a Lopes
    Então verifico que a URL é aberta "/paginas/fale-conosco"