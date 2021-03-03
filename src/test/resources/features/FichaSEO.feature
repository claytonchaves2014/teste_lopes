#language: pt

@REGRESSAO
@FichaSEO

Funcionalidade: [QA-24] Ficha do Imóvel | Validar as dinâmicas SEO

  Contexto:
    Dado acesso o Portal da Lopes
    E clico no botão Buscar

  Cenario: [QA-24] Ficha do Imóvel | SEO | Validar as dinâmicas
    Dado clico em uma card
    Quando vejo a Ficha do Imóvel
    Então verifico que a Ficha do Imóvel possui Title
    E verifico que a Ficha do Imóvel possui Description
    E verifico que a Ficha do Imóvel possui Canonical

  Cenario: [QA-24] Ficha do Imóvel | SEO | Validar links internos
    Dado clico em uma card
    Quando vejo a Ficha do Imóvel
    Então vejo os links internos