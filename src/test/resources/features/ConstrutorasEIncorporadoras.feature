#language: pt

@ConstrutorasEIncorporadoras

Funcionalidade: Construtoras e Incorporadoras

  Contexto:

    Dado acesso o Portal da Lopes
    Quando clico no footer da página Construtoras e Incorporadoras


  Cenário: [CT_01]: Construtoras e Incorporadoras| Card | Validar layout

    Então visualizo a lista de Construtoras e Incorporadoras em ordem alfabética

  Cenário: [CT_02]: Construtoras e Incorporadoras| Card | Validar layout

    E visualizo a lista de Construtoras e Incorporadoras em ordem alfabética
    Quando clico sobre uma incorporadora exibida na tela
    Então é exibido informações sobre a Incorporadora


