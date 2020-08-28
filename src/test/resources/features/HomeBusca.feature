#language: pt
@REGRESSAO @HomeBusca
Funcionalidade: [QA-9] Home Page | Fazer buscas de empreendimentos por Localização

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: [CT_005] Home Page | Busca | Compra | Busca padrão
    Dado retiro a seleção Comprar na Planta
    Quando clico no botão Buscar
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo?"

  Esquema do Cenário: [CT_005] Home Page | Busca | Compra | Prontos por Estado
    Dado retiro a seleção Comprar na Planta
    Quando insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                 | URL                           |
      | São Paulo, Brasil     | /busca/venda/br/sp?           |

  Esquema do Cenário: [CT_005] Home Page | Busca | Compra | Prontos por Cidade
    Dado retiro a seleção Comprar na Planta
    Quando insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                 | URL                           |
      | São Paulo, SP, Brasil | /busca/venda/br/sp/sao-paulo? |

  Esquema do Cenário: [CT_005] Home Page | Busca | Compra | Prontos por Bairro
    Dado retiro a seleção Comprar na Planta
    Quando insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                           | URL                                   |
      | Morumbi, São Paulo - SP, Brasil | /busca/venda/br/sp/sao-paulo/morumbi? |

  Esquema do Cenário: [CT_005] Home Page | Busca | Compra | Prontos por Rua
    Dado retiro a seleção Comprar na Planta
    Quando insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                                                | URL                                                      |
      | Rua Bela Cintra - Consolação, São Paulo - SP, Brasil | /busca/venda/br/sp/sao-paulo/consolacao/rua-bela-cintra? |

  Esquema do Cenário: [CT_006] Home Page | Busca | Aluguel | Prontos
    Dado clico em Alugar
    Quando insiro "<Busca>" no campo de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Busca                                                | URL                                                        |
      | São Paulo, Brasil                                    | /busca/aluguel/br/sp?                                      |
      | São Paulo, SP, Brasil                                | /busca/aluguel/br/sp/sao-paulo?                            |
      | Morumbi, São Paulo - SP, Brasil                      | /busca/aluguel/br/sp/sao-paulo/morumbi?                    |
      | Rua Bela Cintra - Consolação, São Paulo - SP, Brasil | /busca/aluguel/br/sp/sao-paulo/consolacao/rua-bela-cintra? |

   Esquema do Cenário: [CT_005] Home Page | Busca | Compra | Por Lançamento
     Dado retiro a seleção Comprar Pronto
     Quando insiro "<Busca>" no campo de busca
     E seleciono a opção "<Busca>"
     E clico no botão Buscar
     Então vejo a Ficha do Imóvel com a url "<URL>"

     Exemplos:
     | Busca         | URL                                                       |
     | Chez Vitacon  | /lancamento/REM15992/chez-vitacon-sao-paulo-consolacao    |

  Cenario: [CT_007] Home Page | Busca | Compra | Busca inválida
    Dado retiro a seleção Comprar Pronto
    E insiro "Acre" no campo de busca
    E seleciono a opção "Acre, Brasil"
    Quando clico no botão Buscar
    Então vejo a mensagem "Nenhum imóvel disponível no momento." de resultados não encontrados

  Esquema do Cenario: [CT_004] Home Page | Busca | Compra | Validar autocomplete
    Dado retiro a seleção Comprar na Planta
    E insiro "<Autocomplete>" no campo de busca
    Quando vejo o autocomplete com as sugestões de busca
    E seleciono a opção "<Busca>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
    | Autocomplete | Busca                             | URL                                       |
    | Sao          | São Bernardo do Campo, SP, Brasil | /busca/venda/br/sp/sao-bernardo-do-campo? |


