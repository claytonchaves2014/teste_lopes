#language: pt
@REGRESSAO @HomeHeader
Funcionalidade: [QA-7] Home Page | Validar os links do Header

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [CT_001] Home Page | Header | Lançamentos
    Dado clico no header Lançamentos
    Então vejo os Resultados de Busca com a url "/busca/lancamento/br/sp/sao-paulo"

  Cenário: [CT_001] Home Page | Header | Prontos
    Dado clico no header Prontos
    Então vejo os Resultados de Busca com a url "/busca/venda/br/sp/sao-paulo"

  Cenário: [CT_001] Home Page | Header | Aluguel
    Dado clico no header Aluguel
    Então vejo os Resultados de Busca com a url "/busca/aluguel/br/sp/sao-paulo"

  Cenário: [CT_001] Home Page | Header | Anuncie seu imóvel
    Dado clico no header Anuncie seu imóvel
    Então verifico que a URL é aberta "/paginas/anuncie-seu-imovel"

  Cenário: [CT_001] Home Page | Header | Seja um franqueado
    Dado clico no header Seja um franqueado
    Então verifico que a URL é aberta "/paginas/seja-um-franqueado"

  Cenário: [CT_001] Home Page | Header | Calculadora de Compra
    Dado clico no header Calculadora de Compra
    Então verifico que a URL é aberta "/calculadora-simulador-de-financiamento-imobiliario"

  Cenário: [CT_001] Home Page | Header | Fale conosco
    Dado clico no header Fale conosco
    Então verifico que a URL é aberta "/paginas/fale-conosco"

  Cenário: [CT_001] Home Page | Header | Favoritos
    Dado clico no header Favoritos
    Então verifico que a URL é aberta "/favoritos"