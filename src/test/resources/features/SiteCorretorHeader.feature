#language: pt
#@REGRESSAO
@SiteCorretor

Funcionalidade: [3111] Site do Corretor | Validar o header

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [3111] Site do Corretor | Header | Validar o header
    Dado acesso o Site do Corretor "MAYARA"
    Quando verifico o header do Site do Corretor
    Então visualizo o Logo da Lopes
    E não visualizo o link Lançamentos
    E não visualizo o link Prontos
    E não visualizo o link Aluguel
    E não visualizo o link Anuncie seu imóvel
    E não visualizo o link Seja franqueado
    E não visualizo o link Calculadora de Compra
    E não visualizo o link Fale Conosco
    E não visualizo o link Favoritos
    E não visualizo o link Minha Conta

  Cenário: [3111] Site do Corretor | Header | Logo | Clicar no logo sem estar logado
    Dado acesso o Site do Corretor "MAYARA"
    Quando clico no Logo da Lopes
    Então verifico que a URL é aberta "frontcrm.lpsbr.com/associado/"
