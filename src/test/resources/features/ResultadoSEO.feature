#language: pt
@REGRESSAO
@ResultadoSEO

Funcionalidade: [QA-88] Resultado de Busca | Validar as dinâmicas SEO

  Contexto:
    Dado acesso o Portal da Lopes
    E clico no botão Buscar

  Cenario: [QA-88] Resultado de Busca | SEO | Sobre o local
    Dado que vejo as dinâmicas de SEO
    Quando visualizo o texto Sobre o local
    E clico em Ver mais
    Então vejo o texto completo sobre o local buscado

  Cenario: [QA-89] Resultado de Busca | SEO | Cidades relacionadas
    Dado que vejo as dinâmicas de SEO
    Quando visualizo os links internos de Cidades relacionadas
    E seleciono a opção "Santos" de Cidades relacionadas
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/santos"

  Cenario: [QA-90] Resultado de Busca | SEO | Bairros mais populares
    Dado que vejo as dinâmicas de SEO
    Quando visualizo os links internos de Bairros mais populares
    E seleciono a opção "Pinheiros" de Bairros mais populares
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo/pinheiros"

  Cenario: [QA-91] Resultado de Busca | SEO | Logradouros mais populares
    Dado que vejo as dinâmicas de SEO
    Quando visualizo os links internos de Logradouros mais populares
    E seleciono a opção "Rua Voluntários Da Pátria" de Logradouros mais populares
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo/santana/rua-voluntarios-da-patria"

  Cenario: [QA-92] Resultado de Busca | SEO | Veja Também
    Dado que vejo as dinâmicas de SEO
    Quando visualizo os links internos de Veja também
    E seleciono a opção "Apartamentos à venda em São Paulo" de Veja Também
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo/tipo/apartamento?tipo=APARTMENT"