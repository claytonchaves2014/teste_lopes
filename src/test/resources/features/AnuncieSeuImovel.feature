#language: pt

@AnuncieSeuImovel

Funcionalidade: AnuncieSeuImovel| Enviar Formulario

  Contexto:

    Dado acesso o Portal da Lopes

  Cenário: Anuncie Seu Imovel | Enviar Formulario tipo imovel Casa

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Clayton" do Anunciante
    E preencho o Email "cchaves@lopes.com.br" do Anunciante
    E preencho o Telefone "11986220622" do Anunciante
    E clico na opção "Vender"
    E seleciono o tipo de imovel "Casa"
    E informo o CEP "06140040"
    E informo o numero do endereco "440"
    E clico no botao Enviar

