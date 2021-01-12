#language: pt
#@REGRESSAO
@ResultadoMapa
Funcionalidade: [QA-15] Resultado de Busca | Validar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    Quando insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    Então clico no botão Buscar


  Cenario: [GROWTH-60] Resultado de Busca | Mapa | Ver no mapa
    Dado que estou no resultado da busca
    Quando clico no link Ver no mapa
    Entao vejo o header
    E vejo o filtro de transação
    E vejo o campo de busca
    E vejo os filtros
    E vejo o contador da busca
    E vejo o filtro de ordenação
    E vejo o link Ocultar o mapa
    E vejo a grid com "24" cards
    E vejo o mapa
    E vejo a paginação
    E vejo o footer

  Cenario: [GROWTH-60] Resultado de Busca | Mapa | Ocultar o mapa
    Dado que estou no resultado da busca
    Quando clico no link Ocultar o mapa
    Entao vejo o header
    E vejo o filtro de transação
    E vejo o campo de busca
    E vejo os filtros
    E vejo o contador da busca
    E vejo o filtro de ordenação
    E vejo o link Ver no mapa
    E vejo a grid com "24" cards
    E vejo a paginação
    E vejo o footer

#  Cenário: [QA-15] Resultado de Busca | Mapa | Validar Mapa
#    Dado insiro "São Paulo, SP, Brasil" no campo de busca
#    E seleciono a opção "São Paulo, SP, Brasil"
#    Quando clico no botão Buscar
#    Então vejo o Mapa do resultado de busca
#
#  Cenário: [QA-15] Resultado de Busca | Mapa | Aumentar zoom e validar ícones
#    Dado insiro "São Paulo, SP, Brasil" no campo de busca
#    E seleciono a opção "São Paulo, SP, Brasil"
#    Quando clico no botão Buscar
#    Então clico em Aumentar o Zoom
#    E vejo os ícones de Coração no Mapa
#    E vejo os ícones de Prontos no Mapa