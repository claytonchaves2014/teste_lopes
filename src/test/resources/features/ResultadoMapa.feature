#language: pt
@REGRESSAO @ResultadoMapa
Funcionalidade: [QA-15] Resultado de Busca | Validar os resultados de busca

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico em Aceitar Cookies

  Cenário: [QA-15] Resultado de Busca | Mapa | Validar Mapa
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    Quando clico no botão Buscar
    Então vejo o Mapa do resultado de busca

  Cenário: [QA-15] Resultado de Busca | Mapa | Aumentar zoom e validar ícones
    Dado insiro "São Paulo, SP, Brasil" no campo de busca
    E seleciono a opção "São Paulo, SP, Brasil"
    Quando clico no botão Buscar
    Então clico em Aumentar o Zoom
    E vejo os ícones de Coração no Mapa
    E vejo os ícones de Prontos no Mapa