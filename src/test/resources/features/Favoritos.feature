#language: pt
@REGRESSAO @Favoritos
Funcionalidade: [QA-75] Favoritos | Validar os imóveis favoritados

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies
    E insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Então clico em uma card

  Cenario: [QA-75] Favoritos | Validar os imóveis favoritados
    Dado vejo a Ficha do Imóvel
    Quando favorito um imóvel
    E clico no header Favoritos
    Então vejo meus imóveis favoritos
