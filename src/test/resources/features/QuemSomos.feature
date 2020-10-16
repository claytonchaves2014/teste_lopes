#language: pt

@REGRESSAO @QuemSomos

Funcionalidade: [2808] Quem Somos | Validar a página

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [3085] Quem Somos | Validar layout
    Dado verifico o Footer da página
    Quando clico em Quem Somos
    Então vejo o banner do Quem Somos
    E vejo o título com o texto "Especialistas no mercado imobiliário"
    E vejo o subtitulo com o texto "Com uma equipe de mais de 9.000 corretores associados, a Lopes não é apenas um intermédio na negociação, mas um parceiro para encontrar a melhor oportunidade para você."
    E vejo a primeira card de informações com o texto "10 estados, Sul, Sudeste, BA, CE, GO e DF"
    E vejo a segunda card de informações com o texto "85 anos de experiência no mercado"
    E vejo a terceira card de informações com o texto "180 mil imóveis à venda"
    E vejo a quarta card de informações com o texto "9 mil corretores associados"
    E vejo a quinta card de informações com o texto "102 lojas próprias e franquias"

  Cenário: [2808] Quem Somos | Quero investir
    Dado verifico o Footer da página
    Quando clico em Quem Somos
    E clico em Quero investir
    Então verifico que a URL é aberta "/busca/venda/br/"