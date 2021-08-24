#language: pt

#@REGRESSAO
@SiteCorretor
@HeaderCorretor

Funcionalidade: [3111] Site do Corretor | Validar o header

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [3111] Site do Corretor | Header | Validar o header
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
#    E verifico o header do Site do Corretor
#    Então visualizo o Logo da Lopes
#    E não visualizo o link Lançamentos
#    E não visualizo o link Prontos
#    E não visualizo o link Aluguel
#    E não visualizo o link Anuncie seu imóvel
#    E não visualizo o link Seja franqueado
#    E não visualizo o link Calculadora de Compra
#    E não visualizo o link Fale Conosco
#    E não visualizo o link Favoritos
#    E não visualizo o link Minha Conta

#  Cenário: [3111] Site do Corretor | Header | Logo | Clicar no logo sem estar logado
#    Dado acesso o Site do Corretor "FERBA"
#    Quando clico no Logo do CRM
#    Então verifico que a URL é aberta "frontcrm.lpsbr.com/associado/"
#
#  Cenário: [3111] Site do Corretor | Header | Logo | Logado como estagiário
#    Dado clico em Minha conta
#    E clico em Corretor
#    E insiro meu CPF de corretor "44167715848"
#    E insiro minha Senha de corretor "lopes123"
#    E clico em Entrar
#    E acesso o Site do Corretor "PEDRO.BROOKLIN"
#    Quando clico no Logo do CRM
#    Então verifico que a URL é aberta "frontcrm.lpsbr.com/associado"

