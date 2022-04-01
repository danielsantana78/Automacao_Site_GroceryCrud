package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import paginas.Cenario1_Paginas_Customers;

public class Cenario1_Steps_Customers {

	private Cenario1_Paginas_Customers form = new Cenario1_Paginas_Customers();
	
	////Desafio1
	

	@Given("^que eu acesso o site  grocerycrud$")
	public void queEuAcessoOSiteGrocerycrud() throws Throwable {
		form.navegarParaUrl();
	}

	@When("^opto por mudar o valor da combo para Bootstrap V(\\d+) Theme$")
	public void optoPorMudarOValorDaComboParaBootstrapVTheme(int BootstrapV4Theme) throws Throwable {
		form.mudarOValorDaComboBootstrapVTheme(BootstrapV4Theme);
	}

	@When("^clico no botão Add Customer$")
	public void clicoNoBotãoAddCustomer() throws Throwable {
		form.clicoNoBotãoAddCustomer();
	}	
}
