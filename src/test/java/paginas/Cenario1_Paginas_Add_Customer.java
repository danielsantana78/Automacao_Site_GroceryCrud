package paginas;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import core.BaseSelenium;
import elementos.Cenario1_Elementos_Add_Customer;

public class Cenario1_Paginas_Add_Customer extends BaseSelenium {

	private Cenario1_Elementos_Add_Customer eleCustomers = new Cenario1_Elementos_Add_Customer();

	public void ePreenchoTodosOsCampos() {

		preencheCampoName();

		esperarElementoExistir(eleCustomers.getCmpcontactLastName());
		escreveNoCampo(eleCustomers.getCmpcontactLastName(), "Sant'Ana Oliveira");
		System.out.println("escreveu Teste no campo Last Name");

		esperarElementoExistir(eleCustomers.getCmpcontactFirstName());
		escreveNoCampo(eleCustomers.getCmpcontactFirstName(), "Daniel");
		System.out.println("escreveu meu nome no campo ContactFirstName");

		esperarElementoExistir(eleCustomers.getCmpphone());
		escreveNoCampo(eleCustomers.getCmpphone(), "11 9999-9999");
		System.out.println("escreveu 51 9999-9999 no campo Phone");

		esperarElementoExistir(eleCustomers.getCmpAddressLine1());
		escreveNoCampo(eleCustomers.getCmpAddressLine1(), "Rua Jarama, 101");
		System.out.println("escreveu Rua Jarama, 101 no campo AddressLine1");

		esperarElementoExistir(eleCustomers.getCmpAddressLine2());
		escreveNoCampo(eleCustomers.getCmpAddressLine2(), "Jardim São João");
		System.out.println("escreveu Jardim São João no campo AddressLine2");

		esperarElementoExistir(eleCustomers.getCmpCity());
		escreveNoCampo(eleCustomers.getCmpCity(), "Jandira");
		System.out.println("escreveu Jandira no campo City");

		esperarElementoExistir(eleCustomers.getCmpState());
		escreveNoCampo(eleCustomers.getCmpState(), "SP");
		System.out.println("escreveu SP no campo State");

		esperarElementoExistir(eleCustomers.getCmpPostalCode());
		escreveNoCampo(eleCustomers.getCmpPostalCode(), "06634-020");
		System.out.println("escreveu 06634-020 no campo PostalCode");

		esperarElementoExistir(eleCustomers.getCmpCountry());
		escreveNoCampo(eleCustomers.getCmpCountry(), "Brasil");
		System.out.println("escreveu Brasil no campo Country");

		esperarElementoExistir(eleCustomers.getSlcFromEmployeer());
		clicar(eleCustomers.getSlcFromEmployeer());
		esperarElementoExistir(eleCustomers.getCmpFromEmployeer());
		escreveNoCampo(eleCustomers.getCmpFromEmployeer(), "Fixter");
		esperarElementoExistir(eleCustomers.getCmpResultFixter());
		clicar(eleCustomers.getCmpResultFixter());
		System.out.println("escolheu Fixer no combo from Employeer");

		esperarElementoExistir(eleCustomers.getCmpCreditLimit());
		escreveNoCampo(eleCustomers.getCmpCreditLimit(), "200");
		System.out.println("escreveu 200 no campo CreditLimit");

		esperarElementoExistir(eleCustomers.getCmpDeleted());
		escreveNoCampo(eleCustomers.getCmpDeleted(), "Campo Novo");
		System.out.println("escreveu no campo Deleted");
	}

	public void clicarNoBotaoSave() {
		esperarElementoExistir(eleCustomers.getBtnSave());
		clicar(eleCustomers.getBtnSave());
		System.out.println("clicou no botão Save");
	}

	public void validarAMensagem(String mensagem) {
		esperarPadrao(3);
		esperarElementoExistir(eleCustomers.getLblMsg());
		pegaMensagemDeSucesso(eleCustomers.getLblMsg(), mensagem);
		System.out.println(
				"Validou a mensagem Your data has been successfully stored into the database. Edit Customer or Go back to list");
	}

