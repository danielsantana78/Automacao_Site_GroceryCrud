package elementos;

import org.openqa.selenium.By;

public class Cenario1_Elementos_Add_Customer {

	private By cmpcustomerName = By.xpath("//input[contains(@name,'customerName')]");
	private By cmpcontactLastName = By.xpath("//input[contains(@name,'contactLastName')]");
	private By cmpcontactFirstName = By.xpath("//input[contains(@name,'contactFirstName')]");
	private By cmpphone = By.xpath("//input[contains(@name,'phone')]");
	private By cmpAddressLine1 = By.xpath("//input[contains(@name,'addressLine1')]");
	private By cmpAddressLine2 = By.xpath("//input[contains(@name,'addressLine2')]");
	private By cmpCity = By.xpath("//input[contains(@name,'city')]");
	private By cmpState = By.xpath("//input[contains(@name,'state')]");
	private By cmpPostalCode = By.xpath("//input[contains(@name,'postalCode')]");
	private By cmpCountry = By.xpath("//input[contains(@name,'country')]");
	private By slcFromEmployeer = By.xpath("//div[@class='chosen-container chosen-container-single']");
	private By cmpFromEmployeer = By.xpath("//input[contains(@autocomplete,'off')]");
	private By cmpResultFixter = By.xpath("//ul[@class='chosen-results']");
	private By cmpCreditLimit = By.xpath("//input[contains(@name,'creditLimit')]");
	private By cmpDeleted = By.xpath("//input[contains(@name,'deleted')]");
	private By btnSave = By.xpath("//button[@class='btn btn-secondary btn-success b10'][contains(.,'Save')]");
	private By lblMsg = By.xpath(
			"//div[@class='form-group gcrud-form-group'][contains(.,'Your data has been successfully stored into the database. Edit Customer or Go back to list')]");
	private By slcWitchVersion = By.xpath("//select[contains(@class,'switch-version')]");
	private By lnkGoBackToList = By.xpath("//a[contains(.,'Go back to list')]");
	private By chckSelectAllNone = By.xpath("//form//input[contains(@class,'select-all-none')]");
	private By btnDelete = By.xpath("//a[contains(@class,'btn btn-outline-dark delete-selected-button')]");
	private By chckSelectOne = By.xpath("//input[contains(@class,'select-row')]");
	private By alertDelete = By.xpath(
			"//p[@class='alert-delete-multiple-one'][contains(.,'Are you sure that you want to delete this 1 item?')]");
	private By btnDeletePopUP = By.xpath(
			"//div[@class='delete-multiple-confirmation modal fade in show']//button[@class='btn btn-danger delete-multiple-confirmation-button']");
	private By btnCancelPopUP = By
			.xpath("//div[@class='delete-multiple-confirmation modal fade in show']//button[contains(.,'Cancel')]");
	private By msgDeleteFromTheDatabase = By
			.xpath("//p[contains(.,'Your data has been successfully deleted from the database.')]");

	
	public By getCmpAddressLine1() {
		return cmpAddressLine1;
	}

	public By getCmpAddressLine2() {
		return cmpAddressLine2;
	}

	public By getCmpCity() {
		return cmpCity;
	}

	public By getCmpState() {
		return cmpState;
	}

	public By getCmpPostalCode() {
		return cmpPostalCode;
	}

	public By getCmpCountry() {
		return cmpCountry;
	}

	public By getCmpFromEmployeer() {
		return cmpFromEmployeer;
	}

	public By getSlcFromEmployeer() {
		return slcFromEmployeer;
	}

	public By getCmpCreditLimit() {
		return cmpCreditLimit;
	}

	public By getCmpcustomerName() {
		return cmpcustomerName;
	}

	public By getCmpcontactLastName() {
		return cmpcontactLastName;
	}

	public By getCmpcontactFirstName() {
		return cmpcontactFirstName;
	}

	public By getCmpphone() {
		return cmpphone;
	}

	public By getCmpResultFixter() {
		return cmpResultFixter;
	}

	public By getCmpDeleted() {
		return cmpDeleted;
	}

	public By getBtnSave() {
		return btnSave;
	}

	public By getLblMsg() {
		return lblMsg;
	}

	public By getSlcWitchVersion() {
		return slcWitchVersion;
	}

	public By getLnkGoBackToList() {
		return lnkGoBackToList;
	}

	public By getChckSelectAllNone() {
		return chckSelectAllNone;
	}

	public By getBtnDelete() {
		return btnDelete;
	}

	public By getAlertDelete() {
		return alertDelete;
	}

	public By getChckSelectOne() {
		return chckSelectOne;
	}

	public By getBtnDeletePopUP() {
		return btnDeletePopUP;
	}

	public By getBtnCancelPopUP() {
		return btnCancelPopUP;
	}

	public By getMsgDeleteFromTheDatabase() {
		return msgDeleteFromTheDatabase;
	}
}
