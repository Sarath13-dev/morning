package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmation extends Baseclass {

	public OrderConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_no")
	private WebElement orderno;


	public WebElement getOrderno() {
		return orderno;
	}
	
	
	
}
