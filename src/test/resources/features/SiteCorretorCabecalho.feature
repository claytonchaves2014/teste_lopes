#language: pt
@REGRESSAO
@SiteCorretor

Funcionalidade: [2641] Site do Corretor | Validar o cabeçalho

  Contexto:
    Dado acesso o Portal da Lopes

  Cenário: [2641] Site do Corretor | Cabeçalho | Validar o layout
    Dado acesso o Site do Corretor "VASTHI"
    Quando verifico o cabeçalho do Site do Corretor
    Então vejo a Foto do Corretor no cabeçalho
    E vejo o Apelido do Corretor  como "VASTHI" no cabeçalho
    E vejo o Nome completo do Corretor como "Vasthi Rodrigues Pereira De Souza" no cabeçalho
    E vejo o Título do Corretor como "Corretor on-line" no cabeçalho
    E vejo o CRECI do Corretor como "70911-F" no cabeçalho
    E vejo a descrição do Corretor como "Olá, seja bem vindo ao meu perfil! Meu nome é Vasthi Rodrigues Pereira De Souza, tenho 62 anos e sou um(a) Corretor on-line(a)." no cabeçalho
    E vejo o botão Entrar em contato no cabeçalho
    E vejo o botão Whatsapp no cabeçalho

  Esquema do Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Clicar em Entrar em contato
    Dado acesso o Site do Corretor "<Corretor>"
    E verifico o cabeçalho do Site do Corretor
    Quando clico em Entrar em contato
    E insiro meu Nome como "<Nome>"
    E insiro meu E-mail como "<Email>"
    E insiro meu Telefone como "<Telefone>"
    E clico no dropdown de formas de contato
    E seleciono minha forma de contato como "<Forma de Contato>"
    E clico no botão Enviar
    Então vejo a mensagem de lead enviado "<Mensagem>"

    Exemplos:
    | Corretor | Nome         | Email                  | Telefone        | Forma de Contato | Mensagem                                                               |
    | VASTHI   | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Telefone         | Aguarde a confirmação com um consultor.                                |
    | VASTHI   | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Email            | Aguarde a confirmação com um consultor.                                |
    | VASTHI   | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Whatsapp         | Aguarde o carregamento da página para conversar com nossos corretores. |

  Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Validar campos em Entrar em contato
    Dado acesso o Site do Corretor "VASTHI"
    E verifico o cabeçalho do Site do Corretor
    Quando clico em Entrar em contato
    E deixo meu Nome em branco
    E deixo meu Email em branco
    E deixo meu Telefone em branco
    E deixo a Forma de Contato em branco
    Então vejo a mensagem de validação "Nome é obrigatório!" no campo Nome
    E vejo a mensagem de validação "E-mail é obrigatório!" no campo Email
    E vejo a mensagem de validação "Telefone é obrigatório!" no campo Telefone
    E vejo a mensagem de validação "Forma de contato é obrigatório!" no campo Forma de Contato

  Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Validar Telefone inválido em Entrar em contato
    Dado acesso o Site do Corretor "VASTHI"
    E verifico o cabeçalho do Site do Corretor
    Quando clico em Entrar em contato
    E insiro meu Telefone como "(00) 00000-0000"
    Então vejo a mensagem de validação "Esse telefone é inválido!" no campo Telefone

  Esquema do Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Clicar em Whatsapp
    Dado acesso o Site do Corretor "<Corretor>"
    E verifico o cabeçalho do Site do Corretor
    Quando clico em Whatsapp
    E insiro meu Nome como "<Nome>"
    E insiro meu E-mail como "<Email>"
    E insiro meu Telefone como "<Telefone>"
    E clico no botão Enviar
    Então vejo a mensagem de lead enviado "<Mensagem>"

    Exemplos:
      | Corretor | Nome         | Email                  | Telefone        | Mensagem                                                               |
      | VASTHI   | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Aguarde o carregamento da página para conversar com nossos corretores. |
