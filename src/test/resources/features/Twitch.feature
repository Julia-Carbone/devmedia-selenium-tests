#language: pt

@Twitch

Funcionalidade: Cadastro

  @act01
  Cenario: Exibir informações na Tela de Login
  Dado que o usuário esteja no sistema Twitch
  Quando clicar no botão “Cadastrar-se”
  Entao o sistema exibe o ícone da Twitch
  E exibe o título “Junte-se hoje à Twitch”
  E exibe o link “Entrar”
  E exibe o link “Cadastrar-se”
  E exibe o campo: “Usuário”
  E exibe o campo: “Senha”
  E exibe o campo: “Confirmação de senha”
  E exibe os campos: de “Data de nascimento” com “Dia”, campo de seleção ”Mês” e “Ano”
  E exibe os campos de “Número de telefone” com seleção de DDD e telefone
  E exibe o link “Em vez disso, use o email”
  E exibe a mensagem
  E exibe o botão “Cadastrar-se”

