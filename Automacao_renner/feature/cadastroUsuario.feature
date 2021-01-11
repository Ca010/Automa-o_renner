#language: pt

  Funcionalidade: realizar o cadastro de usuario no site renner

  Cenario:cadastrar por email
    Dado que eu acesse o site da renner
    Quando clico no botao entre ou cadastre-se
    E clico em cadastre-se
    E preencho email como "<email>"
    E preencho cpf como "<cpf>"
    E preencho nome como "<nome>"
    E preencho sobrenome como "<sobrenome>"
    E preencho dataDeNasc como "<dataDeNasc>"
    E clico no botao prefiro nao comentar
    E preencho senha como "<senha>"
    E preencho telefone como "<telefone>"
    E clico no botao li e aceito a politica
    E clico no botao não sou um robo
    E clico no botao cadastrar
    Entao validar mensagem Olá,

  Exemplos:
    | email                   | cpf             | nome  | sobrenome | dataDeNasc  | senha  | telefone    |
    | fabio.pereira@gmail.com | 108.216.654-56  | Fabio | Pereira   | 14/12/1985  | 123456 |  1123568956 |