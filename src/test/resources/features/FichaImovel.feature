#language: pt
@REGRESSAO @FichaImovel
Funcionalidade: [QA-21] Ficha do Imóvel | Validar os detalhes do imóvel

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenario: [CT_016] Ficha do Imóvel | Detalhes | Validar detalhes
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Quando clico em uma card
    Então vejo a Ficha do Imóvel
    E vejo o carrossel de fotos
    E vejo os botões da Galeria
    E vejo as informações do imóvel
    E vejo os valores do imóvel
    E vejo os atributos do imóvel
    E vejo sobre o imóvel
    E vejo o botão Compartilhar
    E vejo o botão Favoritar