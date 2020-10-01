#language: pt
@Login

Funcionalidade: [QA-76] Login | Validar o login de Cliente

  Contexto:
    Dado acesso o Portal da Lopes

  Esquema do Cenário: [QA-76] Login | Cliente | Acessar conta
    Dado clico em Minha conta
    Quando insiro meu E-mail com "<Email>"
    E insiro minha Senha com "<Senha>"
    E clico em Entrar
    Então acesso a minha conta

    Exemplos:
      | Email                               | Senha     |
      | keflin.rosa@tqi.com.br              | Teste1234 |

  Esquema do Cenário: [QA-78] Login | Cliente | Acesso inválido
    Dado clico em Minha conta
    Quando insiro meu E-mail com "<Email>"
    E insiro minha Senha com "<Senha>"
    E clico em Entrar
    Então vejo a mensagem de login inválido "Usuário e/ou senha incorretos."

    Exemplos:
      | Email                               | Senha     |
      | keflin.rosa@sharklasers.com         | Teste1234 |

  Esquema do Cenário: [QA-86] Login | Cliente | Esqueceu a senha
    Dado clico em Minha conta
    Quando clico em Esqueceu a senha
    E insiro meu E-mail para recuperar senha com "<Email>"
    E clico em Enviar
    Então vejo as instruções para recuperar a senha "<Instrucoes>"

    Exemplos:
      | Email                  | Instrucoes                                                               |
      | keflin.rosa@tqi.com.br | Acesse o e-mail enviado para o endereço cadastrado e siga as instruções. |

  Esquema do Cenario: Cenário: [QA-80] Login | Corretor | Acessar conta
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então sou direcionado ao Portal do Corretor pela URL "frontcrm.lpsbr.com"

    Exemplos:
      | CPF            | Senha    |
      | 056.957.720-95 | lopes123 |

  Esquema do Cenário: [QA-83] Login | Corretor | Acesso inválido
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então vejo a mensagem de login inválido "<Mensagem>"

    Exemplos:
      | CPF            | Senha     | Mensagem                       |
      | 084.069.078-94 | Teste0000 | Usuário e/ou senha incorretos. |

  Esquema do Cenário: [QA-85] Login | Corretor | Esqueceu a Senha
    Dado clico em Minha conta
    Quando clico em Corretor
    E clico em Esqueceu a senha
    E insiro meu CPF de corretor "<CPF>"
    E insiro meu E-mail para recuperar senha com "<Email>"
    E clico em Enviar
    Então vejo as instruções para recuperar a senha "<Instrucoes>"

    Exemplos:
      | CPF            | Email                      | Instrucoes                                                               |
      | 056.957.720-95 | user_mock_1@mailinator.com | Acesse o e-mail enviado para o endereço cadastrado e siga as instruções. |

  Esquema do Cenario: [3087] Login | Administrador | Acessar aplicação CMS
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então clico em Aplicações
    E clico na aplicação CMS
    E verifico que a URL é aberta "frontcms.lpsbr.com"

    Exemplos:
      | CPF            | Senha    |
      | 646.286.340-41 | lopes123 |

  Esquema do Cenario: [3087] Login | Governance | Acessar aplicação CMS
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então clico em Aplicações
    E clico na aplicação CMS
    E verifico que a URL é aberta "frontcms.lpsbr.com"

    Exemplos:
      | CPF            | Senha    |
      | 435.576.040-55 | lopes123 |

#  Esquema do Cenario: [3087] Login | Marketing | Acessar aplicação CMS
#    Dado clico em Minha conta
#    Quando clico em Corretor
#    E insiro meu CPF de corretor "<CPF>"
#    E insiro minha Senha de corretor "<Senha>"
#    E clico em Entrar
#    Então clico em Aplicações
#    E clico na aplicação CMS
#    E verifico que a URL é aberta "frontcms.lpsbr.com"
#
#    Exemplos:
#      | CPF            | Senha    |
#      | 009.282.600-89 | lopes123 |

  Esquema do Cenario: [3087] Login | Lopes | Acessar aplicação CMS
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então clico em Aplicações
    E clico na aplicação CMS
    E verifico que a URL é aberta "frontcms.lpsbr.com"

    Exemplos:
      | CPF            | Senha    |
      | 682.412.360-93 | lopes123 |

  Esquema do Cenario: [3087] Login | Agente | Acessar aplicação CRM
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então clico em Aplicações do Agente
    E vejo a aplicação "CRM"
    E verifico que a URL é aberta "frontcrm.lpsbr.com"

    Exemplos:
      | CPF            | Senha    |
      | 620.503.330-56 | lopes123 |
      | 056.957.720-95 | lopes123 |