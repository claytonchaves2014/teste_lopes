#language: pt
@REGRESSAO @FichaLead
Funcionalidade: [QA-23] Ficha do Imóvel | Preencher o formulário do Lead

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies
    E insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Então clico em uma card

  Cenario: [CT_019] Ficha do Imóvel | Lead | Falar por Chat
    Dado vejo a Ficha do Imóvel
    Quando vejo o formulário do Lead
    E clico em Falar por Chat
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde o carregamento da página para conversar com nossos corretores."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Falar por WhatsApp
    Dado vejo a Ficha do Imóvel
    Quando vejo o formulário do Lead
    E clico em Falar por WhatsApp
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E clico em Fale com o corretor
    Então vejo a mensagem de lead enviado "Aguarde o carregamento da página para conversar com nossos corretores."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Falar por Telefone
    Dado vejo a Ficha do Imóvel
    Quando vejo o formulário do Lead
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por Telefone
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."

  Cenario: [CT_019] Ficha do Imóvel | Lead | Falar por E-mail
    Dado vejo a Ficha do Imóvel
    Quando vejo o formulário do Lead
    E clico em Falar por Telefone ou e-mail
    E insiro meu Nome como "QA Automação"
    E insiro meu E-mail como "qa.automacao@mailinator.com"
    E insiro meu Celular como "(84) 99752-8519"
    E seleciono a opção por E-mail
    E clico em Fale com especialista
    Então vejo a mensagem de lead enviado "Aguarde a confirmação com um consultor."
