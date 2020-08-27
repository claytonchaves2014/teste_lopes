#language: pt
@REGRESSAO @Footer
Funcionalidade: Home Page | Validar os links localizados no Footer da página

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: Home Page | Footer | Quem Somos
    Dado verifico o Footer da página
    Quando clico em Quem Somos
    Então verifico que a URL é aberta "/paginas/quem-somos"

  Cenário: Home Page | Footer | Assessoria de Comunicação
    Dado verifico o Footer da página
    Quando clico em Assessoria de Comunicação
    Então verifico que a URL é aberta "/paginas/assessoria-de-comunicacao"

  Cenário: Home Page | Footer | Linha de ética
    Dado verifico o Footer da página
    Quando clico em Linha de ética
    Então verifico que a URL é aberta "/paginas/linha-de-etica"

  Cenário: Home Page | Footer | Trabalhe conosco
    Dado verifico o Footer da página
    Quando clico em Trabalhe conosco
    Então verifico que a URL é aberta "/paginas/trabalhe-conosco"

  Cenário: Home Page | Footer | Relação com investidores
    Dado verifico o Footer da página
    Quando clico em Relação com investidores
    Então verifico que a URL de Relação com investores aberta é "https://ri.lopes.com.br/"

  Cenário: Home Page | Footer | Venda seu imóvel
    Dado verifico o Footer da página
    Quando clico em Venda seu imóvel
    Então verifico que a URL é aberta "/paginas/anuncie-seu-imovel"

  Cenário: Home Page | Footer | Alugue seu imóvel
    Dado verifico o Footer da página
    Quando clico em Alugue seu imóvel
    Então verifico que a URL é aberta "/paginas/anuncie-seu-imovel"

  Cenário: Home Page | Footer | Credipronto
    Dado verifico o Footer da página
    Quando clico em Credipronto
    Então verifico que a URL de Credipronto aberta é "https://www.credipronto.com.br/"

  Cenário: Home Page | Footer | Serviços de fotografia
    Dado verifico o Footer da página
    Quando clico em Serviços de fotografia
    Então verifico que a URL é aberta "/paginas/servicos-de-fotografia"