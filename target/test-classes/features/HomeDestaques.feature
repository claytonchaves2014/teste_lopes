#language: pt

@HomeDestaques

Funcionalidade: [QA-12] Home Page | Validar os destaques do Portal

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenário: [CT_012] Home Page | Destaques | Lançamentos Exclusivos
    Dado vejo o titulo dos destaques "Inspire-se com a nossa seleção"
    E vejo o subtitulo dos destaques "Confira as oportunidades apaixonantes que separamos para você"
    Quando vejo os destaques de Lançamentos exclusivos
    Então vejo o tipo do imóvel
    E vejo o nome do empreendimento
    E vejo o endereço do empreendimento
    E vejo os atributos do empreendimento

  Cenário: [CT_012] Home Page | Destaques | Próximos Lançamentos
    Dado vejo o titulo dos destaques "Inspire-se com a nossa seleção"
    E vejo o subtitulo dos destaques "Confira as oportunidades apaixonantes que separamos para você"
    Quando vejo os destaques de Próximos Lançamentos
    Então vejo o tipo do imóvel de Próximos Lançamentos
    E vejo o nome do empreendimento de Próximos Lançamentos
    E vejo o endereço do empreendimento de Próximos Lançamentos
    E vejo os atributos do empreendimento de Próximos Lançamentos