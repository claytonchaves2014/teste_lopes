#language: pt
@REGRESSAO @FichaCorretor

Funcionalidade: [2269] Resultado de Busca | Validar a busca avançada
  Contexto:
    Dado acesso o Portal da Lopes

  Cenario: Cenário: [2269] Ficha do Imóvel | Corretor | Parâmetro | Acessar URL
    Dado acesso a Ficha do Imóvel "REO405231"
    Quando insiro o parâmetro do Corretor "?Corretor=Feitosa.One"
    Então visualizo apenas um Cartão do Corretor
    E o Cartão do Corretor pertence ao "FEITOSA.ONE"

  Cenario: Cenário: [2269] Ficha do Imóvel | Corretor | Parâmetro | Navegar entre produtos
    Dado acesso a Ficha do Imóvel "REO405231"
    Quando insiro o parâmetro do Corretor "?Corretor=Feitosa.One"
    E clico no header Lançamentos
    E clico no botão avançar
    E clico em uma card
    Então visualizo que o parâmetro do Corretor continua como "?Corretor=Feitosa.One"

  Cenario: Cenário: [2269] Ficha do Imóvel | Corretor | Parâmetro | Celular do lead
    Dado acesso a Ficha do Imóvel "REO405231"
    Quando insiro o parâmetro do Corretor "?Corretor=Feitosa.One"
    E clico em Ver telefone no Lead
    Então visualizo o celular do Corretor no Lead como "+55 11 999393203"

  Cenario: Cenário: [2269] Ficha do Imóvel | Corretor | Parâmetro | Alterar Corretor
    Dado acesso a Ficha do Imóvel "REO405231"
    E insiro o parâmetro do Corretor "?Corretor=Feitosa.One"
    E o Cartão do Corretor pertence ao "FEITOSA.ONE"
    Quando altero o parâmetro do Corretor "?Corretor=Beatriz.One"
    Então o Cartão do Corretor pertence ao "BEATRIZ.ONE"