#language: pt

@REGRESSAO
@ResultadoBusca

Funcionalidade: [QA-14] Resultado de Busca | Validar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico no botão Buscar

  Cenário: [QA-14] Resultado de Busca | Grid | Validar resultados
    Dado vejo a quantidade de imóveis encontrados
    Então vejo os resultados na grid

  Cenário: [CT_014] Resultado de Busca | Paginação | Avançar página
    Dado clico no botão avançar
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo/pagina/2?"

  Cenário: [CT_014] Resultado de Busca | Paginação | Retornar página
    Dado clico no botão avançar
    Quando clico no botão voltar
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo?"

  Cenário: [CT_016] Resultado de Busca | Grid | Validar a card do imóvel
    Dado vejo a card do imóvel
    Quando vejo o tipo de imóvel na card
    E vejo o valor do imóvel na card
    E vejo o valor de condomínio na card
    E vejo o endereço do imóvel na card
    E vejo as características do imóvel na card
    Então vejo o botão favorito na card

  Cenário: [QA_20] Resultado de Busca | Grid | Abrir um imóvel
    Dado clico em uma card
    Então vejo a Ficha do Imóvel

  Cenário: [GROWTH-204] Resultado de Busca | Card da calculadora | Validar banner
    Então vejo o card da calculadora na segunda posição

  Cenário: [GROWTH-204] Resultado da busca | Card da calculadora | Validar o clique no card
    Dado clico na card da calculadora
    Entao verifico que a URL é aberta "/calculadora-simulador-de-financiamento-imobiliario"