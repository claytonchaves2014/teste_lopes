#language: pt

@REGRESSAO
@FichaGaleria

Funcionalidade: [QA-22] Ficha do Imóvel | Validar a galeria do imóvel

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico no botão Buscar

  Cenario: [CT_018] Ficha do Imóvel | Galeria | Validar galeria
    Dado clico em uma card
    Quando vejo a Ficha do Imóvel
    E clico na imagem do imóvel
    Então a Galeria de Imagens é aberta
    E vejo o submenu da galeria
    E vejo o botão Fechar
    E vejo a lista de imagens