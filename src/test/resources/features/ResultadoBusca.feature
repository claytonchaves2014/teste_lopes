#language: pt
@REGRESSAO @ResultadoBusca
Funcionalidade: [QA-14] Resultado de Busca | Validar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: [QA-14] Resultado de Busca | Grid | Validar resultados
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    Quando clico no botão Buscar
    Então vejo a quantidade de imóveis encontrados
    E vejo os resultados na grid
    E vejo o Mapa do resultado de busca

  Cenário: [CT_014] Resultado de Busca | Paginação | Avançar página
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Quando clico no botão avançar
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo/pagina/2?"

  Cenário: [CT_014] Resultado de Busca | Paginação | Retornar página
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Quando clico no botão avançar
    E clico no botão voltar
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo?"

  Cenário: [CT_016] Resultado de Busca | Grid | Validar a card do imóvel
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    Quando clico no botão Buscar
    Então vejo a card do imóvel
    E vejo o tipo de imóvel na card
    E vejo o valor do imóvel na card
    E vejo o valor de condomínio na card
    E vejo o endereço do imóvel na card
    E vejo as características do imóvel na card
    E vejo o botão favorito na card

  Cenário: [QA_20] Resultado de Busca | Grid | Abrir um imóvel
    Quando insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Quando clico em uma card
    Então vejo a Ficha do Imóvel