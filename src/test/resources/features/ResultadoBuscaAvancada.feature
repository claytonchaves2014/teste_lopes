#language: pt

@REGRESSAO
@ResultadoBuscaAvancada

Funcionalidade: [QA-16] Resultado de Busca | Validar a busca avançada
  Contexto:
    Dado acesso o Portal da Lopes

  Esquema do Cenario: Cenário: [QA-16] Resultado de Busca | Busca Avançada | Por Estado
    Dado insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Quando que insiro "<Busca Avançada>" na busca avançada
    E seleciono "<Busca Avançada>" na busca avançada
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
    | Busca         | Busca Avançada    | URL                 |
    | Bahia, Brasil | São Paulo, Brasil | /busca/venda/br/sp? |

  Esquema do Cenario: Cenário: [QA-16] Resultado de Busca | Busca Avançada | Por Cidade
    Dado insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Quando que insiro "<Busca Avançada>" na busca avançada
    E seleciono "<Busca Avançada>" na busca avançada
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                 | Busca Avançada       | URL                          |
      | São Paulo, SP, Brasil | Sorocaba, SP, Brasil | /busca/venda/br/sp/sorocaba? |

  Esquema do Cenario: Cenário: [QA-16] Resultado de Busca | Busca Avançada | Por Bairro
    Dado insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Quando que insiro "<Busca Avançada>" na busca avançada
    E seleciono "<Busca Avançada>" na busca avançada
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                             | Busca Avançada                  | URL                                   |
      | Pinheiros, São Paulo - SP, Brasil | Morumbi, São Paulo - SP, Brasil | /busca/venda/br/sp/sao-paulo/morumbi? |

  Esquema do Cenario: Cenário: [QA-16] Resultado de Busca | Busca Avançada | Por Rua
    Dado insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Quando que insiro "<Busca Avançada>" na busca avançada
    E seleciono "<Busca Avançada>" na busca avançada
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                                                 | Busca Avançada                                       | URL                                                      |
      | Avenida Paulista - Bela Vista, São Paulo - SP, Brasil | Rua Bela Cintra - Consolação, São Paulo - SP, Brasil | /busca/venda/br/sp/sao-paulo/consolacao/rua-bela-cintra? |