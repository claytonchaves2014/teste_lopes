#language: pt
@REGRESSAO @FichaBreadcrump
Funcionalidade: [QA-25] Ficha do Imóvel | Validar o Breadcrump

  Contexto:
    Dado acesso o Portal da Lopes

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Validar layout
    Dado acesso a Ficha do Imóvel "REO477875"
    Quando clico para abrir o Breadcrump
    Então vejo o breadcrump Detalhes do imóvel
    E vejo o breadcrump Rua do imóvel
    E vejo o breadcrump Bairro do imóvel
    E vejo o breadcrump Tipo do imóvel
    E vejo o breadcrump Home

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Rua
    Dado acesso a Ficha do Imóvel "REO477875"
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Rua
    Então vejo os Resultados de Busca com a url de nível de rua

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Bairro
    Dado acesso a Ficha do Imóvel "REO477875"
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Bairro
    Então vejo os Resultados de Busca com a url "/br/sp/sao-paulo/"

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Tipo do Imóvel
    Dado acesso a Ficha do Imóvel "REO477875"
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Tipo do Imóvel
    Então vejo os Resultados de Busca com a url "/tipo/"

  Cenario: [QA-25] Ficha do Imóvel | Breadcrump | Abrir Home
    Dado acesso a Ficha do Imóvel "REO477875"
    E clico para abrir o Breadcrump
    Quando vejo o breadcrump Rua do imóvel
    E clico no breacrump Home
    Então a Home Page é aberta