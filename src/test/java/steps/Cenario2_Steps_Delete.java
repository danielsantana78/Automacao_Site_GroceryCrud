package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Cenario1_Paginas_Add_Customer;

public class Cenario2_Steps_Delete {

	private Cenario1_Paginas_Add_Customer form = new Cenario1_Paginas_Add_Customer();

	@When("^opto por clicar no link Go back to list$")
	public void optoPorClicarNoLinkGoBackToList() throws Throwable {
		form.optoPorClicarNoLinkGoBackToList();
	}

	@When("^opto por clicar na coluna Search Name e digitar o conteúdo do Name Teste Sicredi$")
	public void optoPorClicarNaColunaSearchNameEDigitarOConteúdoDoNameTesteSicredi() throws Throwable {
		form.optoPorClicarNaColunaSearchNameEDigitarNoCampoNameTesteSicredi();
	}

	@When("^opto por clicar no checkbox abaixo da palavra Actions$")
	public void optoPorClicarNoCheckboxAbaixoDaPalavraActions() throws Throwable {
		form.optoPorClicarNoCheckboxAbaixoDaPalavraActions();
	}

	@When("^opto por clicar no botão Delete$")
	public void optoPorClicarNoBotãoDelete() throws Throwable {
		form.optoPorClicarNoBotaoDelete();
	}

	@When("^valido o Texto$")
	public void validoOTexto() throws Throwable {
		form.validoTexto();
	}

	@When("^opto por clicar no botão Delete da popup$")
	public void optoPorClicarNoBotãoDeleteDaPopup() throws Throwable {
		form.optoPorClicarNoBotaoDeleteDaPopup();
	}

	@Then("^valido a mensagem \"([^\"]*)\"$")
	public void validoAMensagem(String mensagem) throws Throwable {
		form.validoAMensagem(mensagem);
	}
}