	public void pegaMensagemDeSucesso(By elemento, String mensagem) {
		String msg = getDriver().findElement(elemento).getText();
		assertEquals(msg, "Your data has been successfully stored into the database. Edit Customer or Go back to list");
	}

	////////// Métodos Cenário 2 /////////

	public void optoPorClicarNoLinkGoBackToList() {
		esperarPadrao(3);
		esperarElementoExistir(eleCustomers.getLnkGoBackToList());
		moverParaElementoeClicar(eleCustomers.getLnkGoBackToList());
		System.out.println("clicou no link Go back to list");
	}

	public void optoPorClicarNaColunaSearchNameEDigitarNoCampoNameTesteSicredi() {
		preencheCampoName();
	}

	public void optoPorClicarNoCheckboxAbaixoDaPalavraActions() {
		System.out.println("clica no checkbox abaixo da palavra Actions");
		esperarElementoExistir(eleCustomers.getChckSelectAllNone());
		esperarPadrao(3);
		clicar(eleCustomers.getChckSelectOne());
	}

	public void optoPorClicarNoBotaoDelete() {
		System.out.println("aguarda o elemento aparecer na tela");
		esperarElementoExistir(eleCustomers.getBtnDelete());
		moverParaElementoeClicar(eleCustomers.getBtnDelete());
		esperarPadrao(1);
	}

	public void validoTexto() {
		System.out.println("aguarda o elemento getBtnDelete aparecer na tela");
		esperarElementoExistir(eleCustomers.getBtnDelete());
		pegaMensagemDelete(eleCustomers.getAlertDelete(), "pegaMensagemDelete");
		System.out.println("Valida o texto Are you sure that you want to delete this 1 item?");
	}

	public void optoPorClicarNoBotaoDeleteDaPopup() {

		System.out.println("aguarda o elemento getBtnDeletePopUP aparecer na tela");
		esperarElementoExistir(eleCustomers.getBtnDeletePopUP());
		esperarPadrao(3);
		moverParaElementoeClicar(eleCustomers.getBtnCancelPopUP());
		optoPorClicarNoCheckboxAbaixoDaPalavraActions();
		optoPorClicarNoBotaoDelete();
		moverParaElementoeClicar(eleCustomers.getBtnDeletePopUP());
	}
	
	public void validoAMensagem(String mensagem) {
		System.out.println("aguarda o elemento DeleteFromTheDatabase aparecer na tela");
		esperarPadrao(3);
		esperarElementoExistir(eleCustomers.getMsgDeleteFromTheDatabase());
		pegaMensagemDeletedFromTheDatabase(eleCustomers.getMsgDeleteFromTheDatabase(), mensagem);
		System.out.println("valida o texto Your data has been successfully deleted from the database.");
		//comparaString(eleCustomers.getMsgDeleteFromTheDatabase(), "Your data has been successfully deleted from the database.");
		esperarPadrao(10);
	}

	/// Métodos preenchimento dos campos

	private void preencheCampoName() {
		System.out.println("aguarda o elemento aparecer na tela");
		esperarElementoExistir(eleCustomers.getCmpcustomerName());
		escreveNoCampo(eleCustomers.getCmpcustomerName(), "Daniel");
		System.out.println("escreveu Teste Sicredi no campo Name");
	}

	/// Método de validação de mensagem

	private void pegaMensagemDelete(By elemento, String Alerta) {
		String msg = getDriver().findElement(elemento).getText();
		assertEquals(msg, "Are you sure that you want to delete this 1 item?");
	}
	
	private void pegaMensagemDeletedFromTheDatabase(By elemento, String mensagem) {
		String msg = getDriver().findElement(elemento).getText();
		assertEquals(msg, mensagem);
	}
}
