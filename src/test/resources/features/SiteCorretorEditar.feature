#language: pt
#@REGRESSAO
@SiteCorretor
  @EditarCorretor

Funcionalidade: [3068] Site do Corretor | Editar o perfil

  Contexto:
    Dado acesso o Portal da Lopes

#  @ignore
#  Cenario: [3068] Site do Corretor | Editar | Validar o perfil público
#      Dado acesso o Site do Corretor "Maria.Luiza"
#      Então não visualizo o botão Editar

  Esquema do Cenário: Cenário: [3068] Site do Corretor | Editar | Validar o botão Editar
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    Então visualizo o botão Editar

    Exemplos:
    | CPF         | Senha     | Corretor       |
    | 26317760896 | 2631lopes | Maria.Luiza    |
#    | 44167715848 | 4416lopes  | PEDRO.BROOKLIN |
    | 14014488608 | 1401lopes | ALURA          |

  Cenário: [3068] Site do Corretor | Editar | Validar campos no Editar
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no botão Editar
    Então visualizo o campo Telefone Principal
    E visualizo o campo Telefone Alternativo
    E visualizo o texto abaixo dos telefones "Caso tenha WhatsApp, recomendamos que coloque-o no campo telefone principal"
    E visualizo o campo E-mail
    E visualizo o campo Biografia
    E visualizo o botão Cancelar
    E visualizo o botão Salvar

  Cenário: [3068] Site do Corretor | Editar | Clicar em Cancelar
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no botão Editar
    E clico no botão Cancelar
    Então o modal do Editar é fechado

  Esquema do Cenário: [3068] Site do Corretor | Editar | Editar telefone principal
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    E clico no botão Editar
    E insiro o número "<Telefone Principal>" no campo Telefone Principal
    Então clico em Salvar

    Exemplos:
     | CPF         | Senha     | Corretor    | Telefone Principal |
     | 26317760896 | 2631lopes | Maria.Luiza | (19) 98286-0115    |
     | 26317760896 | 2631lopes | Maria.Luiza | (19) 2668-7581     |

  Esquema do Cenário: [3068] Site do Corretor | Editar | Telefone principal inválido
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    E clico no botão Editar
    E insiro o número "<Telefone Principal>" no campo Telefone Principal
    Então vejo a mensagem de validação "<Validação>" no Telefone Principal

    Exemplos:
      | CPF         | Senha     | Corretor    | Telefone Principal | Validação                         |
      | 26317760896 | 2631lopes | Maria.Luiza | (11) 0000-00       | Telefone principal é obrigatório! |

  Cenário: [3068] Site do Corretor | Editar | Telefone principal em branco
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no botão Editar
    E deixo o Telefone Principal em branco
    Então vejo a mensagem de validação "Esse telefone principal é inválido!" no Telefone Principal

#  Esquema do Cenário: [3068] Site do Corretor | Editar | Telefone principal de outros países
#    Dado clico em Minha conta
#    E clico em Corretor
#    E insiro meu CPF de corretor "<CPF>"
#    E insiro minha Senha de corretor "<Senha>"
#    E clico em Entrar
#    Quando acesso o Site do Corretor "<Corretor>"
#    E clico no botão Editar
#    E clico do dropdown para trocar o país do Telefone Principal
#    E seleciono o país "<País>" para Telefone Principal
#    E insiro o número "<Telefone Principal>" no campo Telefone Principal
#    Então clico em Salvar
#
#    Exemplos:
#      | CPF         | Senha     | Corretor    | País           | Telefone Principal |
#      | 26317760896 | 2631lopes | Maria.Luiza | Estados Unidos | (123) 456-7890     |
#      | 26317760896 | 2631lopes | Maria.Luiza | Portugal       | 987 654 321        |

  Esquema do Cenário: [3068] Site do Corretor | Editar | Editar telefone alternativo
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    E clico no botão Editar
    E insiro o número "<Telefone Alternativo>" no campo Telefone Alternativo
    Então clico em Salvar

    Exemplos:
      | CPF         | Senha     | Corretor    | Telefone Alternativo |
      | 26317760896 | 2631lopes | Maria.Luiza | (11) 99951-0869      |
      | 26317760896 | 2631lopes | Maria.Luiza | (11) 3949-8767       |

  Esquema do Cenário: [3068] Site do Corretor | Editar | Telefone alternativo inválido
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    E clico no botão Editar
    E insiro o número "<Telefone Alternativo>" no campo Telefone Alternativo
    Então vejo a mensagem de validação "<Validação>" no Telefone Alternativo

    Exemplos:
      | CPF         | Senha     | Corretor    | Telefone Alternativo | Validação                             |
      | 26317760896 | 2631lopes | Maria.Luiza | (11) 0000-00         | Esse telefone alternativo é inválido! |

#  Esquema do Cenário: [3068] Site do Corretor | Editar | Telefone alternativo de outros países
#    Dado clico em Minha conta
#    E clico em Corretor
#    E insiro meu CPF de corretor "<CPF>"
#    E insiro minha Senha de corretor "<Senha>"
#    E clico em Entrar
#    Quando acesso o Site do Corretor "<Corretor>"
#    E clico no botão Editar
#    E clico do dropdown para trocar o país do Telefone Alternativo
#    E seleciono o país "<País>" para Telefone Alternativo
#    E insiro o número "<Telefone Alternativo>" no campo Telefone Alternativo
#    Então clico em Salvar
#
#    Exemplos:
#      | CPF         | Senha     | Corretor    | País           | Telefone Alternativo |
#      | 26317760896 | 2631lopes | Maria.Luiza | Estados Unidos | (123) 456-7890       |
#      | 26317760896 | 2631lopes | Maria.Luiza | Portugal       | 987 654 321          |

  Esquema do Cenário: [3068] Site do Corretor | Editar | Editar Biografia
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Quando acesso o Site do Corretor "<Corretor>"
    E clico no botão Editar
    E insiro "<Biografia>" na Biografia do Corretor
    Então clico em Salvar

    Exemplos:
      | CPF         | Senha     | Corretor       | Biografia |
      | 26317760896 | 2631lopes | Maria.Luiza    | [QA] Teste de biografia |
#      | 44167715848 | 4416lopes | PEDRO.BROOKLIN | [QA] Teste de biografia |
      | 14014488608 | 1401lopes | ALURA          | [QA] Teste de biografia |

  Cenario: : [3068] Site do Corretor | Editar | Validar Biografia
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no botão Editar
    Então vejo o máximo de caracteres da Biografia é de "280"