package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Cenario1_Paginas_Add_Customer;

public class Cenario1_Steps_Add_Customer {

	private Cenario1_Paginas_Add_Customer form = new Cenario1_Paginas_Add_Customer();

	@When("^opto por preencher todos os campos do formulário$")
	public void optoPorPreencherTodosOsCamposDoFormulário() throws Throwable {
		form.ePreenchoTodosOsCampos();
	}

	@When("^Clicar no botão Save$")
	public void clicarNoBotãoSave() throws Throwable {
		form.clicarNoBotaoSave();
	}

	@Then("^Validar a \"([^\"]*)\"$")
	public void validarA(String mensagem) throws Throwable {
		form.validarAMensagem(mensagem);
	}
}
