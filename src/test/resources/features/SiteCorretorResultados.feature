#language: pt

#@REGRESSAO
@SiteCorretor
@ResultadosCorretor

Funcionalidade: [3047] Site do Corretor | Validar o cabeçalho

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [3047] Site do Corretor | Resultados | Validar o layout
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E verifico os resultados de imóveis do corretor
    Então visualizo a descrição com o total dos imóveis encontrados
    E visualizo o botão Ordenar
    E visualizo o botão Filtros
    E visualizo as cards dos imóveis
    E visualizo a paginação
    E visualizo o footer como "2020 Copyright - LPS SÃO PAULO CONSULTORIA DE IMÓVEIS LTDA - CRECI 024073-J - CNPJ 15.673.605/0001-10 - Todos os direitos reservados"

  Cenário: [3047] Site do Corretor | Resultados | Validar card
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E verifico os resultados de imóveis do corretor
    Então visualizo a card do imóvel
    E visualizo a foto do imóvel na card
    E visualizo o tipo do imóvel na card
    E visualizo o endereço do imóvel na card
    E visualizo os atributos do imóvel na card

  Cenário: [3047] Site do Corretor | Resultados | Validar a paginação
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E verifico os resultados de imóveis do corretor
    Quando visualizo a paginação
    E clico no botão avançar para a próxima página
    Então valido que a próxima página é aberta

  Esquema do Cenário: [3047] Site do Corretor | Resultados | Ordenar resultados
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    Quando verifico os resultados de imóveis do corretor
    E clico no botão Ordenar
    E seleciono a opção "<Ordenar>" de ordenção
    Então verifico que os resultados foram ordenados por "<Ordenar>"

    Exemplos:
    | Corretor | Ordenar             |
    | Maria.Luiza   | Relevância          |
    | Maria.Luiza   | Menor valor         |
    | Maria.Luiza   | Maior valor         |
    | Maria.Luiza   | Data de atualização |
    | Maria.Luiza   | Área do imóvel      |