#language: pt
@REGRESSAO @FichaImovel
Funcionalidade: [QA-21] Ficha do Imóvel | Validar os detalhes do imóvel

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico no botão Buscar

  Cenario: [CT_016] Ficha do Imóvel | Detalhes | Validar detalhes
    Dado clico em uma card
    Quando vejo a Ficha do Imóvel
    Então vejo o carrossel de fotos
    E vejo os botões da Galeria
    E vejo as informações do imóvel
    E vejo os valores do imóvel
    E vejo os atributos do imóvel
    E vejo sobre o imóvel
    E vejo o botão Compartilhar
    E vejo o botão Favoritar