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

  Cenário: [CT_002] Home Page | Footer | Assessoria de Imprensa
    Dado verifico o Footer da página
    Quando clico em Assessoria de Imprensa
    Então verifico que a URL é aberta "/paginas/assessoria-de-imprensa"

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
    Então verifico que a URL é aberta "https://ri.lopes.com.br/"

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
    Então verifico que a URL é aberta "https://www.credipronto.com.br/"

  Cenário: [CT_002] Home Page | Footer | Consórcio Lopes
    Dado verifico o Footer da página
    Quando clico em Consórcio Lopes
    Então verifico que a URL do Consórcio Lopes é aberta "https://consorcio.lopes.com.br/"

  Cenário: [CT_002] Home Page | Footer | Facebook
    Dado verifico o Footer da página
    Quando clico em Facebook
    Então verifico que a URL é aberta "https://www.facebook.com/imobiliaria.lopes"

  Cenário: [CT_002] Home Page | Footer | Twitter
    Dado verifico o Footer da página
    Quando clico em Twitter
    Então verifico que a URL é aberta "https://twitter.com/Lopes_Imoveis"

  Cenário: [CT_002] Home Page | Footer | Instagram
    Dado verifico o Footer da página
    Quando clico em Instagram
    Então verifico que a URL do Instagram é aberta "/lopesimoveis/"

  Cenário: [CT_002] Home Page | Footer | Linkedin
    Dado verifico o Footer da página
    Quando clico em Linkedin
    Então verifico que a URL é aberta "www.linkedin.com"

  Cenário: [CT_002] Home Page | Footer | YouTube
    Dado verifico o Footer da página
    Quando clico em YouTube
    Então verifico que a URL é aberta "https://www.youtube.com/user/lopesconsultoria"

  Cenário: [CT_002] Home Page | Footer | Blog
    Dado verifico o Footer da página
    Quando clico em Blog
    Então verifico que a URL é aberta "https://www.lopes.com.br/blog"

  Cenário: [3040] Home Page | Footer | Validar rodapé
    Dado verifico o Footer da página
    Então vejo o rodapé com o texto "2020 Copyright - LPS SÃO PAULO CONSULTORIA DE IMÓVEIS LTDA - CRECI 024073-J - CNPJ 15.673.605/0001-10 - Todos os direitos reservados"
