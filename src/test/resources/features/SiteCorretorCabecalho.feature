#language: pt
#@REGRESSAO
@SiteCorretor
@CabecalhoCorretor

Funcionalidade: [2641] Site do Corretor | Validar o cabeçalho

  Contexto:
    Dado acesso o Portal da Lopes
    Quando clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Então acesso o Site do Corretor "Maria.Luiza"

  Cenário: [2641] Site do Corretor | Cabeçalho | Validar o layout
    Quando verifico o cabeçalho do Site do Corretor
    Então vejo a Foto do Corretor no cabeçalho
    E vejo o Apelido do Corretor  como "Maria.Luiza" no cabeçalho
    E vejo o Nome completo do Corretor como "Maria Luiza Russo Nobrega de Freitas" no cabeçalho
    E vejo o Título do Corretor como "Corretor" no cabeçalho
    E vejo o CRECI do Corretor como "42633-F" no cabeçalho
    E vejo a biografia do Corretor no cabeçalho
    E vejo o botão Entrar em contato no cabeçalho
    E vejo o botão Whatsapp no cabeçalho

  Esquema do Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Clicar em Entrar em contato
    Dado verifico o cabeçalho do Site do Corretor
    Quando clico em Entrar em contato
    E insiro meu Nome como "<Nome>"
    E insiro meu E-mail como "<Email>"
    E insiro meu Telefone como "<Telefone>"
    E clico no dropdown de formas de contato
    E seleciono minha forma de contato como "<Forma de Contato>"
    E clico no botão Enviar
    Então vejo a mensagem de lead enviado "<Mensagem>"

    Exemplos:
    | Nome         | Email                  | Telefone        | Forma de Contato | Mensagem                                                               |
    | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Telefone         | Aguarde a confirmação com um consultor.                                |
    | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Email            | Aguarde a confirmação com um consultor.                                |
    | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Whatsapp         | Aguarde o carregamento da página para conversar com nossos corretores. |

  Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Validar campos em Entrar em contato
    Dado verifico o cabeçalho do Site do Corretor
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
    Dado verifico o cabeçalho do Site do Corretor
    Quando clico em Entrar em contato
    E insiro meu Telefone como "(00) 00000-0000"
    Então vejo a mensagem de validação "Esse telefone é inválido!" no campo Telefone

  Esquema do Cenário: Cenário: [2641] Site do Corretor | Cabeçalho | Clicar em Whatsapp
    Dado verifico o cabeçalho do Site do Corretor
    Quando clico em Whatsapp
    E insiro meu Nome como "<Nome>"
    E insiro meu E-mail como "<Email>"
    E insiro meu Telefone como "<Telefone>"
    E clico no botão Enviar
    Então vejo a mensagem de lead enviado "<Mensagem>"

    Exemplos:
      | Nome         | Email                  | Telefone        | Mensagem                                                               |
      | QA Automação | qa.automacao@teste.com | (69) 99398-6429 | Aguarde o carregamento da página para conversar com nossos corretores. |
