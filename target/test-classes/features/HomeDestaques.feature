#language: pt

@REGRESSAO @HomeDestaques

Funcionalidade: Home Page | Validar os destaques do Portal

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: Home Page | Destaques | Lançamentos Exclusivos
    Dado vejo o titulo dos destaques "Inspire-se com a nossa seleção"
    E vejo o subtitulo dos destaques "Confira as oportunidades apaixonantes que separamos para você"
    Quando vejo os destaques de Lançamentos exclusivos
    Então vejo o tipo do imóvel
    E vejo o nome do empreendimento
    E vejo o endereço do empreendimento
    E vejo a área do empreendimento
    E vejo o estado da obra do empreendimento
    E vejo a quantidade de dormitórios do empreendimento
    E vejo a quantidade de chuveiros do empreendimento
    E vejo a quantidade de vagas do empreendimento

  Cenário: Home Page | Destaques | Próximos Lançamentos
    Dado vejo o titulo dos destaques "Inspire-se com a nossa seleção"
    E vejo o subtitulo dos destaques "Confira as oportunidades apaixonantes que separamos para você"
    Quando vejo os destaques de Próximos Lançamentos
    Então vejo o tipo do imóvel de Próximos Lançamentos
    E vejo o nome do empreendimento de Próximos Lançamentos
    E vejo o endereço do empreendimento de Próximos Lançamentos
    E vejo a área do empreendimento de Próximos Lançamentos
    E vejo o estado da obra do empreendimento de Próximos Lançamentos