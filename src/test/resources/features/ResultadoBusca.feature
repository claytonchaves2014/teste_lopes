#language: pt

@REGRESSAO
@ResultadoBusca

Funcionalidade: [QA-14] Resultado de Busca | Validar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico no botão Buscar

  Cenario: [CT_01]: Resultado da busca | Card | Validar exibição valor total com Aluguel, Condomínio e IPTU
    Dado que estou na página de resultado de busca por aluguel
    E vejo a card do imóvel
    Quando vejo o tipo de imóvel na card
    E vejo o botão favorito na card
    E vejo o valor do imóvel na card
    E vejo o valor do aluguel na card
    E vejo o valor de condomínio na card
    E vejo o valor do iptu na card
    E vejo o endereço do imóvel na card
    E vejo as características do imóvel na card

  Cenario: [CT_02]: Resultado da busca | Card | Validar exibição valor total com Aluguel, sem Condomínio e IPTU
    Dado que estou na página de resultado de busca por aluguel
    E vejo a card do imóvel
    Quando vejo o tipo de imóvel na card
    E vejo o botão favorito na card
    E vejo o valor do imóvel na card
    E vejo o valor do aluguel na card
    E vejo o endereço do imóvel na card
    E vejo as características do imóvel na card

  Cenario: [CT_03]: Resultado da busca | Card | Validar exibição valor total com Aluguel e IPTU, sem Condomínio
    Dado que estou na página de resultado de busca por aluguel
    E vejo a card do imóvel
    Quando vejo o tipo de imóvel na card
    E vejo o botão favorito na card
    E vejo o valor do imóvel na card
    E vejo o valor do aluguel na card
    E vejo o valor do iptu na card
    E vejo o endereço do imóvel na card
    E vejo as características do imóvel na card

  Cenario: [CT_04]: Resultado da busca | Card | Validar exibição valor total com Aluguel e Condomínio, sem IPTU
    Dado que estou na página de resultado de busca por aluguel
    E vejo a card do imóvel
    Quando vejo o tipo de imóvel na card
    E vejo o botão favorito na card
    E vejo o valor do imóvel na card
    E vejo o valor do aluguel na card
    E vejo o valor de condomínio na card
    E vejo o endereço do imóvel na card
    E vejo as características do imóvel na card

  Esquema do Cenario:[CT_05]: Resultado da busca | Aluguel | Filtro por valor | Validar o layout do filtro por valor
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    Entao vejo o checkbox Valor Total selecionado
    E clico no botão Aplicar
    E vejo o checkbox Aluguel

    Exemplos:
      | Minimo | Maximo |
      | 100    | 100    |

  Esquema do Cenario: [CT_06]: Resultado da busca | Lançamento | Filtro por valor | Validar o layout do filtro por valor
    Dado que estou na página de resultado de busca por lançamento
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Lançamento
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no botão Aplicar

    Exemplos:
      | Minimo | Maximo |
      | 100    | 100    |


  Esquema do Cenario: [CT_07]:Cenário 7: Resultado da busca | Pronto | Filtro por valor
    Dado que estou na página de resultado de busca por prontos
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no botão Aplicar

    Exemplos:
      | Minimo | Maximo   |
      | 100    | 10000000 |

  Esquema do Cenário:[CT_08]: Home | Filtro por valor | Validar o layout do filtro por valor
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E vejo o checkbox Valor Total selecionado
    E clico no botão Aplicar

    Exemplos:
      | Minimo | Maximo |
      | 100    | 100    |


  Esquema do Cenario:[CT_09]: Resultado da busca | Filtro por valor | Validar o comportamento do filtro por “Valor Total“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E vejo o checkbox Valor Total selecionado
    E clico no botão Aplicar

    Exemplos:
      | Minimo | Maximo |
      | 100    | 100    |

  Esquema do Cenario:[CT_10]: Resultado da busca | Filtro por valor | Validar o comportamento do filtro por “Aluguel“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no checkbox Aluguel
    E clico no botão Aplicar

    Exemplos:
      | Minimo | Maximo |
      | 100    | 100    |

  Cenario: [CT_11]: Resultado da busca | Ordenar | Validar layout com filtro “Valor Total“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E vejo o checkbox Valor Total selecionado
    E clico no botão Aplicar
    E clico em Ordenar
    Quando seleciono ordenar por Relevância
    Entao verifico que os resultados são ordenados por "Relevância"

  Cenario: [CT_12]: Resultado da busca | Ordenar | Validar layout com filtro “Aluguel“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no checkbox Aluguel
    E clico no botão Aplicar
    E clico em Ordenar
    Quando seleciono ordenar por Relevância
    Então verifico que os resultados são ordenados por "Relevância"

  Cenario:[CT_13]: Resultado da busca | Ordenar | Validar layout com filtro por Compra
    Dado que estou no resultado de busca por compra
    Dado que clico em Ordenar
    Quando seleciono ordenar por Relevância
    Então verifico que os resultados são ordenados por "Relevância"

  Esquema do Cenario: [CT_14]: Resultado da busca | Ordenar “Menor valor“ | Validar comportamento com filtro “Valor Total“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E vejo o checkbox Valor Total selecionado
    E clico no botão Aplicar
    E clico em Ordenar
    E seleciono ordenar por Menor valor
    Então verifico que os resultados são ordenados por "Menor valor"

    Exemplos:
      | Minimo | Maximo |
      | 1000   | 2000   |

  Esquema do Cenario: [CT_15]: Resultado da busca | Ordenar “Maior valor“ | Validar comportamento com filtro “Valor Total“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E vejo o checkbox Valor Total selecionado
    E clico no botão Aplicar
    E clico em Ordenar
    E seleciono ordenar por Maior valor
    Então verifico que os resultados são ordenados por "Maior valor"

    Exemplos:
      | Minimo | Maximo |
      | 1000   | 2000   |

  Esquema do Cenario: [CT_16]: Resultado da busca | Ordenar “Menor valor“ | Validar comportamento com filtro “Aluguel“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no checkbox Aluguel
    E clico no botão Aplicar
    E clico em Ordenar
    E seleciono ordenar por Menor valor
    Então verifico que os resultados são ordenados por "Menor valor"

    Exemplos:
      | Minimo | Maximo |
      | 1000   | 2000   |

  Esquema do Cenario: [CT_17]: Resultado da busca | Ordenar “Maior valor“ | Validar comportamento com filtro “Aluguel“
    Dado que estou na página de resultado de busca por aluguel
    Dado clico em Filtros na Home Page
    Quando clico em filtrar por Valor em Aluguel
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no checkbox Aluguel
    E clico no botão Aplicar
    E clico em Ordenar
    E seleciono ordenar por Maior valor
    Então verifico que os resultados são ordenados por "Maior valor"

    Exemplos:
      | Minimo | Maximo |
      | 1000   | 2000   |

  Esquema do Cenario: [CT_18]: Resultado da busca | Ordenar “Menor valor“ | Validar comportamento com filtro por Compra
    Dado clico em Filtros na Home Page
    E clico em filtrar por Valor em Compra
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no botão Aplicar
    E clico em Ordenar
    E seleciono ordenar por Menor valor
    Então verifico que os resultados são ordenados por "Menor valor"

    Exemplos:
      | Minimo | Maximo |
      | 1000   | 6000   |

  Esquema do Cenario: [CT_19]: Resultado da busca | Ordenar “Maior valor“ | Validar comportamento com filtro por Compra
    Dado clico em Filtros na Home Page
    E clico em filtrar por Valor em Compra
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no botão Aplicar
    E clico em Ordenar
    Quando seleciono ordenar por Maior valor
    Então verifico que os resultados são ordenados por "Maior valor"

    Exemplos:
      | Minimo | Maximo |
      | 1000   | 6000   |


  Cenario: [CT_01]: Página do imóvel | Parcela | Pronto (venda) | Validar o layout
    Dado que estou na página de resultado de busca por prontos
    Dado clico em uma card
    Então vejo a Ficha do Imóvel
    E vejo o valor do imóvel na card
    E vejo o valor do iptu na card
    E vejo o valor de condomínio na card
    E vejo o link "Simular valor financiado"


  Cenario: [CT_02]: Página do imóvel | Parcela | Pronto (aluguel) | Validar o layout
    Dado que estou na página de resultado de busca por aluguel
    E vejo o valor do aluguel na card
    E vejo o valor do iptu na card
    E vejo o valor de condomínio na card

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Menor Valor
    Dado que clico em Ordenar
    Quando seleciono ordenar por Menor valor
    Então verifico que os resultados são ordenados por "Menor valor"

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



















