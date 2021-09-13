package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsCheck extends Baseclass{

	public DetailsCheck() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement continubtn;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getContinubtn() {
		return continubtn;
	}
	
}
