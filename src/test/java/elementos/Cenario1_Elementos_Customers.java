package elementos;

import org.openqa.selenium.By;

public class Cenario1_Elementos_Customers {

	private By slcWitchVersion = By.xpath("//select[contains(@class,'switch-version')]");
	private By btnAddCustumer = By.xpath("//a[@class='btn btn-default btn-outline-dark'][contains(.,'Add Customer')]");
	

	public By getSlcWitchVersion() {
		return slcWitchVersion;
	}

	public By getBtnAddCustumer() {
		return btnAddCustumer;
	}

}
