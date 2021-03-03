#language: pt

#@REGRESSAO
@SiteCorretor
@CompartilharCorretor

Funcionalidade: [3105] Site do Corretor | Compartilhar perfil

  Contexto:
    Dado acesso o Portal da Lopes

  Cenario: [3105] Site do Corretor | Perfil Corretor | Visualizar link Cartão de visita
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    Então visualizo o link Cartão de visita

  Cenario: [3105] Site do Corretor | Perfil Corretor | Acessar com CRECI válido
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no link Cartão de Visita
    Então vejo o link de Compartilhar meu perfil

#  Cenario: [3105] Site do Corretor | Perfil Corretor | Acessar com CRECI Estagiário
#    Dado clico em Minha conta
#    E clico em Corretor
#    E insiro meu CPF de corretor "44167715848"
#    E insiro minha Senha de corretor "4416lopes"
#    E clico em Entrar
#    Quando acesso o Site do Corretor "PEDRO.BROOKLIN"
#    E clico no link Cartão de Visita
#    Então vejo o link de Compartilhar meu perfil

  Cenario: [3105] Site do Corretor | Perfil Corretor | Acessar com CRECI Vencido
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "14014488608"
    E insiro minha Senha de corretor "1401lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "ALURA"
    E clico no link Cartão de Visita
    Então vejo o texto "Não será possível compartilhar o cartão, pois o CRECI está inválido."

  Cenario: [3105] Site do Corretor | Perfil Corretor | Acessar com Matrícula TTI
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "31199977810"
    E insiro minha Senha de corretor "3119lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maverick.One"
    E clico no link Cartão de Visita
    Então vejo o texto "Não será possível compartilhar o cartão, pois o CRECI está inválido."

  Cenario: [3105] Site do Corretor | Perfil Corretor | Compartilhar para Whatsapp
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no link Cartão de Visita
    E clico em Compartilhar meu perfil
    E seleciono WhatsApp
    Então o Whatsapp é aberto enviando o parâmetro do corretor "Maria.Luiza"

  Cenario: [3105] Site do Corretor | Perfil Corretor | Compartilhar para Facebook
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no link Cartão de Visita
    E clico em Compartilhar meu perfil
    E seleciono Facebook
    Então o Facebook é aberto enviando o parâmetro do corretor "Maria.Luiza"

  Cenario: [3105] Site do Corretor | Perfil Corretor | Compartilhar para Linkedin
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no link Cartão de Visita
    E clico em Compartilhar meu perfil
    E seleciono Linkedin
    Então o Linkedin é aberto enviando o parâmetro do corretor "Maria.Luiza"

  Cenario: [3105] Site do Corretor | Perfil Corretor | Clicar em URL
    Dado clico em Minha conta
    E clico em Corretor
    E insiro meu CPF de corretor "26317760896"
    E insiro minha Senha de corretor "2631lopes"
    E clico em Entrar
    Quando acesso o Site do Corretor "Maria.Luiza"
    E clico no link Cartão de Visita
    E clico na URL
    Então é aberto do site do corretor com o parâmetro "/associado/Maria.Luiza"