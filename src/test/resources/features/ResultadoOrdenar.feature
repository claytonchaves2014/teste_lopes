#language: pt
@REGRESSAO @ResultadoOrdenar
Funcionalidade: [QA-18] Resultado de Busca | Validar a ordenação dos resultados

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Relevância
    Dado clico no botão Buscar
    Quando que clico em Ordenar
    E seleciono ordenar por Relevância
    Então verifico que os resultados são ordenados por "Relevância"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Menor Valor
    Dado clico no botão Buscar
    Quando que clico em Ordenar
    E seleciono ordenar por Menor valor
    Então verifico que os resultados são ordenados por "Menor valor"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Maior Valor
    Dado clico no botão Buscar
    Quando que clico em Ordenar
    E seleciono ordenar por Maior valor
    Então verifico que os resultados são ordenados por "Maior valor"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Data de Atualização
    Dado clico no botão Buscar
    Quando que clico em Ordenar
    E seleciono ordenar por Data de atualização
    Então verifico que os resultados são ordenados por "Data de atualização"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Área do imóvel
    Dado clico no botão Buscar
    Quando que clico em Ordenar
    E seleciono ordenar por Área do imóvel
    Então verifico que os resultados são ordenados por "Área do imóvel"