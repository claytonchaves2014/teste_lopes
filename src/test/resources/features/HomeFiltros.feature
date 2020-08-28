#language: pt
@REGRESSAO @HomeFiltros
Funcionalidade: [QA-10] Home Page | Fazer buscas avançadas de empreendimentos utilizando Filtros

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Valor
    Dado clico em Filtros na Home Page
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Minimo | Maximo   | URL                                  |
      | 100    | 10000000 | preco-maior=10000000&preco-menor=100 |

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Validar Valor
    Dado clico em Filtros na Home Page
    Quando insiro um valor mínimo de "<Minimo>"
    E insiro um valor máximo de "<Maximo>"
    Então vejo o alerta para Valor "<Alerta>"

    Exemplos:
      | Minimo   | Maximo | Alerta                                   |
      | 10000000 | 1      | O mínimo não pode ser maior que o máximo |

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Área do imóvel
    Dado clico em Filtros na Home Page
    Quando insiro uma área mínima de "<Minimo>"
    E insiro uma área máxima de "<Maximo>"
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Minimo | Maximo   | URL                                |
      | 100    | 10000000 | area-maior=10000000&area-menor=100 |

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Validar Área do imóvel
    Dado clico em Filtros na Home Page
    Quando insiro uma área mínima de "<Minimo>"
    E insiro uma área máxima de "<Maximo>"
    Então vejo o alerta para Area "<Alerta>"

    Exemplos:
      | Minimo   | Maximo | Alerta                                   |
      | 10000000 | 1      | O mínimo não pode ser maior que o máximo |

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Dormitórios
    Dado clico em Filtros na Home Page
    Quando seleciono "<Qtd>" como quantidade de Dormitórios
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Qtd   | URL       |
      | 1     | quartos=1 |
      | 2     | quartos=2 |
      | 3     | quartos=3 |
      | 4+    | quartos=4 |

  Esquema do Cenário: [CT_009] Home Page | Busca | Filtros | Vagas
    Dado clico em Filtros na Home Page
    Quando seleciono "<Qtd>" como quantidade de Vagas
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Qtd   | URL     |
      | 1     | vagas=1 |
      | 2     | vagas=2 |
      | 3     | vagas=3 |
      | 4+    | vagas=4 |

  Esquema do Cenário: [CT_008] Home Page | Busca | Filtros | Selecionar todos os filtros
    Dado clico em Filtros na Home Page
    Quando insiro um valor mínimo de "<Valor Minimo>"
    E insiro um valor máximo de "<Valor Maximo>"
    E insiro uma área mínima de "<Area Minima>"
    E insiro uma área máxima de "<Area Maxima>"
    E seleciono "<Dormitorios>" como quantidade de Dormitórios
    E seleciono "<Vagas>" como quantidade de Vagas
    E clico no botão Buscar
    Então vejo os Resultados de Busca com a url "<URL>"

    Exemplos:
      | Valor Minimo | Valor Maximo | Area Minima | Area Maxima | Dormitorios | Vagas | URL                                                                                   |
      | 100.000      | 1.000.000    | 100         | 300         | 3           | 2     | area-maior=300&preco-maior=1000000&area-menor=100&preco-menor=100000&vagas=2&quartos=3 |

  Esquema do Cenário: [CT_010] Home Page | Busca | Filtros | Limpar filtros
    Dado clico em Filtros na Home Page
    Quando insiro um valor mínimo de "<Valor Minimo>"
    E insiro um valor máximo de "<Valor Maximo>"
    E insiro uma área mínima de "<Area Minima>"
    E insiro uma área máxima de "<Area Maxima>"
    E seleciono "<Dormitorios>" como quantidade de Dormitórios
    E seleciono "<Vagas>" como quantidade de Vagas
    Então clico em Limpar filtros na Home

    Exemplos:
      | Valor Minimo | Valor Maximo | Area Minima | Area Maxima | Dormitorios | Vagas |
      | 100.000      | 400.000      | 100         | 300         | 3           | 2     |
