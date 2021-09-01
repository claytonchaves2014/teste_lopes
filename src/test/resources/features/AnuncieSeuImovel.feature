#language: pt

@AnuncieSeuImovel

Funcionalidade: AnuncieSeuImovel| Enviar Formulario

  Contexto:

    Dado acesso o Portal da Lopes

  Cenário: Anuncie Seu Imovel | Enviar Formulario

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Bruna" do Anunciante
    E preencho o Email "brsilva@lopes.com.br" do Anunciante
    E preencho o Telefone "11986220622" do Anunciante
    E clico na opção "Vender"
    E seleciono o tipo de imovel "Casa"
    E informo o CEP "06140040"
    E informo o numero do endereco "440"
    E informo o cpf "000000000"
    Entao clico no botao Enviar

