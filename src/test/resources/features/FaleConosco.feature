#language: pt

@REGRESSAO @FaleConosco

Funcionalidade: [QA-26] Fale Conosco | Validar a página e preencher formulário

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: [CT_020] Fale Conosco | Validar layout
    Dado clico no header Fale conosco
    Quando vejo o titulo de Fale conosco como "Entre em contato conosco"
    E vejo o banner do Fale conosco
    Então vejo o formulário para entrar em contato

  Esquema do Cenario: Cenário: [CT_021] Fale Conosco | Preencher formulário
    Dado clico no header Fale conosco
    E vejo o titulo de Fale conosco como "Entre em contato conosco"
    Quando clico em Assunto do Fale conosco
    E seleciono a opção "<Assunto>" de contato
    E preencho meu Nome "<Nome>" em Fale conosco
    E preencho meu Email "<Email>" em Fale conosco
    E preencho meu Telefone "<Telefone>" em Fale conosco
    E clico em Prefiro ser contatado por
    E preencho minha Forma de Contato "<Contato>" em Fale conosco
    E preencho minha Mensagem "<Mensagem>" em Fale conosco
    E clico em Enviar contato

    Exemplos:
    | Assunto           | Nome         | Email                  | Telefone        | Contato  | Mensagem          |
    | Comprar um imóvel | QA Automação | keflin.rosa@tqi.com.br | (65) 99758-7724 | Telefone | [QA] Novo contato |