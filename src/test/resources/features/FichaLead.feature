#language: pt
@REGRESSAO @FichaLead
Funcionalidade: [QA-23] Ficha do Imóvel | Preencher o formulário do Lead

  Contexto:
    Dado acesso o Portal da Lopes

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Validar opções de contato
    Dado clico no header Lançamentos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    Então vejo o botão Falar por Chat
    E vejo o botão Falar por WhatsApp
    E vejo o botão Telefone ou e-mail

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Validar opções de contato
    Dado clico no header Prontos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    Então não vejo o botão Falar por Chat
    E vejo o botão Falar por WhatsApp
    E vejo o botão Telefone ou e-mail

  Cenario: [CT_019] Ficha do Imóvel | Lead | Aluguel | Validar opções de contato
    Dado clico no header Aluguel
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    Então não vejo o botão Falar por Chat
    E vejo o botão Falar por WhatsApp
    E vejo o botão Telefone ou e-mail

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por Chat
    Dado clico no header Lançamentos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Chat
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde o carregamento da página para conversar com nossos corretores."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento |Falar por WhatsApp
    Dado clico no header Lançamentos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por WhatsApp
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde o carregamento da página para conversar com nossos corretores."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por Telefone
    Dado clico no header Lançamentos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por Telefone
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por E-mail
    Dado clico no header Lançamentos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por E-mail
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Falar por WhatsApp
    Dado clico no header Prontos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por WhatsApp
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde o carregamento da página para conversar com nossos corretores."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Falar por Telefone
    Dado clico no header Prontos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por Telefone
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Falar por E-mail
    Dado clico no header Prontos
    E clico no botão avançar
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por E-mail
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Aluguel | Falar por WhatsApp
    Dado clico no header Aluguel
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por WhatsApp
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde o carregamento da página para conversar com nossos corretores."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Aluguel | Falar por Telefone
    Dado clico no header Aluguel
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por Telefone
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Aluguel | Falar por E-mail
    Dado clico no header Aluguel
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por E-mail
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."
