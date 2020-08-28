#language: pt

@REGRESSAO @HomePage

Funcionalidade: [QA-11] Home Page | Validar os destaques do Portal

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: [CT_011] Home Page | Informações | Validar informações Lopes
    Dado visualizo o componente de informações
    Quando vejo a primeira informação como "Milhares de opções para encontrar" e descrição "o imóvel que combina com você"
    E vejo a segunda informação como "Uma rede nacional com mais de" e descrição "9 mil consultores locais especializados"
    Então vejo a terceira informação como "Inteligência de mercado para" e descrição "te ajudar a fazer o melhor negócio"