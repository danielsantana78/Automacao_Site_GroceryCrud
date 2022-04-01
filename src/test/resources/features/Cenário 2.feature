Feature: Preencher os campos do formulário voltar pra lista e deletar o Teste Sicredi

Background:
  Given que eu acesso o site  grocerycrud
  
  @Cenario2 @Os2Cenarios
  Scenario Outline: Preencher os campos do formulário, Clicar no botão Save, voltar pra lista e excluir o nome inserido
    When opto por mudar o valor da combo para <Select version>
    And clico no botão Add Customer
    And opto por preencher todos os campos do formulário
    And Clicar no botão Save
    And opto por clicar no link Go back to list
    And opto por clicar na coluna Search Name e digitar o conteúdo do Name Teste Sicredi
    And opto por clicar no checkbox abaixo da palavra Actions
    And opto por clicar no botão Delete
    And valido o Texto
    And opto por clicar no botão Delete da popup
    Then valido a mensagem "Your data has been successfully deleted from the database."
    
   Examples: 
    |Select version     |
    |Bootstrap V4 Theme	|