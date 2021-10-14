#language: pt

@devMedia
Funcionalidade: Login

  @act01
  Cenário: Validar exibição o modal de login
    Dado que o usuário esteja no sistema devMedia
    Quando clicar na opção de login
    Entao o sistema exibe o modal de login com os campos Usuário e Senhas

  @act02
  Cenario: Validar login quando informar dados inválidos
    Dado que o usuário esteja no sistema devMedia
    Quando clicar na opção de login
    E informar dados inválidos
    E clicar na opção de Entrar
    Entao o sistema direciona o usuário para a tela de cadastro com a mensagem de login e senha inválidos

@act03
Cenario: Validar login quando informar dados inexistentes
  Dado que o usuário esteja no sistema devMedia
  Quando clicar na opção de login
  E informar dados inexistentes
  E clicar na opção de Entrar
  Entao o sistema direciona o usuário para a tela de cadastro com a mensagem de login e senha inválidos

@act04
Cenario: Validar funcionalidade da opção Esqueceu o login ou a senha?
  Dado que o usuário esteja no sistema devMedia
  Quando clicar na opção de login
  E clicar na opção Esqueceu o login ou a senha?
  Entao o sistema direciona o usuário para a tela de Esqueci minha senha

@act05
Cenario: Validar funcionalidade da opção Cadastre-se
  Dado que o usuário esteja no sistema devMedia
  Quando clicar na opção de login
  E clicar na opção Cadastre-se
  Entao o sistema direciona o usuário para a tela de Cadastre-se

@act06
Cenario:  Validar login com sucesso
  Dado que o usuário esteja no sistema devMedia
  Quando clicar na opção de login
  E informar dados existentes
  E clicar na opção de Entrar
  Entao o sistema direciona o usuário para a tela de Bem Vindo

