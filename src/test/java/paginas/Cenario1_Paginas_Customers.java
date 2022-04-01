package paginas;

import core.BaseSelenium;
import elementos.Cenario1_Elementos_Customers;

public class Cenario1_Paginas_Customers extends BaseSelenium {

	private Cenario1_Elementos_Customers eleCustomers = new Cenario1_Elementos_Customers();

	public void mudarOValorDaComboBootstrapVTheme(int bootstrapV4Theme) {
		mudaValorComboSelectVersionParaBootstrapV4Theme(bootstrapV4Theme);
	}

	// métodos dos preenchimentos dos campos

	private void mudaValorComboSelectVersionParaBootstrapV4Theme(int bootstrapV4Theme) {
		System.out.println("aguarda o elemento aparecer na tela");
		esperarElementoExistir(eleCustomers.getSlcWitchVersion());
		System.out.println("muda o valor da combo Select version para Bootstrap V4 Theme");
		comboBoxPorTexto(eleCustomers.getSlcWitchVersion(), "Bootstrap V4 Theme");
	}

	public void clicoNoBotãoAddCustomer() {
		System.out.println("aguarda o elemento do botão Add Customer aparecer na tela");
		esperarElementoExistir(eleCustomers.getBtnAddCustumer());
		moverParaElementoeClicar(eleCustomers.getBtnAddCustumer());
		System.out.println("clica no botão Add Customer");
	}
}
