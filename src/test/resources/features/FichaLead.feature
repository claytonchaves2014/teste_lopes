#language: pt

@REGRESSAO
@FichaLead

Funcionalidade: [QA-23] Ficha do Imóvel | Preencher o formulário do Lead

  Contexto:
    Dado acesso o Portal da Lopes

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Validar opções de contato
    Dado clico no header Lançamentos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico no dropdown de formas de contato
    Então vejo "Telefone" como opção de forma de contato
    E vejo "Email" como opção de forma de contato
    E vejo "Whatsapp" como opção de forma de contato
    E vejo "Chat" como opção de forma de contato

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Validar opções de contato
    Dado clico no header Prontos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico no dropdown de formas de contato
    Então não vejo "Chat" como opção de forma de contato
    Então vejo "Telefone" como opção de forma de contato
    E vejo "Email" como opção de forma de contato
    E vejo "Whatsapp" como opção de forma de contato

  Cenario: [CT_019] Ficha do Imóvel | Lead | Aluguel | Validar opções de contato
    Dado clico no header Aluguel
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico no dropdown de formas de contato
    Então não vejo "Chat" como opção de forma de contato
    Então vejo "Telefone" como opção de forma de contato
    E vejo "Email" como opção de forma de contato
    E vejo "Whatsapp" como opção de forma de contato

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por Chat
    Dado clico no header Lançamentos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Chat" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por WhatsApp
    Dado clico no header Lançamentos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Whatsapp" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por Telefone
    Dado clico no header Lançamentos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Telefone" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Lançamento | Falar por E-mail
    Dado clico no header Lançamentos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Email" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Falar por WhatsApp
    Dado clico no header Prontos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Whatsapp" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Falar por Telefone
    Dado clico no header Prontos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Telefone" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Prontos | Falar por E-mail
    Dado clico no header Prontos
    E clico em uma card
    Quando vejo a Ficha do Imóvel
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico no dropdown de formas de contato
    E seleciono "Email" como Forma de Contato
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."