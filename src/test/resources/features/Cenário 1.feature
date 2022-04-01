Feature: Preencher os campos do formulário com as seguintes informações

Background:
  Given que eu acesso o site  grocerycrud

  @Cenario1 @Os2Cenarios
  Scenario Outline: Preencher os campos do formulário, Clicar no botão Save, Validar a mensagem e Fechar o browser
    When opto por mudar o valor da combo para <Select version>
    And clico no botão Add Customer
	  And opto por preencher todos os campos do formulário
	  And Clicar no botão Save
	  Then Validar a "Mensagem"

    Examples: 
    |Select version     |
    |Bootstrap V4 Theme	|
    