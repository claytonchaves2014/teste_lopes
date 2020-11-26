#language: pt
#@REGRESSAO
@Favoritos
Funcionalidade: [QA-75] Favoritos | Validar os imóveis favoritados

  Contexto:
    Dado acesso o Portal da Lopes
    E insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar

  Cenario: [QA-75] Favoritos | Validar os imóveis favoritados
    Quando clico para favoritar um imóvel
    E clico no header Favoritos
    Então vejo meus imóveis favoritos
