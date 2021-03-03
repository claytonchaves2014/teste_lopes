#language: pt

@REGRESSAO
@ResultadoOrdenar

Funcionalidade: [QA-18] Resultado de Busca | Validar a ordenação dos resultados

  Contexto:
    Dado acesso o Portal da Lopes
    Então clico no botão Buscar

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Relevância
    Dado que clico em Ordenar
    Quando seleciono ordenar por Relevância
    Então verifico que os resultados são ordenados por "Relevância"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Menor Valor
    Dado que clico em Ordenar
    Quando seleciono ordenar por Menor valor
    Então verifico que os resultados são ordenados por "Menor valor"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Maior Valor
    Dado que clico em Ordenar
    Quando seleciono ordenar por Maior valor
    Então verifico que os resultados são ordenados por "Maior valor"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Data de Atualização
    Dado que clico em Ordenar
    Quando seleciono ordenar por Data de atualização
    Então verifico que os resultados são ordenados por "Data de atualização"

  Cenário: [CT_015] Resultados de Busca | Ordenação | Por Área do imóvel
    Dado que clico em Ordenar
    Quando seleciono ordenar por Área do imóvel
    Então verifico que os resultados são ordenados por "Área do imóvel"