#language: pt
@REGRESSAO @Login

Funcionalidade: Login | Validar o login de Cliente
  Contexto:
    Dado acesso o Portal da Lopes
    E clico em Aceitar Cookies

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

  Esquema do Cenário: [QA-83] Login | Corretor | Acesso inválido
    Dado clico em Minha conta
    Quando clico em Corretor
    E insiro meu CPF de corretor "<CPF>"
    E insiro minha Senha de corretor "<Senha>"
    E clico em Entrar
    Então vejo a mensagem de login inválido "<Mensagem>"

    Exemplos:
      | CPF            | Senha     | Mensagem                       |
      | 084.069.078-94 | Teste1234 | Usuário e/ou senha incorretos. |

  Esquema do Cenário: [QA-85] Login | Corretor | Esqueceu a Senha
    Dado clico em Minha conta
    Quando clico em Corretor
    E clico em Esqueceu a senha
    E insiro meu CPF de corretor "<CPF>"
    E insiro meu E-mail para recuperar senha com "<Email>"
    E clico em Enviar
    Então vejo as instruções para recuperar a senha "<Instrucoes>"

    Exemplos:
      | CPF            | Email               | Instrucoes                                                               |
      | 084.069.078-94 | boni@mailinator.com | Acesse o e-mail enviado para o endereço cadastrado e siga as instruções. |