#language: pt

@REGRESSAO
@HomeFiltros

Funcionalidade: [QA-10] Home Page | Fazer buscas avançadas de empreendimentos utilizando Filtros

  Contexto:
    Dado acesso o Portal da Lopes

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Valor
    Dado clico em Filtros na Home Page
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Minimo | Maximo   | URL                                  |
      | 100    | 10000000 | preco-maior=10000000&preco-menor=100 |

