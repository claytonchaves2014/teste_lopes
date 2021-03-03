#language: pt

@REGRESSAO
@HomeServicos

Funcionalidade: [QA-13] Home Page | Validar os links dos Serviços da Lopes

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [CT_013] Home Page | Serviços | Anuncie seu imóvel
    Dado vejo Encontre a solução para você com nossos serviços
    Quando clico no serviço de Anuncie seu imóvel
    Então verifico que a URL é aberta "/paginas/anuncie-seu-imovel"

  Cenário: [CT_013] Home Page | Serviços | Financiamento
    Dado vejo Encontre a solução para você com nossos serviços
    Quando clico no serviço de Financiamento
    Então verifico que a URL é aberta "https://www.credipronto.com.br/"

  Cenário: [CT_013] Home Page | Serviços | Seja um franqueado
    Dado vejo Encontre a solução para você com nossos serviços
    Quando clico no serviço de Seja um franqueado
    Então verifico que a URL é aberta "/paginas/seja-um-franqueado"

  Cenário: [CT_013] Home Page | Serviços | Consórcio Lopes
    Dado vejo Encontre a solução para você com nossos serviços
    Quando clico no serviço de Consórcio Lopes
    Então verifico que a URL do Consórcio Lopes é aberta "https://consorcio.lopes.com.br/"