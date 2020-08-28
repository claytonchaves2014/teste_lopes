#language: pt
@REGRESSAO @Footer
Funcionalidade: [QA-8] Home Page | Validar os links localizados no Footer da página

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: [CT_002] Home Page | Footer | Quem Somos
    Dado verifico o Footer da página
    Quando clico em Quem Somos
    Então verifico que a URL é aberta "/paginas/quem-somos"

  Cenário: [CT_002] Home Page | Footer | Assessoria de Comunicação
    Dado verifico o Footer da página
    Quando clico em Assessoria de Comunicação
    Então verifico que a URL é aberta "/paginas/assessoria-de-comunicacao"

  Cenário: [CT_002] Home Page | Footer | Linha de ética
    Dado verifico o Footer da página
    Quando clico em Linha de ética
    Então verifico que a URL é aberta "/paginas/linha-de-etica"

  Cenário: [CT_002] Home Page | Footer | Trabalhe conosco
    Dado verifico o Footer da página
    Quando clico em Trabalhe conosco
    Então verifico que a URL é aberta "/paginas/trabalhe-conosco"

  Cenário: [CT_002] Home Page | Footer | Relação com investidores
    Dado verifico o Footer da página
    Quando clico em Relação com investidores
    Então verifico que a URL de Relação com investores aberta é "https://ri.lopes.com.br/"

  Cenário: [CT_002] Home Page | Footer | Venda seu imóvel
    Dado verifico o Footer da página
    Quando clico em Venda seu imóvel
    Então verifico que a URL é aberta "/paginas/anuncie-seu-imovel"

  Cenário: [CT_002] Home Page | Footer | Alugue seu imóvel
    Dado verifico o Footer da página
    Quando clico em Alugue seu imóvel
    Então verifico que a URL é aberta "/paginas/anuncie-seu-imovel"

  Cenário: [CT_002] Home Page | Footer | Credipronto
    Dado verifico o Footer da página
    Quando clico em Credipronto
    Então verifico que a URL de Credipronto aberta é "https://www.credipronto.com.br/"

  Cenário: [CT_002] Home Page | Footer | Serviços de fotografia
    Dado verifico o Footer da página
    Quando clico em Serviços de fotografia
    Então verifico que a URL é aberta "/paginas/servicos-de-fotografia"