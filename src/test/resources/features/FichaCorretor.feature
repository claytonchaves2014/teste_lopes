#language: pt

@REGRESSAO
@FichaCorretor

Funcionalidade: [2269] Ficha do Imóvel | Validar o Cartão do Corretor

  Contexto:
    Dado acesso o Portal da Lopes

  Cenario: [2269] Ficha do Imóvel | Corretor | Parâmetro | Acessar URL
    Dado acesso a Ficha do Imóvel "REO96788"
    Quando insiro o parâmetro do Corretor "?Corretor=Ferba"
    Então visualizo apenas um Cartão do Corretor
    E o Cartão do Corretor pertence ao "FERBA"

  Cenario: [795] Ficha do Imóvel | Corretor | Cartão do Corretor | Validar layout
    Dado acesso a Ficha do Imóvel "REO96788"
    Quando verifico o Cartão do Corretor em "Corretores associados ao imóvel"
    Então vejo o Apelido do Corretor
    E vejo a foto do Corretor
    E vejo o logo do Corretor
    E vejo o Nome completo do Corretor
    E vejo o Creci do Corretor
    E vejo o botão Falar com o corretor

  Cenario: [795] Ficha do Imóvel | Corretor | Cartão do Corretor | Validar quantidade de cartões
    Dado acesso a Ficha do Imóvel "REO96788"
    Quando verifico o Cartão do Corretor em "Corretores associados ao imóvel"
    Então vejo que há no máximo seis corretores listados

  Cenario: [795] Ficha do Imóvel | Corretor | Cartão do Corretor | Validar CRECI do Corretor
    Dado acesso a Ficha do Imóvel "REO96788"
    Quando verifico o Cartão do Corretor em "Corretores associados ao imóvel"
    Então vejo que o número CRECI possui "F" no final

  Cenario: [795] Ficha do Imóvel | Corretor | Cartão do Corretor | Clicar em Falar com o corretor
    Dado acesso a Ficha do Imóvel "REO96788"
    E verifico o Cartão do Corretor em "Corretores associados ao imóvel"
    Quando clico no botão Falar com o corretor
    Então vejo o input Seu nome com focus

  Cenario: [3152] Ficha do Imóvel | Corretor | Parâmetro | Inserir apelido inválido
    Dado acesso a Ficha do Imóvel "REO96788"
    Quando insiro o parâmetro do Corretor "?Corretor=VASTH"
    Então verifico que a Home Page é aberta

  Cenario: [3149] Ficha do Imóvel | Corretor | Parâmetro | Inserir CRECI vencido
    Dado acesso a Ficha do Imóvel "REO96788"
    Quando insiro o parâmetro do Corretor "?Corretor=SERGIOTADEU.LOPESCONDESSA"
    Então verifico que a Home Page é aberta