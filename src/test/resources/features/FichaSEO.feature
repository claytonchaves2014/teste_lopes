#language: pt
@REGRESSAO @FichaSEO
Funcionalidade: [QA-24] Ficha do Imóvel | Validar as dinâmicas SEO

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies
    E insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    E clico no botão avançar
    Então clico em uma card

  Cenario: [QA-24] Ficha do Imóvel | SEO | Validar as dinâmicas
    Dado vejo a Ficha do Imóvel
    Quando verifico que a Ficha do Imóvel possui Title
    E verifico que a Ficha do Imóvel possui Description
    E verifico que a Ficha do Imóvel possui Canonical

  Cenario: [QA-24] Ficha do Imóvel | SEO | Validar links internos
    Dado vejo a Ficha do Imóvel
    Então vejo os links internos