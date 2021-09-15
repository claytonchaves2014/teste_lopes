#language: pt

@AnuncieSeuImovel

Funcionalidade: AnuncieSeuImovel| Enviar Formulario

  Contexto:

    Dado acesso o Portal da Lopes

    Cenário: [CT_01]: Anuncie Seu Imovel | Enviar Formulario tipo imovel Vender

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Clayton" do Anunciante
    E preencho o Email "cchaves@lopes.com.br" do Anunciante
    E preencho o Telefone "11986220522" do Anunciante
    E clico na opção "Vender"
    E seleciono o tipo de imovel "Apartamento"
    E informo o CEP "01427-002"
    E informo o numero do endereco "440"
    E clico no botao Enviar


  Cenário: [CT_02]: Anuncie seu imóvel | Formulario | Validar formulário campo Nome sem preenchimento

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E preencho o Email "cchaves@lopes.com.br" do Anunciante
    E preencho o Telefone "11986220522" do Anunciante
    E clico na opção "Vender"
    E seleciono o tipo de imovel "Apartamento"
    E informo o CEP "01427-002"
    E informo o numero do endereco "1971"
    E clico no botao Enviar
    Então vejo a mensagem para preencher seu nome "Por favor, preencha seu nome."

  Cenário: [CT_03]: Anuncie seu imóvel | Formulário | Validar formulário campo Email sem preenchimento

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Clayton" do Anunciante
    E preencho o Telefone "11986220522" do Anunciante
    E clico na opção "Vender"
    E seleciono o tipo de imovel "Apartamento"
    E informo o CEP "01427-002"
    E informo o numero do endereco "1971"
    E clico no botao Enviar
    Então vejo a mensagem para preencher seu email "Por favor, preencha seu e-mail."

  Cenário:[CT_04]: Anuncie seu imóvel | Formulário | Validar formulário campo telefone sem preenchimento

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Clayton" do Anunciante
    E preencho o Email "cchaves@lopes.com.br" do Anunciante
    E clico na opção "Vender"
    E seleciono o tipo de imovel "Apartamento"
    E informo o CEP "01427-002"
    E informo o numero do endereco "1971"
    E clico no botao Enviar
    Então vejo a mensagem para preencher seu telefone "Por favor, preencha seu telefone."

  Cenário:[CT_05]: Anuncie seu imóvel | Formulário | Validar formulário campo Sobre o imóvel sem preenchimento

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Clayton" do Anunciante
    E preencho o Email "cchaves@lopes.com.br" do Anunciante
    E seleciono o tipo de imovel "Apartamento"
    E informo o CEP "01427-002"
    E informo o numero do endereco "1971"
    E clico no botao Enviar
    Então vejo a mensagem para selecionar uma opção de imovel "Por favor, selecione uma opção."

  Cenário:[CT_06]: Anuncie seu imóvel | Formulário | Validar formulário campo Tipo do imóvel sem preenchimento

    E clico no header Anuncie Seu Imovel
    E verifico que a URL é aberta "/paginas/anuncie-seu-imovel"
    E informo o nome "Clayton" do Anunciante
    E preencho o Email "cchaves@lopes.com.br" do Anunciante
    E preencho o Telefone "11986220522" do Anunciante
    E clico na opção "Vender"
    E informo o CEP "01427-002"
    E informo o numero do endereco "440"
    E clico no botao Enviar
    Então vejo a mensagem para selecionar o tipo de Imovel "Por favor, preencha o tipo de imóvel."



