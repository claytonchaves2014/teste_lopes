#language: pt

#@REGRESSAO
@ResultadoFiltros

Funcionalidade: [QA-16] Resultado de Busca | Filtrar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico no botão Buscar

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Casa
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "<Subtipo>" do tipo Casa
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Subtipo         | URL                   |
      | Casa            | /tipo/casa            |
      | Casa de Vila    | /tipo/casa-de-vila    |
      | Casa Térrea     | /tipo/casa-terrea     |
      | Casa Condomínio | /tipo/casa-condominio |
      | Sobrado         | /tipo/sobrado         |
      | Villagio        | /tipo/villagio        |

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Apartamento
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "<Subtipo>" do tipo Apartamento
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Subtipo     | URL               |
      | Apartamento | /tipo/apartamento |
      | Cobertura   | /tipo/cobertura   |
      | Duplex      | /tipo/duplex      |
      | Loft        | /tipo/loft        |
      | Penthouse   | /tipo/penthouse   |
      | Studio      | /tipo/studio      |
      | Garden      | /tipo/garden      |
      | Triplex     | /tipo/triplex     |

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Flat
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "Flat" do tipo Flat
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/flat"

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Galpão
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "<Subtipo>" do tipo Galpão
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Subtipo  | URL            |
      | Galpão   | /tipo/galpao   |
      | Barracão | /tipo/barracao |

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Hotel
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo Hotel do tipo Hotel
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/hotel"

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Lajes corporativas
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo Lajes corporativas do tipo Lajes corporativas
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/lajes-corporativas"

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Loteamento
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo Loteamento do tipo Loteamento
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/loteamento"

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Mall
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "<Subtipo>" do tipo Mall
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Subtipo | URL        |
      | Loja    | /tipo/loja |
      | Mall    | /tipo/mall |

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Rural
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "<Subtipo>" do tipo Rural
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Subtipo | URL           |
      | Rural   | /tipo/rural   |
      | Chácara | /tipo/chacara |
      | Fazenda | /tipo/fazenda |
      | Sítio   | /tipo/sitio   |

  Cenário: [QA-16] Resultados de Busca | Filtros | Por Tipo de Imóvel | Salão
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo Salão Comercial do tipo Salão
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/salao-comercial"

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Salas
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "<Subtipo>" do tipo Salas
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Subtipo          | URL                    |
      | Salas Comerciais | /tipo/salas-comerciais |
      | Prédio inteiro   | /tipo/predio-inteiro   |

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Terreno
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo Terreno do tipo Terreno
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/terreno"

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Características do Imóvel
    Dado clico no botão Filtros
    Quando clico em Características do Imóvel
    E seleciono "<Quantidade>" em "<Tipo>"
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Quantidade | Tipo        | URL         |
      | 1          | Dormitórios | quartos=1   |
      | 2          | Dormitórios | quartos=2   |
      | 3          | Dormitórios | quartos=3   |
      | 4+         | Dormitórios | quartos=4   |
      | 1          | Vagas       | vagas=1     |
      | 2          | Vagas       | vagas=2     |
      | 3          | Vagas       | vagas=3     |
      | 4+         | Vagas       | vagas=4     |
      | 1          | Suítes      | suites=1    |
      | 2          | Suítes      | suites=2    |
      | 3          | Suítes      | suites=3    |
      | 4+         | Suítes      | suites=4    |
      | 1          | Banheiros   | banheiros=1 |
      | 2          | Banheiros   | banheiros=2 |
      | 3          | Banheiros   | banheiros=3 |
      | 4+         | Banheiros   | banheiros=4 |

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Por Área
    Dado clico no botão Filtros
    Quando clico em Área
    E insiro "<Minima>" como área mínima
    E insiro "<Maxima>" como área máxima
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Minima | Maxima | URL                           |
      | 100    | 200    | area-maior=200&area-menor=100 |

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Por Valor
    Dado clico no botão Filtros
    Quando clico em Valor
    E insiro "<Minimo>" como valor mínimo
    E insiro "<Maximo>" como valor máximo
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Minimo | Maximo | URL                                   |
      | 100000 | 300000 | preco-maior=300000&preco-menor=100000 |

  Esquema do Cenário: [QA-16] Resultados de Busca | Filtros | Por Outros filtros
    Dado clico no botão Filtros
    Quando clico em Outros filtros
    E seleciono "<Filtros>" como Outros Filtros
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Filtros                         | URL                                        |
      | Academia de ginástica           | /comodidade/com-academia                   |
      | Churrasqueira                   | comodidade/com-churrasqueira               |
      | Piscina                         | comodidade/com-piscina                     |

  Cenário: [3154] Resultados de Busca | Filtros | Aplicar filtro e alterar Tipo de Transação
    Dado clico no botão Filtros
    E clico em Características do Imóvel
    E seleciono "3" em "Dormitórios"
    E seleciono "2" em "Vagas"
    E clico em Aplicas os filtros selecionados
    E visualizo os filtros como "Filtros (2)"
    Quando clico em Tipo de Transação
    E seleciono o tipo de transação "Aluguel"
    Então visualizo os filtros como "Filtros (2)"