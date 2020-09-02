#language: pt
@REGRESSAO @FichaGaleria
Funcionalidade: [QA-22] Ficha do Imóvel | Validar a galeria do imóvel

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Aceitar Cookies

  Cenario: [CT_018] Ficha do Imóvel | Galeria | Validar galeria
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    E clico no botão Buscar
    Quando clico em uma card
    E vejo a Ficha do Imóvel
    E clico na imagem do imóvel
    Então a Galeria de Imagens é aberta
    E vejo o submenu da galeria
    E vejo o botão Fechar
    E vejo a lista de imagens