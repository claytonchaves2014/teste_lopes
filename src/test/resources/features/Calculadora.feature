#language: pt
@REGRESSAO
@Calculadora

Funcionalidade: [GROWTH-188] Calculadora | Formulário do lead

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico no header Calculadora de Compra

    Cenario: Calculadora | Visualizar formulário
      Dado insiro "15000" como Renda Familiar Mensal
      E insiro "50000" como Entrada
      E insiro "20000" como FGTS
      E clico no botão Calcular
      Quando clico em Imóveis Prontos
      Então visualizo o formulário do lead

    Esquema do Cenário: Calculadora | Calcular com base na sua renda | Imóveis Prontos | Preencher formulário
      Dado insiro "15000" como Renda Familiar Mensal
      E insiro "50000" como Entrada
      E insiro "20000" como FGTS
      E clico no botão Calcular
      Quando clico em Imóveis Prontos
      E insiro meu nome "Teste Automação"
      E seleciono meu estado "São Paulo"
      E seleciono minha cidade "São Paulo"
      E insiro meu Telefone "71997867684"
      E insiro meu E-mail "teste@qa.com"
      E seleciono minha preferencia de contato "<Contato>"
      E clico em Receber sugestões
      Então clico em Procurar imóveis prontos

      Exemplos:
      | Contato  |
      | E-mail   |
      | Whatsapp |

    Cenario: Calculadora | Calcular com base na sua renda | Imóveis Prontos | Procurar imóveis prontos
      Dado insiro "15000" como Renda Familiar Mensal
      E insiro "50000" como Entrada
      E insiro "20000" como FGTS
      E clico no botão Calcular
      Quando clico em Imóveis Prontos
      E insiro meu nome "Teste Automação"
      E seleciono meu estado "São Paulo"
      E seleciono minha cidade "São Paulo"
      E insiro meu Telefone "71997867684"
      E insiro meu E-mail "teste@qa.com"
      E seleciono minha preferencia de contato "Whatsapp"
      E clico em Receber sugestões
      Quando clico em Procurar imóveis prontos
      Então vejo os Resultados de Busca com a url "qafrontportal.lpsbr.com/busca/venda/br/"

    Esquema do Cenário: Calculadora | Calcular com base em parcelas | Imóveis Prontos | Preencher formulário
      Dado clico em Calcular com base em parcelas
      E insiro "15000" como Renda Familiar Mensal
      E insiro "50000" como Entrada
      E insiro "20000" como FGTS
      E clico no botão Calcular
      Quando clico em Imóveis Prontos
      E insiro meu nome "Teste Automação"
      E seleciono meu estado "São Paulo"
      E seleciono minha cidade "São Paulo"
      E insiro meu Telefone "71997867684"
      E insiro meu E-mail "teste@qa.com"
      E seleciono minha preferencia de contato "<Contato>"
      E clico em Receber sugestões
      Então clico em Procurar imóveis prontos

      Exemplos:
        | Contato  |
        | E-mail   |
        | Whatsapp |

    Cenario: Calculadora | Calcular com base em parcelas | Imóveis Prontos | Procurar imóveis prontos
      Dado clico em Calcular com base em parcelas
      E insiro "15000" como Renda Familiar Mensal
      E insiro "50000" como Entrada
      E insiro "20000" como FGTS
      E clico no botão Calcular
      Quando clico em Imóveis Prontos
      E insiro meu nome "Teste Automação"
      E seleciono meu estado "São Paulo"
      E seleciono minha cidade "São Paulo"
      E insiro meu Telefone "71997867684"
      E insiro meu E-mail "teste@qa.com"
      E seleciono minha preferencia de contato "Whatsapp"
      E clico em Receber sugestões
      Quando clico em Procurar imóveis prontos
      Então vejo os Resultados de Busca com a url "qafrontportal.lpsbr.com/busca/venda/br/"

