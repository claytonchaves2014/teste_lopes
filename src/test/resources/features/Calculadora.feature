#language: pt
@REGRESSAO @Calculadora

Funcionalidade: [GROWTH-188] Calculadora | Formulário do lead

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico no header Calculadora de Compra
    Então insiro "15000" como Renda Familiar Mensal
    E insiro "50000" como Entrada
    E insiro "20000" como FGTS
    E clico no botão Calcular

    Cenario: Calculadora | Visualizar formulário
      Dado clico em Imóveis Prontos
      Então visualizo o formulário do lead
#
    Cenario: Calculadora | Preencher formulário
      Dado clico em Imóveis Prontos
      Quando insiro meu nome "Teste Automação"
      E seleciono meu estado "São Paulo"
      E seleciono minha cidade "São Paulo"
      E insiro meu Telefone "71997867684"
      E insiro meu E-mail "teste@qa.com"
      E seleciono minha preferencia de contato "E-mail"
      E clico em Receber sugestões
      E clico em Procurar imóveis prontos
      Então visualizo a mensagem "Enviado com sucesso!"

  Cenario: Calculadora | Procurar imóveis prontos
    Dado clico em Imóveis Prontos
    E insiro meu nome "Teste Automação"
    E seleciono meu estado "São Paulo"
    E seleciono minha cidade "São Paulo"
    E insiro meu Telefone "71997867684"
    E insiro meu E-mail "teste@qa.com"
    E seleciono minha preferencia de contato "Whatsapp"
    E clico em Receber sugestões
    Quando clico em Procurar imóveis prontos
    Então vejo os Resultados de Busca com a url "qafrontportal.lpsbr.com/busca/venda/br/sp/"