#language: pt

@REGRESSAO

Funcionalidade: Regressivo do portal

  Contexto:
    Dado que eu esteja na tela home do portal

  @HEADER
  Esquema do Cenario: CT_001 - Componente Header - Validar componente
    Quando clico no "<link>" do header
    Então sou direcionado para tela correspondente
    Exemplos:
      | link                  |
      | LANÇAMENTOS           |
#      | Lançamentos           |
#      | Prontos               |
#      | Aluguel               |
#      | Anuncie seu Imóvel    |
#      | Seja Franqueado       |
#      | Calculadora de Compra |
#      | Fale conosco          |
#      | Favoritos             |
#      | Minha conta           |


  @FOOTER
  Esquema do Cenario: CT_002 - Componente Footer - Validar componente
    Quando clico no "<link>" do footer
    Então sou direcionado para tela correspondente
    Exemplos:
      | link                      |
      | App Store                 |
      | Google Play               |
      | A Lopes                   |
      | Quem Somos                |
      | Assessoria de Comunicação |
      | Linha de ética            |
      | Trabalhe conosco          |
      | Relação com investidores  |
      | Serviços                  |
      | Venda seu imóvel          |
      | Alugue seu imóvel         |
      | Credipronto               |
      | Serviços de fotografia    |
      | Redes Sociais             |
      | Facebook                  |
      | Twitter                   |
      | Instagram                 |
      | LinkedIn                  |
      | YouTube                   |
      | Blog                      |


  @BUSCA_DE_PRODUTO
  Cenario: CT_003 - Componente Busca - Validar busca de produtos via geolocalização
    E que permita a geolocalização
    Quando eu clico no botão buscar
    Então sou direcionado para pagina de resultado da busca com seguimento "Comprar"

  Cenario: CT_004 - Componente Busca - Validar autocomplete
    Dado que digito as inicias "Bar"
    E o sistema carrega autocomplete trazendo sujestões para busca
    Quando seleciono uma das opções e clico em buscar
    Então sou direcionado para pagina de resultado da busca com seguimento "Comprar"

  Cenario: CT_005 - Componente Busca - Validar busca de produtos por cidade
    Quando realizo busca pela cidade "Barueri"
    Então sou direcionado para pagina de resultado da busca com seguimento "Comprar"

  Cenario: CT_005 - Componente Busca - Validar busca de produtos pelo produto
    Quando realizo busca pela cidade "One Park Perdizes"
    Então sou direcionado para pagina do empreendimento

  Cenario: CT_006 - Componente Busca - Validar busca de produtos de aluguel
    Quando clico na aba Alugar
    E realizo a busca por um bairro
    Então sou direcionado para pagina de resultado da busca com seguimento "alugar"

  Cenario: CT_007 - Componente de Busca - Validar busca por termo inválido
    Quando realizo busca por um termo inválido
    Então sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    E sistema exibe mensagem: "0 Imóveis encontrados"

  @BUSCA_AVANÇADA_DE_PRODUTO
  Cenario: CT_008 - Componente de Busca - Validar busca avançada com todos os filtros
    E que permita a geolocalização
    Quando clico no botão Filtros
    E preencho todas as opções de filtro avançadas
    Então sou direcionado para pagina de resultado da busca com seguimento "Comprar"

  Cenario: CT_009 - Componente de Busca - Validar busca avançada valor mínimo e máximo
    E que permita a geolocalização
    Quando clico no botão Filtros
    E preencho apenas os valores mínimo e máximo
    Então sou direcionado para pagina de resultado da busca com seguimento "Comprar"

  Cenario: CT_010 - Componente de Busca - Validar limpar filtros de busca avançada
    E que permita a geolocalização
    Quando clico no botão Filtros
    E preencho todas as opções de filtro avançadas
    E clico no link limpar filtros
    Então o sistema exibe todos os filtros limpos

  @COMPONENTE_INFORMAÇÃO
  Esquema do Cenario: CT_011 - Componente Informações - Validar informações Lopes
    Então visualizo o componente informações contendo o "<título>" e "<descrição>"
    Exemplos:
      | título                            | descrição                               |
      | Milhares de opções para encontrar | o imóvel que combina com você           |
      | Uma rede nacional com mais de     | 9 mil consultores locais especializados |
      | Inteligência de mercado para      | te ajudar a fazer o melhor negócio      |

  @COMPONENTE_DESTAQUES_ESPECIAIS
  Esquema do Cenario: CT_012 - Componente Destaques Especiais - Validar destaques especiais
    Então visualizo o componente destaques especiais contendo o "<título>" e o detalhe dos imóveis
    Exemplos:
      | título             |
      | Lançamentos        |
      | Prontos para Morar |

  @COMPONENTE_SERVIÇOS
  Cenario: CT_013 - Componente Serviços - Validar componente serviços
    Então visualizo o carrossel do componente serviços

  @RESULTADO_DA_BUSCA
  @PAGINAÇÃO
  Cenário: CT_014 - Paginação - Validar paginação do resultado da busca
    E que permita a geolocalização
    E eu clico no botão buscar
    E sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    Quando clico na seta para avançar para segunda do resultado da busca
    Então sou direcionado para segunda pagina de resultado da busca com seguimento "Comprar"
    Quando clico na seta para voltar a primeira pagina do resultado da busca
    Então sou direcionado para primeira pagina de resultado da busca com seguimento "Comprar"

  @RESULTADO_DA_BUSCA
    @ORDENAÇÃO
  Esquema do Cenario: CT_015 - Ordenação - Validar ordenação do resultado da busca
    E que permita a geolocalização
    E eu clico no botão buscar
    E sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    Quando mudo a ordenação no resultado da busca para "<ordenação>"
    Então a pagina é reordenada conforme a ordenação escolhida
    Exemplos:
      | ordenação           |
      | Maior Valor         |
      | Maior Valor         |
      | Data de Atualização |
      | Área do Imóvel      |

  @RESULTADO_DA_BUSCA
  @CARD_DO_IMOVEL
  Cenário: CT_016 - Card do Imóvel - Validar Layout do Card do imóvel
    E que permita a geolocalização
    E eu clico no botão buscar
    Quando sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    Então o sistema exibe o card do imóvel com todos os dados do empreendimento

  @RESULTADO_DA_BUSCA
  @FICHA_DO_IMOVEL
  Cenário: CT_017 - Ficha do Imóvel - Validar Layout da Ficha do imóvel
    E que permita a geolocalização
    E eu clico no botão buscar
    E sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    Quando clico em um imóvel da lista do resultado de busca
    Então o sistema exibe a pagina do imóvel com todos os dados do empreendimento

  @RESULTADO_DA_BUSCA
  @GALERIA
  Cenário: CT_018 - Galeria de Fotos do Imóvel - Validar galeria de fotos
    E que permita a geolocalização
    E eu clico no botão buscar
    E sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    Quando clico em um imóvel da lista do resultado de busca
    E clico na imágem do imóvel
    Então sistema exibe modal com imagens e função de troca
    E submenu com opções ver fotos, ver vídeo, ver mapa, street view e Ver plantas

  @RESULTADO_DA_BUSCA
  @FORMULARIO_DE_LEAD
  Cenário: CT_019 - Formulário de Lead - Validar formulário de lead
    E que permita a geolocalização
    E eu clico no botão buscar
    E sou direcionado para pagina de resultado da busca com seguimento "Comprar"
    E clico em um imóvel da lista do resultado de busca
    Quando preencho o formulário de lead na tela do imóvel
    Então o sistema retorna mensagem de confirmação do envio

  @FALE_CONOSCO
  Cenario: CT_020 - Fale Conosco - Validar tela de atendimento fale conosco
    Quando clico no link fale conosco do header
    Então vejo campo assundo com as opções de atendimento

    @FALE_CONOSCO
    Cenario: CT_021 - Fale Conosco Validar formulário de atendimento fale conosco
      E clico no link fale conosco do header
      Quando seleciono "Comprar um imóvel" no campo assundo
      E o sistema carrega o formulário
      E ao preencher clico no botão enviar
      Então o sistema exibe a mensagem de confirmação do envio "Dados enviados. Em breve entraremos em contato."

