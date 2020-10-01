#language: pt
@REGRESSAO @FichaBreadcrump
Funcionalidade: [QA-25] Ficha do Imóvel | Validar o Breadcrump

  Contexto:
    Dado acesso o Portal da Lopes
    E insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    E clico no botão avançar
    Então clico em uma card

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Validar layout
    Dado vejo a Ficha do Imóvel
    Quando clico para abrir o Breadcrump
    Então vejo o breadcrump Detalhes do imóvel
    E vejo o breadcrump Rua do imóvel
    E vejo o breadcrump Bairro do imóvel
    E vejo o breadcrump Tipo do imóvel
    E vejo o breadcrump Home

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Rua
    Dado vejo a Ficha do Imóvel
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Rua
    Então vejo os Resultados de Busca com a url "/rua-"

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Bairro
    Dado vejo a Ficha do Imóvel
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Bairro
    Então vejo os Resultados de Busca com a url "/br/sp/sao-paulo/"

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Tipo do Imóvel
    Dado vejo a Ficha do Imóvel
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Tipo do Imóvel
    Então vejo os Resultados de Busca com a url "/tipo/apartamento"

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Home
    Dado vejo a Ficha do Imóvel
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Home
    Então a Home Page é aberta