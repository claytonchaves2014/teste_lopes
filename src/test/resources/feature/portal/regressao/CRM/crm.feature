#language: pt

@REGRESSAO

Funcionalidade: Regressivo do portal

  Contexto:
    Dado que estou na tela home do portal

  @CEN1
  Cenário: CT_001 - Componente Header - Validar componente
    Dado que eu esteja na tela home do portal
    Quando clico no link lançamento
    Então sou direcionado para tela de imóveis lançamentos