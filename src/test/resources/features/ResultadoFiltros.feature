#language: pt
@REGRESSAO
@ResultadoFiltros

Funcionalidade: [QA-16] Resultado de Busca | Filtrar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    E clico em Aceitar Cookies
    Quando insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
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
    E seleciono o subtipo "Hotel" do tipo Hotel
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/hotel"

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Lajes corporativas
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "Lajes corporativas" do tipo Lajes corporativas
    E clico em Aplicas os filtros selecionados
    Então vejo os Resultados de Busca com a url "/tipo/lajes-corporativas"

  Cenário: [QA-16] Resultados de Busca | Filtros | Tipo de Imóvel | Por Loteamento
    Dado clico no botão Filtros
    Quando clico em Tipo do Imóvel
    E seleciono o subtipo "Loteamento" do tipo Loteamento
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
    E seleciono o subtipo "Salão Comercial" do tipo Salão
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
    E seleciono o subtipo "Terreno" do tipo Terreno
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
      | Acesso à internet               | comodidade=acesso-a-internet               |
      | Acesso para deficientes físicos | comodidade=acesso-para-deficientes-fisicos |
      | Adega / champagnerie            | comodidade=adega-champagnerie              |
      | Antena parabólica               | comodidade=antena-parabolica               |
      | Aquecedor central               | comodidade=aquecedor-central               |
      | Ar-condicionado                 | comodidade=ar-condicionado                 |
      | Arborismo                       | comodidade=arborismo                       |
      | Arborização de ruas             | comodidade=arborizacao-de-ruas             |
      | Área de lazer                   | comodidade=area-de-lazer                   |
      | Área verde                      | comodidade=area-verde                      |
      | Armário embutido                | comodidade=armario-embutido                |
      | Arvorismo                       | comodidade=arvorismo                       |
      | Ateliê                          | comodidade=atelie                          |
      | Auditório                       | comodidade=auditorio                       |
      | Banheira/hidromassagem          | comodidade=banheira-hidromassagem          |
      | Bar                             | comodidade=bar                             |
      | Bicicletário                    | comodidade=bicicletario                    |
      | Biribol                         | comodidade=biribol                         |
      | Bocha                           | comodidade=bocha                           |
      | Brinquedoteca                   | comodidade=brinquedoteca                   |
      | Cafeteria                       | comodidade=cafeteria                       |
      | Calçada gramada                 | comodidade=calcada-gramada                 |
      | Campo de futebol                | comodidade=campo-de-futebol                |
      | Campo de golf                   | comodidade=campo-de-golf                   |
      | Car wash                        | comodidade=car-wash                        |
      | Casa da árvore                  | comodidade=casa-da-arvore                  |
      | Centro comercial                | comodidade=centro-comercial                |
      | Centro de conveniência          | comodidade=centro-de-conveniencia          |
      | Chafariz                        | comodidade=chafariz                        |
      | Child care                      | comodidade=child-care                      |
      | Chimarródromo                   | comodidade=chimarrodromo                   |
      | Churrasqueira                   | comodidade/com-churrasqueira               |
      | Ciclovia                        | comodidade=ciclovia                        |
      | Cinema                          | comodidade=cinema                          |
      | Closet                          | comodidade=closet                          |
      | Clube                           | comodidade=clube                           |
      | Concierge                       | comodidade=concierge                       |
      | Copa                            | comodidade=copa                            |
      | Cozinha americana               | comodidade=cozinha-americana               |
      | Cozinha mobiliada               | comodidade=cozinha-mobiliada               |
      | Deck                            | comodidade=deck                            |
      | Dependência de empregados       | comodidade=dependencia-de-empregados       |
      | Depósito                        | comodidade=deposito                        |
      | Despensa                        | comodidade=despensa                        |
      | Detector de incêndio            | comodidade=detector-de-incendio            |
      | Duplex                          | comodidade=duplex                          |
      | Elevador                        | comodidade=elevador                        |
      | Escada rolante                  | comodidade=escada-rolante                  |
      | Espaço gourmet                  | comodidade=espaco-gourmet                  |
      | Espaço zen                      | comodidade=espaco-zen                      |
      | Estacionamento rotativo         | comodidade=estacionamento-rotativo         |
      | Fibra ótica                     | comodidade=fibra-otica                     |
      | Fitness                         | comodidade=fitness                         |
      | Forno para pizza                | comodidade=forno-para-pizza                |
      | Forro rebaixado                 | comodidade=forro-rebaixado                 |
      | Frente para o mar               | comodidade=frente-para-o-mar               |
      | Garage band                     | comodidade=garage-band                     |
      | Garage band / danceteria        | comodidade=garage-band-danceteria          |
      | Garagem                         | comodidade=garagem                         |
      | Gazebo                          | comodidade=gazebo                          |
      | Gerador                         | comodidade=gerador                         |
      | Hall                            | comodidade=hall                            |
      | Heliponto                       | comodidade=heliponto                       |
      | Home office                     | comodidade=home-office                     |
      | Horta                           | comodidade=horta                           |
      | Horta comunitária               | comodidade=horta-comunitaria               |
      | Lago                            | comodidade=lago                            |
      | Lan house                       | comodidade=lan-house                       |
      | Lareira                         | comodidade=lareira                         |
      | Lavanderia                      | comodidade=lavanderia                      |
      | Living                          | comodidade=living                          |
      | Lounge                          | comodidade=lounge                          |
      | Massagem                        | comodidade=massagem                        |
      | Ofurô                           | comodidade=ofuro                           |
      | Orquidário                      | comodidade=orquidario                      |
      | Parede de escalada              | comodidade=parede-de-escalada              |
      | Pay-per-use                     | comodidade=pay-per-use                     |
      | Pérgola                         | comodidade=pergola                         |
      | Pet care                        | comodidade=pet-care                        |
      | Piscina                         | comodidade/com-piscina                     |
      | Piscina adulto coberta          | comodidade=piscina-adulto-coberta          |
      | Piscina adulto descoberta       | comodidade=piscina-adulto-descoberta       |
      | Piscina coberta                 | comodidade=piscina-coberta                 |
      | Piscina com raia                | comodidade=piscina-com-raia                |
      | Piscina descoberta              | comodidade=piscina-descoberta              |
      | Piscina infantil coberta        | comodidade=piscina-infantil-coberta        |
      | Piscina infantil descoberta     | comodidade=piscina-infantil-descoberta     |
      | Piso elevado                    | comodidade=piso-elevado                    |
      | Pista de skate                  | comodidade=pista-de-skate                  |
      | Playground                      | comodidade=playground                      |
      | Pomar                           | comodidade=pomar                           |
      | Port cochère                    | comodidade=port-cochere                    |
      | Portaria                        | comodidade=portaria                        |
      | Praça                           | comodidade=praca                           |
      | Quadra                          | comodidade=quadra                          |
      | Quadra de areia                 | comodidade=quadra-de-areia                 |
      | Quadra de futebol society       | comodidade=quadra-de-futebol-society       |
      | Quadra de squash                | comodidade=quadra-de-squash                |
      | Quadra de tênis                 | comodidade=quadra-de-tenis                 |
      | Quadra de volei                 | comodidade=quadra-de-volei                 |
      | Quadra gramada                  | comodidade=quadra-gramada                  |
      | Quadra poliesportiva            | comodidade=quadra-poliesportiva            |
      | Quintal                         | comodidade=quintal                         |
      | Redário                         | comodidade=redario                         |
      | Rede de água                    | comodidade=rede-de-agua                    |
      | Rede de energia elétrica        | comodidade=rede-de-energia-eletrica        |
      | Restaurante                     | comodidade=restaurante                     |
      | Rua asfaltada                   | comodidade=rua-asfaltada                   |
      | Sala de artes marciais / luta   | comodidade=sala-de-artes-marciais-luta     |
      | Sala de cinema                  | comodidade=sala-de-cinema                  |
      | Sala de convenção               | comodidade=sala-de-convencao               |
      | Sala de leitura                 | comodidade=sala-de-leitura                 |
      | Sala de massagem                | comodidade=sala-de-massagem                |
      | Sala de música                  | comodidade=sala-de-musica                  |
      | Sala de reuniões                | comodidade=sala-de-reunioes                |
      | Sala de spinning                | comodidade=sala-de-spinning                |
      | Sala de yoga / pilates          | comodidade=sala-de-yoga-pilates            |
      | Salão de beleza                 | comodidade=salao-de-beleza                 |
      | Salão de festas                 | comodidade=salao-de-festas                 |
      | Salão de festas adulto          | comodidade=salao-de-festas-adulto          |
      | Salão de festas infantil        | comodidade=salao-de-festas-infantil        |
      | Salão de jogos                  | comodidade=salao-de-jogos                  |
      | Salão de jogos adulto           | comodidade=salao-de-jogos-adulto           |
      | Salão de jogos infantil         | comodidade=salao-de-jogos-infantil         |
      | Salão de jogos juvenil          | comodidade=salao-de-jogos-juvenil          |
      | Salão de recreação              | comodidade=salao-de-recreacao              |
      | Sauna                           | comodidade=sauna                           |
      | Sede social                     | comodidade=sede-social                     |
      | Segurança                       | comodidade=seguranca                       |
      | Serviços                        | comodidade=servicos                        |
      | Shaft de telecomunicações       | comodidade=shaft-de-telecomunicacoes       |
      | Solarium                        | comodidade=solarium                        |
      | Sótão                           | comodidade=sotao                           |
      | Spa                             | comodidade=spa                             |
      | Spiribol                        | comodidade=spiribol                        |
      | Street ball                     | comodidade=street-ball                     |
      | Teatro                          | comodidade=teatro                          |
      | Terraço                         | comodidade=terraco                         |
      | Trilha / pista de caminhada     | comodidade=trilha-pista-de-caminhada       |
      | Triplex                         | comodidade=triplex                         |
      | Vaga de visitante               | comodidade=vaga-de-visitante               |
      | Varanda gourmet                 | comodidade=varanda-gourmet                 |
      | Vestiário                       | comodidade=vestiario                       |
      | Vestiário para funcionários     | comodidade=vestiario-para-funcionarios     |
      | Vila hípica                     | comodidade=vila-hipica                     |
