$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Cenário 1.feature");
formatter.feature({
  "line": 1,
  "name": "Preencher os campos do formulário com as seguintes informações",
  "description": "",
  "id": "preencher-os-campos-do-formulário-com-as-seguintes-informações",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Preencher os campos do formulário, Clicar no botão Save, Validar a mensagem e Fechar o browser",
  "description": "",
  "id": "preencher-os-campos-do-formulário-com-as-seguintes-informações;preencher-os-campos-do-formulário,-clicar-no-botão-save,-validar-a-mensagem-e-fechar-o-browser",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Cenario1"
    },
    {
      "line": 6,
      "name": "@Os2Cenarios"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "opto por mudar o valor da combo para \u003cSelect version\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clico no botão Add Customer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "opto por preencher todos os campos do formulário",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicar no botão Save",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Validar a \"Mensagem\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "preencher-os-campos-do-formulário-com-as-seguintes-informações;preencher-os-campos-do-formulário,-clicar-no-botão-save,-validar-a-mensagem-e-fechar-o-browser;",
  "rows": [
    {
      "cells": [
        "Select version"
      ],
      "line": 15,
      "id": "preencher-os-campos-do-formulário-com-as-seguintes-informações;preencher-os-campos-do-formulário,-clicar-no-botão-save,-validar-a-mensagem-e-fechar-o-browser;;1"
    },
    {
      "cells": [
        "Bootstrap V4 Theme"
      ],
      "line": 16,
      "id": "preencher-os-campos-do-formulário-com-as-seguintes-informações;preencher-os-campos-do-formulário,-clicar-no-botão-save,-validar-a-mensagem-e-fechar-o-browser;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "que eu acesso o site  grocerycrud",
  "keyword": "Given "
});
formatter.match({
  "location": "Cenario1_Steps_Customers.queEuAcessoOSiteGrocerycrud()"
});
formatter.result({
  "duration": 3373634600,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Preencher os campos do formulário, Clicar no botão Save, Validar a mensagem e Fechar o browser",
  "description": "",
  "id": "preencher-os-campos-do-formulário-com-as-seguintes-informações;preencher-os-campos-do-formulário,-clicar-no-botão-save,-validar-a-mensagem-e-fechar-o-browser;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Os2Cenarios"
    },
    {
      "line": 6,
      "name": "@Cenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "opto por mudar o valor da combo para Bootstrap V4 Theme",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clico no botão Add Customer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "opto por preencher todos os campos do formulário",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicar no botão Save",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Validar a \"Mensagem\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 48
    }
  ],
  "location": "Cenario1_Steps_Customers.optoPorMudarOValorDaComboParaBootstrapVTheme(int)"
});
formatter.result({
  "duration": 2455008900,
  "status": "passed"
});
formatter.match({
  "location": "Cenario1_Steps_Customers.clicoNoBotãoAddCustomer()"
});
formatter.result({
  "duration": 1747560300,
  "status": "passed"
});
formatter.match({
  "location": "Cenario1_Steps_Add_Customer.optoPorPreencherTodosOsCamposDoFormulário()"
});
formatter.result({
  "duration": 1216853200,
  "status": "passed"
});
formatter.match({
  "location": "Cenario1_Steps_Add_Customer.clicarNoBotãoSave()"
});
formatter.result({
  "duration": 103187700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mensagem",
      "offset": 11
    }
  ],
  "location": "Cenario1_Steps_Add_Customer.validarA(String)"
});
formatter.result({
  "duration": 3060031100,
  "status": "passed"
});
formatter.uri("Cenário 2.feature");
formatter.feature({
  "line": 1,
  "name": "Preencher os campos do formulário voltar pra lista e deletar o Teste Sicredi",
  "description": "",
  "id": "preencher-os-campos-do-formulário-voltar-pra-lista-e-deletar-o-teste-sicredi",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Preencher os campos do formulário, Clicar no botão Save, voltar pra lista e excluir o nome inserido",
  "description": "",
  "id": "preencher-os-campos-do-formulário-voltar-pra-lista-e-deletar-o-teste-sicredi;preencher-os-campos-do-formulário,-clicar-no-botão-save,-voltar-pra-lista-e-excluir-o-nome-inserido",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Cenario2"
    },
    {
      "line": 6,
      "name": "@Os2Cenarios"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "opto por mudar o valor da combo para \u003cSelect version\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clico no botão Add Customer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "opto por preencher todos os campos do formulário",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicar no botão Save",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "opto por clicar no link Go back to list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "opto por clicar na coluna Search Name e digitar o conteúdo do Name Teste Sicredi",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "opto por clicar no checkbox abaixo da palavra Actions",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "opto por clicar no botão Delete",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "valido o Texto",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "opto por clicar no botão Delete da popup",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "valido a mensagem \"Your data has been successfully deleted from the database.\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "preencher-os-campos-do-formulário-voltar-pra-lista-e-deletar-o-teste-sicredi;preencher-os-campos-do-formulário,-clicar-no-botão-save,-voltar-pra-lista-e-excluir-o-nome-inserido;",
  "rows": [
    {
      "cells": [
        "Select version"
      ],
      "line": 21,
      "id": "preencher-os-campos-do-formulário-voltar-pra-lista-e-deletar-o-teste-sicredi;preencher-os-campos-do-formulário,-clicar-no-botão-save,-voltar-pra-lista-e-excluir-o-nome-inserido;;1"
    },
    {
      "cells": [
        "Bootstrap V4 Theme"
      ],
      "line": 22,
      "id": "preencher-os-campos-do-formulário-voltar-pra-lista-e-deletar-o-teste-sicredi;preencher-os-campos-do-formulário,-clicar-no-botão-save,-voltar-pra-lista-e-excluir-o-nome-inserido;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "que eu acesso o site  grocerycrud",
  "keyword": "Given "
});
formatter.match({
  "location": "Cenario1_Steps_Customers.queEuAcessoOSiteGrocerycrud()"
});
formatter.result({
  "duration": 1220208300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Preencher os campos do formulário, Clicar no botão Save, voltar pra lista e excluir o nome inserido",
  "description": "",
  "id": "preencher-os-campos-do-formulário-voltar-pra-lista-e-deletar-o-teste-sicredi;preencher-os-campos-do-formulário,-clicar-no-botão-save,-voltar-pra-lista-e-excluir-o-nome-inserido;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Os2Cenarios"
    },
    {
      "line": 6,
      "name": "@Cenario2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "opto por mudar o valor da combo para Bootstrap V4 Theme",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "clico no botão Add Customer",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "opto por preencher todos os campos do formulário",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicar no botão Save",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "opto por clicar no link Go back to list",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "opto por clicar na coluna Search Name e digitar o conteúdo do Name Teste Sicredi",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "opto por clicar no checkbox abaixo da palavra Actions",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "opto por clicar no botão Delete",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "valido o Texto",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "opto por clicar no botão Delete da popup",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "valido a mensagem \"Your data has been successfully deleted from the database.\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 48
    }
  ],
  "location": "Cenario1_Steps_Customers.optoPorMudarOValorDaComboParaBootstrapVTheme(int)"
});
formatter.result({
  "duration": 1201929400,
  "status": "passed"
});
formatter.match({
  "location": "Cenario1_Steps_Customers.clicoNoBotãoAddCustomer()"
});
formatter.result({
  "duration": 1254553300,
  "status": "passed"
});
formatter.match({
  "location": "Cenario1_Steps_Add_Customer.optoPorPreencherTodosOsCamposDoFormulário()"
});
formatter.result({
  "duration": 961410100,
  "status": "passed"
});
formatter.match({
  "location": "Cenario1_Steps_Add_Customer.clicarNoBotãoSave()"
});
formatter.result({
  "duration": 51118500,
  "status": "passed"
});
formatter.match({
  "location": "Cenario2_Steps_Delete.optoPorClicarNoLinkGoBackToList()"
});
formatter.result({
  "duration": 4316388500,
  "status": "passed"
});
formatter.match({
  "location": "Cenario2_Steps_Delete.optoPorClicarNaColunaSearchNameEDigitarOConteúdoDoNameTesteSicredi()"
});
formatter.result({
  "duration": 73518000,
  "status": "passed"
});
formatter.match({
  "location": "Cenario2_Steps_Delete.optoPorClicarNoCheckboxAbaixoDaPalavraActions()"
});
formatter.result({
  "duration": 3098700100,
  "status": "passed"
});
formatter.match({
  "location": "Cenario2_Steps_Delete.optoPorClicarNoBotãoDelete()"
});
formatter.result({
  "duration": 1187427700,
  "status": "passed"
});
formatter.match({
  "location": "Cenario2_Steps_Delete.validoOTexto()"
});
formatter.result({
  "duration": 45645100,
  "status": "passed"
});
formatter.match({
  "location": "Cenario2_Steps_Delete.optoPorClicarNoBotãoDeleteDaPopup()"
});
formatter.result({
  "duration": 7638614400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your data has been successfully deleted from the database.",
      "offset": 19
    }
  ],
  "location": "Cenario2_Steps_Delete.validoAMensagem(String)"
});
formatter.result({
  "duration": 13066185900,
  "status": "passed"
});
});